/**
 * Base package for resources.
 * By convention, all resources ends with "Resource".
 * The structure of resources follows the REST architecture style
 * with canonical methods: index, show, n3w, create, edit, update, delete
 * Example: 
 * 
 * @Path("/users")
 * public class UserResources {
 * 
 * 	   @GET
 *     @Produces("application/json")
 *	   @Path("/index")
 *     public List<User> index(){ ... }
 *     
 *     @GET
 *     @Produces("application/json")
 *     @Path("/{id}")
 *     public User show(@Param Integer id){ ... }
 *     
 *     
 * }
 * 
 *  
 */
/**
 * @author kellsaro@gmail.com
 *
 */
package kell.systemplate.restmodule.web.rest.resource;

