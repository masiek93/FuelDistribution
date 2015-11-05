package wroc.pwr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Fuel;
@Repository
public class FuelDaoImpl implements FuelDao{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addFuel(Fuel fuel) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(fuel);
		
	}

	public void removeFuel(Fuel fuel) {
		// TODO Auto-generated method stub
		
	}

	public void updateFuel(Fuel fuel) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(fuel);		
		
	}

	
}
