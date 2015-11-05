package wroc.pwr.dao;

import wroc.pwr.model.Distance;

public interface DistanceDao {
	public void addDistance(Distance distance);
	public void removeDistance(Distance distance);
	public void updateDistance(Distance distance);
}
