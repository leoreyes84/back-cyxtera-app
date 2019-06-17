package com.cyxtera.app.cyxteraapp.interfaces;

import java.util.List;

import com.cyxtera.app.cyxteraapp.to.Client;

public interface IClient {

	List<Client> findAll();

	List<Client> findBySharedKey(String sharedKey);

	List<Client> save(Client client);

}
