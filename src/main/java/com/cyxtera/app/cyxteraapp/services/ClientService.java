package com.cyxtera.app.cyxteraapp.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cyxtera.app.cyxteraapp.interfaces.IClient;
import com.cyxtera.app.cyxteraapp.to.Client;

@Component
public class ClientService implements IClient {

	Logger logger = LoggerFactory.getLogger(ClientService.class);

	private List<Client> listClients;

	@Override
	public List<Client> findAll() {
		return this.getTotalList();
	}

	@Override
	public List<Client> findBySharedKey(String sharedKey) {
		logger.info("Info finding sharedKey: " + sharedKey);
		List<Client> listTemp = new ArrayList<>();
		for (Client client : this.getTotalList()) {
			if (client.getSharedKey().equals(sharedKey)) {
				listTemp.add(client);
			}
		}
		return listTemp;
	}

	@Override
	public List<Client> save(Client client) {
		try {
			logger.info("Info saving: " + client);
			if(this.listClients == null) {
				this.listClients = getTotalList();
			}
			this.listClients.add(client);
			return this.listClients;
		} catch (Exception ex) {
			logger.error("Error saving: " + client + " ", ex);
		}
		return null;
	}

	private List<Client> getTotalList() {

		this.listClients = new ArrayList<>();

		Client c1 = new Client();
		c1.setSharedKey("jgutierrez");
		c1.setBusinessID("Juan Gutierrez");
		c1.setEmail("jgutierrea@gmail.com");
		c1.setPhone("312487965");
		c1.setDateAdd(Calendar.getInstance());
		c1.setEnrolledQty("2");
		c1.setMaxDevices(2);
		c1.setLastConnection(Calendar.getInstance());
		c1.setStatus("Active");

		Client c2 = new Client();
		c2.setSharedKey("dcastaneda");
		c2.setBusinessID("David Castañeda");
		c2.setEmail("dcastaneda@gmail.com");
		c2.setPhone("3121564385");
		c2.setDateAdd(Calendar.getInstance());
		c2.setEnrolledQty("2");
		c2.setMaxDevices(2);
		c2.setLastConnection(Calendar.getInstance());
		c2.setStatus("Active");

		listClients.add(c1);
		listClients.add(c2);

		return listClients;

	}

}
