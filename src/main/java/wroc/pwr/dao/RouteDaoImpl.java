package wroc.pwr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Route;
@Repository
public class RouteDaoImpl implements RouteDao{
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void addRoute(Route route) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(route);	
	}

	public void updateRoute(Route route) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(route);		
	}

	public void removeRouteById(int routeId) {
		Session session = this.sessionFactory.getCurrentSession();
		Route route = (Route) session.get(Route.class, routeId);
		if(null != route){
			session.delete(route);
		}
	}

	public Route getRouteById(int routeId) {
		Session session = this.sessionFactory.getCurrentSession();
		Route route = (Route) session.get(Route.class, routeId);
		return route;
	}

	@SuppressWarnings("unchecked")
	public List<Route> getListOfAllRoutes() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Route> routeList = (List<Route>) session.createQuery("from Route").list();
		return routeList;
	}

	
}
