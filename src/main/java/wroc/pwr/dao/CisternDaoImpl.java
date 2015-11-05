package wroc.pwr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Cistern;

@Repository
public class CisternDaoImpl implements CisternDao{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addCistern(Cistern cistern) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(cistern);
		
	}

	public void removeCistern(Cistern cistern) {
		// TODO Auto-generated method stub
		
	}

	public void updateCistern(Cistern cistern) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(cistern);		
		
	}

}
