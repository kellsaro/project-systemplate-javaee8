package kell.systemplate.restmodule.web.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import kell.systemplate.restmodule.web.rest.resource.GreetingsResource;

@javax.ws.rs.ApplicationPath("/rest")
public class JaxRsApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<>();
		// register root resource
		classes.add(GreetingsResource.class);
		return classes;
	}
}