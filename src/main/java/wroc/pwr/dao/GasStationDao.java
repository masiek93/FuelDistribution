package wroc.pwr.dao;

import java.util.List;

import wroc.pwr.model.GasStation;

public interface GasStationDao {
	public void addGasStation(GasStation gasStation);
	public void removeGasStationById(int gasStationId);
	public void updateGasStation(GasStation gasStation);
	public GasStation getGasStationById(int gasStationId);
	public List<GasStation> getListOfAllGasStations();
}
