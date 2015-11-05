package wroc.pwr.dao;

import wroc.pwr.model.GasStation;

public interface GasStationDao {
	public void addGasStation(GasStation gasStation);
	public void removeGasStation(GasStation gasStation);
	public void updateGasStation(GasStation gasStation);
}
