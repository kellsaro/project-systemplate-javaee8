package kell.systemplate.restmodule.web.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/greetings")
public class GreetingsResource {

	@GET
    @Produces("text/plain")
	@Path("/hello")
	public String getHello() {
		return "Hello World!";
	}
}
