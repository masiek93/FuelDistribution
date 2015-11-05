package wroc.pwr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Route;
@Repository
public class RouteDaoImpl implements RouteDao{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addRoute(Route route) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(route);
		
	}

	public void removeRoute(Route route) {
		// TODO Auto-generated method stub
		
	}

	public void updateRoute(Route route) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(route);		
		
	}

	
}
