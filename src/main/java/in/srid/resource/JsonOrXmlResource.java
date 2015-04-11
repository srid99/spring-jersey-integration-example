package in.srid.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.srid.model.Detail;
import in.srid.service.DetailService;

@Path("/")
@Component
// Spring @Component annotation needed for Spring dependency injection. We don't want to use the Jersey DI.
public class JsonOrXmlResource {

    private final DetailService detailService;

    @Autowired
    public JsonOrXmlResource(final DetailService detailService) {
        this.detailService = detailService;
    }

    @GET
    @Produces({ MediaType.TEXT_XML, MediaType.APPLICATION_JSON })
    public Detail detail() {
        return detailService.getDetail();
    }
}
