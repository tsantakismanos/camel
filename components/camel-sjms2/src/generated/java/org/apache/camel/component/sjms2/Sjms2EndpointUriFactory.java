/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms2;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class Sjms2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":destinationType:destinationName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(42);
        props.add("shared");
        props.add("reconnectBackOff");
        props.add("connectionCount");
        props.add("mapJmsMessage");
        props.add("synchronous");
        props.add("connectionResource");
        props.add("includeAllJMSXProperties");
        props.add("transacted");
        props.add("errorHandlerLogStackTrace");
        props.add("durable");
        props.add("bridgeErrorHandler");
        props.add("transactionBatchCount");
        props.add("jmsKeyFormatStrategy");
        props.add("headerFilterStrategy");
        props.add("exceptionListener");
        props.add("destinationName");
        props.add("messageCreatedStrategy");
        props.add("asyncStopListener");
        props.add("destinationType");
        props.add("asyncStartListener");
        props.add("persistent");
        props.add("allowNullBody");
        props.add("namedReplyTo");
        props.add("reconnectOnError");
        props.add("consumerCount");
        props.add("destinationCreationStrategy");
        props.add("exchangePattern");
        props.add("prefillPool");
        props.add("messageSelector");
        props.add("ttl");
        props.add("acknowledgementMode");
        props.add("transactionBatchTimeout");
        props.add("lazyStartProducer");
        props.add("transactionCommitStrategy");
        props.add("connectionFactory");
        props.add("producerCount");
        props.add("errorHandlerLoggingLevel");
        props.add("sharedJMSSession");
        props.add("durableSubscriptionId");
        props.add("subscriptionId");
        props.add("exceptionHandler");
        props.add("responseTimeOut");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "sjms2".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "destinationType", "queue", false, copy);
        uri = buildPathParameter(syntax, uri, "destinationName", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}
