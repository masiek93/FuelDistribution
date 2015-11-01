package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER")
public class Order {
	@Id @GeneratedValue
	private int orderId;
	private GasStation gasStation;
	private Fuel fuel;
	private int status; // -2 -> ToDO | 0 -> DOING | 5 -> DONE
	// private DateType date; muszę znaleźć klasę do zapisywania daty
	public GasStation getGasStation() {
		return gasStation;
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
