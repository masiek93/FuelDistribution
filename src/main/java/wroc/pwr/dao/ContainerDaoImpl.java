package wroc.pwr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Container;
@Repository
public class ContainerDaoImpl implements ContainerDao{
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void addContainer(Container container) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(container);
		
	}

	public void updateContainer(Container container) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(container);		
		
	}

	public Container getContainerById(int containerId) {
		Session session = this.sessionFactory.getCurrentSession();
		Container container = (Container) session.get(Container.class, containerId);
		return container;
	}

	public void removeContainerById(int containerId) {
		Session session = this.sessionFactory.getCurrentSession();
		Container container = (Container) session.get(Container.class, containerId);
		if (null != container) {
			session.delete(container);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Container> getListOfAllContainers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Container> containerList = (List<Container>) session.createQuery("from Container").list();
		return containerList;
	}

}
