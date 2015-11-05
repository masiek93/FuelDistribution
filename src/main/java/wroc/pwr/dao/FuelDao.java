package wroc.pwr.dao;

import wroc.pwr.model.Fuel;

public interface FuelDao {
	public void addFuel(Fuel fuel);
	public void removeFuel(Fuel fuel);
	public void updateFuel(Fuel fuel);
}
