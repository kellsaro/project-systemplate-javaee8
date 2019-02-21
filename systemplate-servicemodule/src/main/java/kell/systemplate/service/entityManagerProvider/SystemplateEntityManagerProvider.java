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
	
	@PersistenceContext(unitName="systemplate-servicemodule")
	private EntityManager em;
	
	public EntityManager getEntityManager() {
		return em;
	}
}