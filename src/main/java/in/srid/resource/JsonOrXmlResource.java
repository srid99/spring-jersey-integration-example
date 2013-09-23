package in.srid.resource;

import in.srid.model.Detail;
import in.srid.service.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path( "/" )
@Component
// Using @Component to make sure this class is spring singleton
public class JsonOrXmlResource {

    private Service service;

    @Autowired
    public JsonOrXmlResource(final Service service) {
        this.service = service;
    }

    @GET
    @Produces( { MediaType.TEXT_XML , MediaType.APPLICATION_JSON } )
    public Detail detail() {
        return service.getDetail();
    }
}
