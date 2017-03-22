package py.edu.facitec.ejemplo2017.dao;
/**
 *  gabriel
 */
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.ejemplo2017.model.Cliente;

//indicamos a spring que se trata de una clase
//que manupula datos
@Repository
public class ClienteDao {
	
	//Gestionar el estado y persistencia
	//las entidades
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Cliente cliente){
		manager.persist(cliente);
	}
	
	
}
