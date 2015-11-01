package wroc.pwr.model;

import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROUTE")
public class Route {
	@Id @GeneratedValue
	private int routeId;
	private Cistern cistern;
	private LinkedList<Distance> listOfDistances;
	
	public Cistern getCistern() {
		return cistern;
	}
	public void setCistern(Cistern cistern) {
		this.cistern = cistern;
	}
	public LinkedList<Distance> getListOfDistances() {
		return listOfDistances;
	}
	public void setListOfDistances(LinkedList<Distance> listOfDistances) {
		this.listOfDistances = listOfDistances;
	}
}
