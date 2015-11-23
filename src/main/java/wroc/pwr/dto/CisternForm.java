package wroc.pwr.dto;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class CisternForm {

	@NotBlank
	private String formCisternName;
	
	@Range(min=1, max=2)
	private int formCisternType;

	public String getFormCisternName() {
		return formCisternName;
	}

	public void setFormCisternName(String formCisternName) {
		this.formCisternName = formCisternName;
	}

	public int getFormCisternType() {
		return formCisternType;
	}

	public void setFormCisternType(int formCisternType) {
		this.formCisternType = formCisternType;
	}


	
}
