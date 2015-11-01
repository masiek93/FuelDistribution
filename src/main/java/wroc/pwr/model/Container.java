package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTAINER")
public class Container {
	@Id @GeneratedValue
	private int containerId;
	private Cistern cistern;
	private Order order;
	private int capacity;
	private Fuel fuel;

	public Cistern getCistern() {
		return cistern;
	}
	public void setCistern(Cistern cistern) {
		this.cistern = cistern;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Fuel getFuel() {
		return fuel;
	}
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
}
