package wroc.pwr.model;

import java.util.LinkedList;

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
	private Distance distance;
	
	public Cistern getCistern() {
		return cistern;
	}
	public void setCistern(Cistern cistern) {
		this.cistern = cistern;
	}
	public Distance getDistance() {
		return distance;
	}
	public void setDistance(Distance distance) {
		this.distance = distance;
	}
}
