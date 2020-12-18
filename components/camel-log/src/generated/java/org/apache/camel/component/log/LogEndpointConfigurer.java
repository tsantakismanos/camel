/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.log;

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
public class LogEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        LogEndpoint target = (LogEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "exchangeformatter":
        case "exchangeFormatter": target.setExchangeFormatter(property(camelContext, org.apache.camel.spi.ExchangeFormatter.class, value)); return true;
        case "groupactiveonly":
        case "groupActiveOnly": target.setGroupActiveOnly(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "groupdelay":
        case "groupDelay": target.setGroupDelay(property(camelContext, java.lang.Long.class, value)); return true;
        case "groupinterval":
        case "groupInterval": target.setGroupInterval(property(camelContext, java.lang.Long.class, value)); return true;
        case "groupsize":
        case "groupSize": target.setGroupSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "level": target.setLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "logmask":
        case "logMask": target.setLogMask(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "marker": target.setMarker(property(camelContext, java.lang.String.class, value)); return true;
        case "maxchars":
        case "maxChars": target.setMaxChars(property(camelContext, int.class, value)); return true;
        case "multiline": target.setMultiline(property(camelContext, boolean.class, value)); return true;
        case "showall":
        case "showAll": target.setShowAll(property(camelContext, boolean.class, value)); return true;
        case "showbody":
        case "showBody": target.setShowBody(property(camelContext, boolean.class, value)); return true;
        case "showbodytype":
        case "showBodyType": target.setShowBodyType(property(camelContext, boolean.class, value)); return true;
        case "showcaughtexception":
        case "showCaughtException": target.setShowCaughtException(property(camelContext, boolean.class, value)); return true;
        case "showexception":
        case "showException": target.setShowException(property(camelContext, boolean.class, value)); return true;
        case "showexchangeid":
        case "showExchangeId": target.setShowExchangeId(property(camelContext, boolean.class, value)); return true;
        case "showexchangepattern":
        case "showExchangePattern": target.setShowExchangePattern(property(camelContext, boolean.class, value)); return true;
        case "showfiles":
        case "showFiles": target.setShowFiles(property(camelContext, boolean.class, value)); return true;
        case "showfuture":
        case "showFuture": target.setShowFuture(property(camelContext, boolean.class, value)); return true;
        case "showheaders":
        case "showHeaders": target.setShowHeaders(property(camelContext, boolean.class, value)); return true;
        case "showproperties":
        case "showProperties": target.setShowProperties(property(camelContext, boolean.class, value)); return true;
        case "showstacktrace":
        case "showStackTrace": target.setShowStackTrace(property(camelContext, boolean.class, value)); return true;
        case "showstreams":
        case "showStreams": target.setShowStreams(property(camelContext, boolean.class, value)); return true;
        case "skipbodylineseparator":
        case "skipBodyLineSeparator": target.setSkipBodyLineSeparator(property(camelContext, boolean.class, value)); return true;
        case "style": target.setStyle(property(camelContext, org.apache.camel.support.processor.DefaultExchangeFormatter.OutputStyle.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "exchangeformatter":
        case "exchangeFormatter": return org.apache.camel.spi.ExchangeFormatter.class;
        case "groupactiveonly":
        case "groupActiveOnly": return java.lang.Boolean.class;
        case "groupdelay":
        case "groupDelay": return java.lang.Long.class;
        case "groupinterval":
        case "groupInterval": return java.lang.Long.class;
        case "groupsize":
        case "groupSize": return java.lang.Integer.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "level": return java.lang.String.class;
        case "logmask":
        case "logMask": return java.lang.Boolean.class;
        case "marker": return java.lang.String.class;
        case "maxchars":
        case "maxChars": return int.class;
        case "multiline": return boolean.class;
        case "showall":
        case "showAll": return boolean.class;
        case "showbody":
        case "showBody": return boolean.class;
        case "showbodytype":
        case "showBodyType": return boolean.class;
        case "showcaughtexception":
        case "showCaughtException": return boolean.class;
        case "showexception":
        case "showException": return boolean.class;
        case "showexchangeid":
        case "showExchangeId": return boolean.class;
        case "showexchangepattern":
        case "showExchangePattern": return boolean.class;
        case "showfiles":
        case "showFiles": return boolean.class;
        case "showfuture":
        case "showFuture": return boolean.class;
        case "showheaders":
        case "showHeaders": return boolean.class;
        case "showproperties":
        case "showProperties": return boolean.class;
        case "showstacktrace":
        case "showStackTrace": return boolean.class;
        case "showstreams":
        case "showStreams": return boolean.class;
        case "skipbodylineseparator":
        case "skipBodyLineSeparator": return boolean.class;
        case "style": return org.apache.camel.support.processor.DefaultExchangeFormatter.OutputStyle.class;
        case "synchronous": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        LogEndpoint target = (LogEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "exchangeformatter":
        case "exchangeFormatter": return target.getExchangeFormatter();
        case "groupactiveonly":
        case "groupActiveOnly": return target.getGroupActiveOnly();
        case "groupdelay":
        case "groupDelay": return target.getGroupDelay();
        case "groupinterval":
        case "groupInterval": return target.getGroupInterval();
        case "groupsize":
        case "groupSize": return target.getGroupSize();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "level": return target.getLevel();
        case "logmask":
        case "logMask": return target.getLogMask();
        case "marker": return target.getMarker();
        case "maxchars":
        case "maxChars": return target.getMaxChars();
        case "multiline": return target.isMultiline();
        case "showall":
        case "showAll": return target.isShowAll();
        case "showbody":
        case "showBody": return target.isShowBody();
        case "showbodytype":
        case "showBodyType": return target.isShowBodyType();
        case "showcaughtexception":
        case "showCaughtException": return target.isShowCaughtException();
        case "showexception":
        case "showException": return target.isShowException();
        case "showexchangeid":
        case "showExchangeId": return target.isShowExchangeId();
        case "showexchangepattern":
        case "showExchangePattern": return target.isShowExchangePattern();
        case "showfiles":
        case "showFiles": return target.isShowFiles();
        case "showfuture":
        case "showFuture": return target.isShowFuture();
        case "showheaders":
        case "showHeaders": return target.isShowHeaders();
        case "showproperties":
        case "showProperties": return target.isShowProperties();
        case "showstacktrace":
        case "showStackTrace": return target.isShowStackTrace();
        case "showstreams":
        case "showStreams": return target.isShowStreams();
        case "skipbodylineseparator":
        case "skipBodyLineSeparator": return target.isSkipBodyLineSeparator();
        case "style": return target.getStyle();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}
