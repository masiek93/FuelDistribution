package wroc.pwr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Distance;
@Repository
public class DistanceDaoImpl implements DistanceDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void addDistance(Distance distance) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(distance);
	}

	public void updateDistance(Distance distance) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(distance);		
	}

	public void removeDistanceById(int distanceId) {
		Session session = this.sessionFactory.getCurrentSession();
		Distance distance = (Distance) session.get(Distance.class, distanceId);
		if(null != distance){
			session.delete(distance);
		}
	}

	public Distance getDistanceById(int distanceId) {
		Session session = this.sessionFactory.getCurrentSession();
		Distance distance = (Distance) session.get(Distance.class, distanceId);
		return distance;
	}

	@SuppressWarnings("unchecked")
	public List<Distance> getListOfAllDistances() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Distance> distanceList = (List<Distance>) session.createQuery("from Distance").list();
		return distanceList;
	}
}
