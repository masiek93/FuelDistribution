package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DISTANCE")
public class Distance {
	@Id @GeneratedValue
	private int distanceId;
	@OneToMany
	private GasStation gasStation;
	private int distanceByTime;
	
	public GasStation getGasStation() {
		return gasStation;
	}
	public void setGasStation(GasStation gasStation) {
		this.gasStation = gasStation;
	}
	public int getDistanceByTime() {
		return distanceByTime;
	}
	public void setDistanceByTime(int distanceByTime) {
		this.distanceByTime = distanceByTime;
	}

}
