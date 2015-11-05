package wroc.pwr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Client;
@Repository
public class ClientDaoImpl implements ClientDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addClient(Client client) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(client);
		
	}

	public void removeClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	public void updateClient(Client client) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(client);		
		
	}

}
