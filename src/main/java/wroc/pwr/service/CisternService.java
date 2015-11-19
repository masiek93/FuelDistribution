package wroc.pwr.service;

import java.util.List;

import wroc.pwr.model.Cistern;

public interface CisternService {
	public void addCistern(Cistern cistern);
	public void removeCisternById(int cisternId);
	public void updateCistern(Cistern cistern);
	public Cistern getCisternById(int cisternId);
	public List<Cistern> getListOfAllCisterns();
}
