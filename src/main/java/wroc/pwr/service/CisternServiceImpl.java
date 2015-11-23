package wroc.pwr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wroc.pwr.dao.CisternDao;
import wroc.pwr.model.Cistern;

@Service("cisternService")
@Transactional
public class CisternServiceImpl implements CisternService {

	@Autowired
	private CisternDao cisternDao;
	
	public void addCistern(Cistern cistern) {
		cisternDao.addCistern(cistern);
	}

	public void removeCisternById(int cisternId) {
		cisternDao.removeCisternById(cisternId);
	}

	public void updateCistern(Cistern cistern) {
		cisternDao.updateCistern(cistern);
	}

	public Cistern getCisternById(int cisternId) {
		return cisternDao.getCisternById(cisternId);
	}

	public List<Cistern> getListOfAllCisterns() {
		return cisternDao.getListOfAllCisterns();
	}
}
