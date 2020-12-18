/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.language.joor;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class JoorPreCompileFalseTest extends CamelTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                JoorLanguage joor = (JoorLanguage) context.resolveLanguage("joor");
                joor.setPreCompile(false);

                from("direct:start")
                        .transform().joor("resource:file:target/update.joor")
                        .to("mock:result");
            }
        };
    }

    @Test
    public void testPreCompileFalse() throws Exception {
        template.sendBodyAndHeader("file:target?fileExist=Override", "'Hello ' + body", Exchange.FILE_NAME, "update.joor");

        getMockEndpoint("mock:result").expectedBodiesReceived("Hello World", "Hello Camel");
        template.sendBody("direct:start", "World");
        template.sendBody("direct:start", "Camel");

        assertMockEndpointsSatisfied();

        // update file
        resetMocks();

        template.sendBodyAndHeader("file:target?fileExist=Override", "'Bye ' + body", Exchange.FILE_NAME, "update.joor");

        getMockEndpoint("mock:result").expectedBodiesReceived("Bye World", "Bye Camel");

        template.sendBody("direct:start", "World");
        template.sendBody("direct:start", "Camel");

        assertMockEndpointsSatisfied();
    }

}