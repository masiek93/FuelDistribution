package wroc.pwr.dao;

import wroc.pwr.model.Container;

public interface ContainerDao {
	public void addContainer(Container container);
	public void removeContainer(Container container);
	public void updateContainer(Container container);
}
