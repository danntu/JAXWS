package annotation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.File;

@Path("/files")
public class FileDownloadService {
    private static final String FILE_PATH = "/home/mdaniyar/test.wsdl";
    @GET
    @Path("/txt")
    @Produces("text/plain")
    public Response getFile(){
        File file = new File(FILE_PATH);
        Response.ResponseBuilder responseBuilder = Response.ok((Object)file);
        responseBuilder.header("Content-Disposition","attachment;filename=\"test_file.wsdl\"");
        return responseBuilder.build();
    }
}
