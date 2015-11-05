package wroc.pwr.model;

import java.util.ArrayList;
import java.util.Collection;

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
	private Collection<GasStation> gasStationList = new ArrayList<GasStation>();
	private int distanceByTime;
	
	public Collection<GasStation> getGasStationList() {
		return gasStationList;
	}
	public void setGasStationList(Collection<GasStation> gasStationList) {
		this.gasStationList = gasStationList;
	}
	public int getDistanceByTime() {
		return distanceByTime;
	}
	public void setDistanceByTime(int distanceByTime) {
		this.distanceByTime = distanceByTime;
	}

}
