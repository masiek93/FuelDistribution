package wroc.pwr.dao;

import wroc.pwr.model.Client;

public interface ClientDao {
	public void addClient(Client client);
	public void removeClient(Client client);
	public void updateClient(Client client);
}
