package wroc.pwr.dao;

import wroc.pwr.model.Route;

public interface RouteDao {
	public void addRoute(Route route);
	public void removeRoute(Route route);
	public void updateRoute(Route route);
}
