package wroc.pwr.dao;

import java.util.List;

import wroc.pwr.model.Order;

public interface OrderDao {
	public void addOrder(Order order);
	public void removeOrderById(int orderId);
	public void updateOrder(Order order);
	public Order getOrderById(int orderId);
	public List<Order> getLostOfAllOrders();
}
