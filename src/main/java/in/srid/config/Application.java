package in.srid.config;

import in.srid.resource.JsonOrXmlResource;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class Application extends ResourceConfig {

    public Application() {
        register( RequestContextFilter.class );
        register( JsonOrXmlResource.class );
        register( JacksonFeature.class );
    }
}
