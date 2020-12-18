/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elasticsearch;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ElasticsearchEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ElasticsearchEndpoint target = (ElasticsearchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "disconnect": target.getConfiguration().setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "enablessl":
        case "enableSSL": target.getConfiguration().setEnableSSL(property(camelContext, boolean.class, value)); return true;
        case "enablesniffer":
        case "enableSniffer": target.getConfiguration().setEnableSniffer(property(camelContext, boolean.class, value)); return true;
        case "from": target.getConfiguration().setFrom(property(camelContext, java.lang.Integer.class, value)); return true;
        case "hostaddresses":
        case "hostAddresses": target.getConfiguration().setHostAddresses(property(camelContext, java.lang.String.class, value)); return true;
        case "indexname":
        case "indexName": target.getConfiguration().setIndexName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxretrytimeout":
        case "maxRetryTimeout": target.getConfiguration().setMaxRetryTimeout(property(camelContext, int.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.elasticsearch.ElasticsearchOperation.class, value)); return true;
        case "scrollkeepalivems":
        case "scrollKeepAliveMs": target.getConfiguration().setScrollKeepAliveMs(property(camelContext, int.class, value)); return true;
        case "size": target.getConfiguration().setSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": target.getConfiguration().setSniffAfterFailureDelay(property(camelContext, int.class, value)); return true;
        case "snifferinterval":
        case "snifferInterval": target.getConfiguration().setSnifferInterval(property(camelContext, int.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": target.getConfiguration().setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "usescroll":
        case "useScroll": target.getConfiguration().setUseScroll(property(camelContext, boolean.class, value)); return true;
        case "waitforactiveshards":
        case "waitForActiveShards": target.getConfiguration().setWaitForActiveShards(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "disconnect": return boolean.class;
        case "enablessl":
        case "enableSSL": return boolean.class;
        case "enablesniffer":
        case "enableSniffer": return boolean.class;
        case "from": return java.lang.Integer.class;
        case "hostaddresses":
        case "hostAddresses": return java.lang.String.class;
        case "indexname":
        case "indexName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxretrytimeout":
        case "maxRetryTimeout": return int.class;
        case "operation": return org.apache.camel.component.elasticsearch.ElasticsearchOperation.class;
        case "scrollkeepalivems":
        case "scrollKeepAliveMs": return int.class;
        case "size": return java.lang.Integer.class;
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": return int.class;
        case "snifferinterval":
        case "snifferInterval": return int.class;
        case "sockettimeout":
        case "socketTimeout": return int.class;
        case "synchronous": return boolean.class;
        case "usescroll":
        case "useScroll": return boolean.class;
        case "waitforactiveshards":
        case "waitForActiveShards": return int.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ElasticsearchEndpoint target = (ElasticsearchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "connectiontimeout":
        case "connectionTimeout": return target.getConfiguration().getConnectionTimeout();
        case "disconnect": return target.getConfiguration().isDisconnect();
        case "enablessl":
        case "enableSSL": return target.getConfiguration().isEnableSSL();
        case "enablesniffer":
        case "enableSniffer": return target.getConfiguration().isEnableSniffer();
        case "from": return target.getConfiguration().getFrom();
        case "hostaddresses":
        case "hostAddresses": return target.getConfiguration().getHostAddresses();
        case "indexname":
        case "indexName": return target.getConfiguration().getIndexName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxretrytimeout":
        case "maxRetryTimeout": return target.getConfiguration().getMaxRetryTimeout();
        case "operation": return target.getConfiguration().getOperation();
        case "scrollkeepalivems":
        case "scrollKeepAliveMs": return target.getConfiguration().getScrollKeepAliveMs();
        case "size": return target.getConfiguration().getSize();
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": return target.getConfiguration().getSniffAfterFailureDelay();
        case "snifferinterval":
        case "snifferInterval": return target.getConfiguration().getSnifferInterval();
        case "sockettimeout":
        case "socketTimeout": return target.getConfiguration().getSocketTimeout();
        case "synchronous": return target.isSynchronous();
        case "usescroll":
        case "useScroll": return target.getConfiguration().isUseScroll();
        case "waitforactiveshards":
        case "waitForActiveShards": return target.getConfiguration().getWaitForActiveShards();
        default: return null;
        }
    }
}
