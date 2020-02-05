/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.chatscript;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ChatScriptEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "chatUserName": ((ChatScriptEndpoint) target).setChatUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((ChatScriptEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "resetChat": ((ChatScriptEndpoint) target).setResetChat(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((ChatScriptEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((ChatScriptEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "chatusername": ((ChatScriptEndpoint) target).setChatUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((ChatScriptEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "resetchat": ((ChatScriptEndpoint) target).setResetChat(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((ChatScriptEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((ChatScriptEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
