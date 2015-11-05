package wroc.pwr.dao;

import wroc.pwr.model.Address;

public interface AddressDao {
	public void addAddress(Address address);
	public void removeAddress(Address address);
	public void updateAddress(Address address);
}
