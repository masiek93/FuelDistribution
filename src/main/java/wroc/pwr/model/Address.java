package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {
	@Id @GeneratedValue
	private int addressId;
	private String streetName;
	private int buildingNumb; /* i assume that the buildingNumb is only number without any letters */
	private int postalCode;
	private String city;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getBuildingNumb() {
		return buildingNumb;
	}

	public void setBuildingNumb(int buildingNumb) {
		this.buildingNumb = buildingNumb;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
