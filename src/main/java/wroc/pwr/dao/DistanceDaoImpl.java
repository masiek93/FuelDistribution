package wroc.pwr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Distance;
@Repository
public class DistanceDaoImpl implements DistanceDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addDistance(Distance distance) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(distance);
		
	}

	public void removeDistance(Distance distance) {
		// TODO Auto-generated method stub
		
	}

	public void updateDistance(Distance distance) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(distance);		
		
	}
}
