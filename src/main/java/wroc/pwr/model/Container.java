package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTAINER")
public class Container {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int containerId;
	@ManyToOne
	private Cistern cistern;
	@OneToOne
	private Order order;
	private int capacity; /* in liters */
	private int status; /* 0 = empty | 1 = full */
	@OneToOne
	private Fuel fuel;

	public int getContainerId() {
		return containerId;
	}

	public void setContainerId(int containerId) {
		this.containerId = containerId;
	}
	
	public Container(){
		
	}
	
	public Container(Cistern cistern, int capacity, int status){
		this.cistern = cistern;
		this.capacity = capacity;
		this.status = status;
	}
	
	public Cistern getCistern() {
		return cistern;
	}
	public void setCistern(Cistern cistern) {
		this.cistern = cistern;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
