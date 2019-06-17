package com.cyxtera.app.cyxteraapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyxtera.app.cyxteraapp.interfaces.IClient;
import com.cyxtera.app.cyxteraapp.to.Client;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private IClient clientService;

	@RequestMapping(path = "/findAll")
	public List<Client> getAll() {
		return clientService.findAll();
	}

	@RequestMapping(path = "/findBySharedKey")
	public List<Client> findBySharedKey(@RequestParam(required = true) String sharedKey) {
		return clientService.findBySharedKey(sharedKey);
	}

	@PostMapping(path = "/save")
	public List<Client> save(@RequestBody(required = true) Client client) {
		return this.clientService.save(client);
	}

}
