package wroc.pwr.dao;

import java.util.List;

import wroc.pwr.model.Address;

public interface AddressDao {
	public void addAddress(Address address);
	public void removeAddressById(int addressId);
	public void updateAddress(Address address);
	public Address getAddressById(int addressId);
	public List<Address> getListOfAllAddresses();
}
