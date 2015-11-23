package wroc.pwr.service;

import java.util.List;

import wroc.pwr.model.Container;

public interface ContainerService {
	public void addContainer(Container container);
	public void removeContainerById(int containerId);
	public void updateContainer(Container container);
	public Container getContainerById(int containerId);
	public List<Container> getListOfAllContainers();
}
