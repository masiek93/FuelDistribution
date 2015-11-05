package wroc.pwr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Container;
@Repository
public class ContainerDaoImpl implements ContainerDao{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addContainer(Container container) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(container);
		
	}

	public void removeContainer(Container container) {
		// TODO Auto-generated method stub
		
	}

	public void updateContainer(Container container) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(container);		
		
	}

}
