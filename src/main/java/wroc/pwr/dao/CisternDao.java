package wroc.pwr.dao;

import java.util.List;

import wroc.pwr.model.Cistern;

public interface CisternDao {
	public void addCistern(Cistern cistern);
	public void removeCisternById(int cisternId);
	public void updateCistern(Cistern cistern);
	public Cistern getCisternById(int cisternId);
	public List<Cistern> getListOfAllCisterns();
}
