package wroc.pwr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wroc.pwr.dao.AddressDao;
import wroc.pwr.model.Address;

@Service("addressService")
@Transactional
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDao addressDao;
	
	public void addAddress(Address address) {
		addressDao.addAddress(address);
	}

	public void removeAddressById(int addressId) {
		addressDao.removeAddressById(addressId);
	}

	public void updateAddress(Address address) {
		addressDao.updateAddress(address);
		// Chyba do poprawy
	}

	public Address getAddressById(int addressId) {
		return addressDao.getAddressById(addressId);
	}

	public List<Address> getListOfAllAddresses() {
		return addressDao.getListOfAllAddresses();
	}

}
