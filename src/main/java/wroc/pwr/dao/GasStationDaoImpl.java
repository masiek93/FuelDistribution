package wroc.pwr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.GasStation;
@Repository
public class GasStationDaoImpl implements GasStationDao{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addGasStation(GasStation gasStation) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(gasStation);
		
	}

	public void removeGasStation(GasStation gasStation) {
		// TODO Auto-generated method stub
		
	}

	public void updateGasStation(GasStation gasStation) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(gasStation);		
		
	}

}
