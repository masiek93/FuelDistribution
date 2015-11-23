package wroc.pwr.dao;

import java.util.List;

import wroc.pwr.model.Container;

public interface ContainerDao {
	public void addContainer(Container container);
	public void removeContainerById(int containerId);
	public void updateContainer(Container container);
	public Container getContainerById(int containerId);
	public List<Container> getListOfAllContainers();
}
