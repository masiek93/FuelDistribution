package wroc.pwr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Order;
@Repository
public class OrderDaoImpl implements OrderDao{
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void addOrder(Order order) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(order);
		
	}

	public void updateOrder(Order order) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(order);			
	}

	public void removeOrderById(int orderId) {
		Session session = this.sessionFactory.getCurrentSession();
		Order order = (Order) session.get(Order.class, orderId);
		if(null != order){
			session.delete(order);
		}
	}

	public Order getOrderById(int orderId) {
		Session session = this.sessionFactory.getCurrentSession();
		Order order = (Order) session.get(Order.class, orderId);
		return order;
	}

	@SuppressWarnings("unchecked")
	public List<Order> getLostOfAllOrders() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Order> orderList = (List<Order>) session.createQuery("from Orders").list();
		return orderList;
	}

	
}
