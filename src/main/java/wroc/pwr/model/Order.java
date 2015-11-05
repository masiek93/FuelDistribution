package wroc.pwr.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER")
public class Order {
	@Id @GeneratedValue
	private int orderId;
	@OneToOne
	private GasStation gasStation;
	@OneToOne
	private Fuel fuel;
	private int status; // -2 -> ToDO | 0 -> DOING | 5 -> DONE
	private Date date;
	@ManyToOne
	private Client client;

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public GasStation getGasStation() {
		return gasStation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setGasStation(GasStation gasStation) {
		this.gasStation = gasStation;
	}
	public Fuel getFuel() {
		return fuel;
	}
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
