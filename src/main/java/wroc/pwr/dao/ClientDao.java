package wroc.pwr.dao;

import java.util.List;

import wroc.pwr.model.Client;

public interface ClientDao {
	public void addClient(Client client);
	public void removeClientById(int clientId);
	public void updateClient(Client client);
	public Client getClientById(int clientId);
	public List<Client> getListOfAllClients();
}
