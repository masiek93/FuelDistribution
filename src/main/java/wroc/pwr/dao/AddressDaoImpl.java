package wroc.pwr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Address;

@Repository
public class AddressDaoImpl implements AddressDao{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addAddress(Address address) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(address);
	}

	public void removeAddress(Address address) {
		// TODO Auto-generated method stub
		
	}

	public void updateAddress(Address address) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(address);		
	}

}
