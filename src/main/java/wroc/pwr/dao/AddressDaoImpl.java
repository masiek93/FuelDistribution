package wroc.pwr.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wroc.pwr.model.Address;

@Repository
public class AddressDaoImpl implements AddressDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void addAddress(Address address) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(address);
	}

	public void removeAddressById(int addressId) {
		Session session = this.sessionFactory.getCurrentSession();
		Address address = (Address) session.get(Address.class, addressId);
		if (null != address) {
			session.delete(address);
		}
	}

	public void updateAddress(Address address) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(address);
	}

	public Address getAddressById(int addressId) {
		Session session = this.sessionFactory.getCurrentSession();
		Address address = (Address) session.get(Address.class, addressId);
		return address;
	}

	@SuppressWarnings("unchecked")
	public List<Address> getListOfAllAddresses() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Address> addressList = (List<Address>) session.createQuery("from Address").list();
		return addressList;
	}

}
