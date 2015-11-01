package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CISTERN")
public class Cistern {
	@Id @GeneratedValue
	private int cisternId;
	private String name;
	private int availableTime;
	private GasStation lastPosition;
	private int status; // -4 -> Available time > 0 | 0 -> Driving | 2 -> AvailableTime ~= 0 | 6 -> Can't work, driver need to take some sleep
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(int availableTime) {
		this.availableTime = availableTime;
	}
	public GasStation getLastPosition() {
		return lastPosition;
	}
	public void setLastPosition(GasStation lastPosition) {
		this.lastPosition = lastPosition;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
