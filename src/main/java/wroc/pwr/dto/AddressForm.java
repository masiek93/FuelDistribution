package wroc.pwr.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class AddressForm {
	@NotBlank
	private String formStreetName;
	@NotNull
	private int formBuildingNumber; /* i assume that the buildingNumber is only number without any letters */
	@NotBlank
	@Pattern(regexp = "[0-9]{2}( |-)?[0-9]{3}", message = "Niepoprawny kod pocztowy")
	private String formPostalCode;
	@NotBlank
	private String formCity;
	
	public String getFormStreetName() {
		return formStreetName;
	}
	public void setFormStreetName(String formStreetName) {
		this.formStreetName = formStreetName;
	}
	public int getFormBuildingNumber() {
		return formBuildingNumber;
	}
	public void setFormBuildingNumber(int formBuildingNumber) {
		this.formBuildingNumber = formBuildingNumber;
	}

	public String getFormPostalCode() {
		return formPostalCode;
	}
	public void setFormPostalCode(String formPostalCode) {
		this.formPostalCode = formPostalCode;
	}
	public String getFormCity() {
		return formCity;
	}
	public void setFormCity(String formCity) {
		this.formCity = formCity;
	}
	
}
