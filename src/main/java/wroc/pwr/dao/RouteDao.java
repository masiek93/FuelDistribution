package wroc.pwr.dao;

import java.util.List;

import wroc.pwr.model.Route;

public interface RouteDao {
	public void addRoute(Route route);
	public void removeRouteById(int routeId);
	public void updateRoute(Route route);
	public Route getRouteById(int routeId);
	public List<Route> getListOfAllRoutes();
}
