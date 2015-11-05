package wroc.pwr.dao;

import wroc.pwr.model.Cistern;

public interface CisternDao {
	public void addCistern(Cistern cistern);
	public void removeCistern(Cistern cistern);
	public void updateCistern(Cistern cistern);
}
