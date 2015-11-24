package wroc.pwr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.GasStation;
@Repository
public class GasStationDaoImpl implements GasStationDao{
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void addGasStation(GasStation gasStation) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(gasStation);	
	}

	public void updateGasStation(GasStation gasStation) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(gasStation);		
	}

	public void removeGasStationById(int gasStationId) {
		Session session = this.sessionFactory.getCurrentSession();
		GasStation gasStation = (GasStation) session.get(GasStation.class, gasStationId);
		if(null != gasStation){
			session.delete(gasStation);
		}
	}

	public GasStation getGasStationById(int gasStationId) {
		Session session = this.sessionFactory.getCurrentSession();
		GasStation gasStation = (GasStation) session.get(GasStation.class, gasStationId);
		return gasStation;
	}

	@SuppressWarnings("unchecked")
	public List<GasStation> getListOfAllGasStations() {
		Session session = this.sessionFactory.getCurrentSession();
		List<GasStation> gasStationList = (List<GasStation>) session.createQuery("from Gas_Station").list();
		return gasStationList;
	}

}
