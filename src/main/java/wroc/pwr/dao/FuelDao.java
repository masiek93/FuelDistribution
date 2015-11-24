package wroc.pwr.dao;

import java.util.List;

import wroc.pwr.model.Fuel;

public interface FuelDao {
	public void addFuel(Fuel fuel);
	public void removeFuelById(int fuelId);
	public void updateFuel(Fuel fuel);
	public Fuel getFuelById(int fuelId);
	public List<Fuel> getListOfAllFuel();
}
