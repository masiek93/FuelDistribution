package wroc.pwr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wroc.pwr.dao.ContainerDao;
import wroc.pwr.model.Container;

@Service("containerService")
@Transactional
public class ContainerServiceImpl implements ContainerService{

	@Autowired
	private ContainerDao containerDao;

	
	public void addContainer(Container container) {
		containerDao.addContainer(container);
	}

	public void removeContainerById(int containerId) {
		containerDao.removeContainerById(containerId);
	}

	public void updateContainer(Container container) {
		containerDao.updateContainer(container);		
	}

	public Container getContainerById(int containerId) {
		return containerDao.getContainerById(containerId);
	}

	public List<Container> getListOfAllContainers() {
		return containerDao.getListOfAllContainers();
	}

}
