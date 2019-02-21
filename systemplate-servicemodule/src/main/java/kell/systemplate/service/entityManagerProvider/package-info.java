/**
 * Package for entity manage provider, wich is a CDI bean
 * that can retrieve an entity manager. The reason for using
 * this CDI is trying to avoid the use of @PersistenceContext(unitName="UNIT_NAME")
 * wich is error prone because the use of the string in the unitName. 
 * Also if you have to change it you just have to update in one place. 
 * Commonly an appllication will have just one entity manager provider.
 * 
 * A typical entity manager provider will be like:

package kell.systemplate.service.entityManagerProvider;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
@RequestScoped
public class SystemplateEntityManagerProvider implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="UNIT_NAME")
	private EntityManager em;
	
	public EntityManager getEntityManager() {
		return em;
	}
}
 * 
 */
/**
 * @author maykell
 *
 */
package kell.systemplate.service.entityManagerProvider;
