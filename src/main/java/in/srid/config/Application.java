package in.srid.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import in.srid.resource.JsonOrXmlResource;

public class Application extends ResourceConfig {

    public Application() {
        register(RequestContextFilter.class);
        register(JsonOrXmlResource.class);
        register(JacksonFeature.class);
    }
}
