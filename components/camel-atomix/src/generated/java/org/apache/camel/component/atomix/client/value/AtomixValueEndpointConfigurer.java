/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.value;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtomixValueEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "atomix": ((AtomixValueEndpoint) target).getConfiguration().setAtomix(property(camelContext, io.atomix.Atomix.class, value)); return true;
        case "configurationUri": ((AtomixValueEndpoint) target).getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "defaultAction": ((AtomixValueEndpoint) target).getConfiguration().setDefaultAction(property(camelContext, org.apache.camel.component.atomix.client.value.AtomixValue.Action.class, value)); return true;
        case "nodes": ((AtomixValueEndpoint) target).getConfiguration().setNodes(property(camelContext, java.lang.String.class, value)); return true;
        case "resultHeader": ((AtomixValueEndpoint) target).getConfiguration().setResultHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "transportClassName": ((AtomixValueEndpoint) target).getConfiguration().setTransportClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": ((AtomixValueEndpoint) target).getConfiguration().setTtl(property(camelContext, long.class, value)); return true;
        case "bridgeErrorHandler": ((AtomixValueEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((AtomixValueEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((AtomixValueEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((AtomixValueEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((AtomixValueEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "defaultResourceConfig": ((AtomixValueEndpoint) target).getConfiguration().setDefaultResourceConfig(property(camelContext, java.util.Properties.class, value)); return true;
        case "defaultResourceOptions": ((AtomixValueEndpoint) target).getConfiguration().setDefaultResourceOptions(property(camelContext, java.util.Properties.class, value)); return true;
        case "ephemeral": ((AtomixValueEndpoint) target).getConfiguration().setEphemeral(property(camelContext, boolean.class, value)); return true;
        case "readConsistency": ((AtomixValueEndpoint) target).getConfiguration().setReadConsistency(property(camelContext, io.atomix.resource.ReadConsistency.class, value)); return true;
        case "resourceConfigs": ((AtomixValueEndpoint) target).getConfiguration().setResourceConfigs(property(camelContext, java.util.Map.class, value)); return true;
        case "resourceOptions": ((AtomixValueEndpoint) target).getConfiguration().setResourceOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "synchronous": ((AtomixValueEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "atomix": ((AtomixValueEndpoint) target).getConfiguration().setAtomix(property(camelContext, io.atomix.Atomix.class, value)); return true;
        case "configurationuri": ((AtomixValueEndpoint) target).getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "defaultaction": ((AtomixValueEndpoint) target).getConfiguration().setDefaultAction(property(camelContext, org.apache.camel.component.atomix.client.value.AtomixValue.Action.class, value)); return true;
        case "nodes": ((AtomixValueEndpoint) target).getConfiguration().setNodes(property(camelContext, java.lang.String.class, value)); return true;
        case "resultheader": ((AtomixValueEndpoint) target).getConfiguration().setResultHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "transportclassname": ((AtomixValueEndpoint) target).getConfiguration().setTransportClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": ((AtomixValueEndpoint) target).getConfiguration().setTtl(property(camelContext, long.class, value)); return true;
        case "bridgeerrorhandler": ((AtomixValueEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((AtomixValueEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((AtomixValueEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((AtomixValueEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((AtomixValueEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "defaultresourceconfig": ((AtomixValueEndpoint) target).getConfiguration().setDefaultResourceConfig(property(camelContext, java.util.Properties.class, value)); return true;
        case "defaultresourceoptions": ((AtomixValueEndpoint) target).getConfiguration().setDefaultResourceOptions(property(camelContext, java.util.Properties.class, value)); return true;
        case "ephemeral": ((AtomixValueEndpoint) target).getConfiguration().setEphemeral(property(camelContext, boolean.class, value)); return true;
        case "readconsistency": ((AtomixValueEndpoint) target).getConfiguration().setReadConsistency(property(camelContext, io.atomix.resource.ReadConsistency.class, value)); return true;
        case "resourceconfigs": ((AtomixValueEndpoint) target).getConfiguration().setResourceConfigs(property(camelContext, java.util.Map.class, value)); return true;
        case "resourceoptions": ((AtomixValueEndpoint) target).getConfiguration().setResourceOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "synchronous": ((AtomixValueEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
