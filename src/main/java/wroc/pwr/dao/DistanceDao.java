package wroc.pwr.dao;

import java.util.List;

import wroc.pwr.model.Distance;

public interface DistanceDao {
	public void addDistance(Distance distance);
	public void removeDistanceById(int distanceId);
	public void updateDistance(Distance distance);
	public Distance getDistanceById(int distanceId);
	public List<Distance> getListOfAllDistances();
}
