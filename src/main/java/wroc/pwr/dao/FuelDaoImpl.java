package wroc.pwr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Fuel;
@Repository
public class FuelDaoImpl implements FuelDao{
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void addFuel(Fuel fuel) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(fuel);	
	}

	public void updateFuel(Fuel fuel) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(fuel);		
	}

	public void removeFuelById(int fuelId) {
		Session session = this.sessionFactory.getCurrentSession();
		Fuel fuel = (Fuel) session.get(Fuel.class, fuelId);
		if(null != fuel){
			session.delete(fuel);
		}
	}

	public Fuel getFuelById(int fuelId) {
		Session session = this.sessionFactory.getCurrentSession();
		Fuel fuel = (Fuel) session.get(Fuel.class, fuelId);
		return fuel;
	}

	@SuppressWarnings("unchecked")
	public List<Fuel> getListOfAllFuel() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Fuel> fuelList = (List<Fuel>) session.createQuery("from Fuel").list();
		return fuelList;
	}

	
}
