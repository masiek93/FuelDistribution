package wroc.pwr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Order;
@Repository
public class OrderDaoImpl implements OrderDao{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addOrder(Order order) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(order);
		
	}

	public void removeOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	public void updateOrder(Order order) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(order);		
		
	}

	
}
