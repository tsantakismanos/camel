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
package org.apache.camel.component.undertow;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UndertowProducerContentTypeTest extends BaseUndertowTest {

    @Test
    public void testHttpContentTypeNotDuplicated() throws Exception {
        getMockEndpoint("mock:input").expectedHeaderReceived(Exchange.HTTP_METHOD, "POST");
        getMockEndpoint("mock:input").expectedHeaderReceived(Exchange.CONTENT_TYPE, "application/json");

        String out = template.requestBodyAndHeader("direct:start", "{ name: \"Donald\" }", Exchange.CONTENT_TYPE,
                "application/json", String.class);
        assertEquals("{ status: \"ok\" }", out);

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                restConfiguration()
                        .producerComponent("undertow").component("undertow")
                        .host("localhost").port("{{port}}")
                        .bindingMode(RestBindingMode.json);

                from("direct:start")
                        .to("rest:post:foo")
                        .to("mock:result");

                from("undertow:http://localhost:{{port}}/foo")
                        .to("log:input")
                        .to("mock:input")
                        .transform().constant("{ status: \"ok\" }");
            }
        };
    }
}
