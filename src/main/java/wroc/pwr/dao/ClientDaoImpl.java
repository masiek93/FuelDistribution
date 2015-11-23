package wroc.pwr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Client;
@Repository
public class ClientDaoImpl implements ClientDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void addClient(Client client) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(client);
		
	}

	public void updateClient(Client client) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(client);		
		
	}

	public void removeClientById(int clientId) {
		Session session = this.sessionFactory.getCurrentSession();
		Client client = (Client) session.get(Client.class, clientId);
		if(null != client){
			session.delete(client);
		}
	}

	public Client getClientById(int clientId) {
		Session session = this.sessionFactory.getCurrentSession();
		Client client = (Client) session.get(Client.class, clientId);
		return client;
	}

	@SuppressWarnings("unchecked")
	public List<Client> getListOfAllClients() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Client> clientList = (List<Client>) session.createQuery("from Client").list();
		return clientList;
	}

}
