package wroc.pwr.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CISTERN")
public class Cistern {
	@Id @GeneratedValue
	private int cisternId;
	private String name;
	@OneToMany
	private Collection<Container> containerList = new ArrayList<Container>();
	private int availableTime;
	@OneToOne
	private GasStation lastPosition;
	private int status; // -4 -> Available time > 0 | 0 -> Driving | 2 -> AvailableTime ~= 0 | 6 -> Can't work, driver need to take some sleep
	
	public Collection<Container> getContainerList() {
		return containerList;
	}
	public void setContainerList(Collection<Container> containerList) {
		this.containerList = containerList;
	}
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
