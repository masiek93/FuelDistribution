package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GAS_STATION") 
public class GasStation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gasStationId;
	private int name;
	@OneToOne
	private Address address;
	
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getGasStationId() {
		return gasStationId;
	}
	public void setGasStationId(int gasStationId) {
		this.gasStationId = gasStationId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
