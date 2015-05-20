package ejb;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Utilizador;

@Named
@RequestScoped
public class UtilizadorBean {

	private List<Utilizador> listaUsers;
	@Inject
	UtilizadorDAO userDao;

	public List<Utilizador> getListaUsers() {
		listaUsers = userDao.getListaUtilizadores();
		return listaUsers;
	}
	
	
	
}
