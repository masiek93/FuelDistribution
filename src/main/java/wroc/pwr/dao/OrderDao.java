package wroc.pwr.dao;

import wroc.pwr.model.Order;

public interface OrderDao {
	public void addOrder(Order order);
	public void removeOrder(Order order);
	public void updateOrder(Order order);
}
