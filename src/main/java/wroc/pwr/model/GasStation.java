package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GAS_STATION")
public class GasStation {
	@Id @GeneratedValue
	private int gasStationId;
	private int name;
	private Address address;
	
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
