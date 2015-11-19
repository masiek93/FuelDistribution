package wroc.pwr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Cistern;

@Repository
public class CisternDaoImpl implements CisternDao{
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void addCistern(Cistern cistern) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(cistern);
		
	}

	public void updateCistern(Cistern cistern) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(cistern);		
		
	}

	public void removeCisternById(int cisternId) {
		Session session = this.sessionFactory.getCurrentSession();
		Cistern cistern = (Cistern) session.get(Cistern.class, cisternId);
		if (null != cistern) {
			session.delete(cistern);
		}
		
	}

	public Cistern getCisternById(int cisternId) {
		Session session = this.sessionFactory.getCurrentSession();
		Cistern cistern = (Cistern) session.get(Cistern.class, cisternId);
		return cistern;
	}

	@SuppressWarnings("unchecked")
	public List<Cistern> getListOfAllCisterns() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Cistern> cisternList = (List<Cistern>) session.createQuery("from Cistern").list();
		return cisternList;
	}
}
