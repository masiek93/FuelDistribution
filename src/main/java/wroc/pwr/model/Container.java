package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTAINER")
public class Container {
	@Id @GeneratedValue
	private int containerId;
	@ManyToOne
	private Cistern cistern;
	@OneToOne
	private Order order;
	private int capacity;
	@OneToOne
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
