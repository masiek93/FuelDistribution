package wroc.pwr.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;
	private String name;
	private String lastName;
	private String email;
	private int phoneNumber;
	@OneToOne
	private Address address;
	@OneToMany
	private Collection<Order> orderList = new ArrayList<Order>();
	
	public Collection<Order> getOrderList() {
		return orderList;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public void setOrderList(Collection<Order> orderList) {
		this.orderList = orderList;
	}
	public String getName() {
		return name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
