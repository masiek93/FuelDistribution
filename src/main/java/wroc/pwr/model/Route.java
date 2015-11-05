package wroc.pwr.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ROUTE")
public class Route {
	@Id @GeneratedValue
	private int routeId;
	@OneToOne
	private Cistern cistern;
	@OneToMany
	private Collection<Distance> distanceList = new ArrayList<Distance>();
	
	public Cistern getCistern() {
		return cistern;
	}
	public void setCistern(Cistern cistern) {
		this.cistern = cistern;
	}
	public Collection<Distance> getDistanceList() {
		return distanceList;
	}
	public void setDistanceList(Collection<Distance> distanceList) {
		this.distanceList = distanceList;
	}

}
