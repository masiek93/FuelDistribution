package wroc.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISTANCE")
public class Distance {
	@Id @GeneratedValue
	private int distanceId;
	private GasStation startGasStation;
	private GasStation finalGasStation;
	private int distanceByTime;
	
	public GasStation getStartStation() {
		return startGasStation;
	}
	public void setStartStation(GasStation startStation) {
		this.startGasStation = startStation;
	}
	public GasStation getFinalStation() {
		return finalGasStation;
	}
	public void setFinalStation(GasStation finalStation) {
		this.finalGasStation = finalStation;
	}
	public int getDistanceByTime() {
		return distanceByTime;
	}
	public void setDistanceByTime(int distanceByTime) {
		this.distanceByTime = distanceByTime;
	}

}
