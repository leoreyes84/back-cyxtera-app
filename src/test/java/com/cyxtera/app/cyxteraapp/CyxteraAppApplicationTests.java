package com.cyxtera.app.cyxteraapp;

import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cyxtera.app.cyxteraapp.services.ClientService;
import com.cyxtera.app.cyxteraapp.to.Client;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CyxteraAppApplicationTests {
	
	@Autowired
	private ClientService clientService;

//	@Test
//	public void contextLoads() {
//	}
	
	@Test
	public void getAllClients() {
		int expectedListSize = 2;
		List<Client> listClients = clientService.findAll();
		Assert.assertEquals(
		        "findAll() should return "+ expectedListSize +" results",
		        expectedListSize,
		        listClients.size());
		
	}
	
	@Test
	public void saveClient() {
		int expectedListSize = 3;
		Client c1 = new Client();
		c1.setSharedKey("pTest");
		c1.setBusinessID("Pedro Test");
		c1.setEmail("ptest@gmail.com");
		c1.setPhone("3120000000");
		c1.setDateAdd(Calendar.getInstance());
		c1.setEnrolledQty("2");
		c1.setMaxDevices(2);
		c1.setLastConnection(Calendar.getInstance());
		c1.setStatus("Active");
		System.out.println("lreyes Antes de salvar");
		List<Client> listClients = clientService.save(c1);
		System.out.println("lreyes "+listClients.size());
		
		Assert.assertEquals(
		        "save() should return "+ expectedListSize +" results",
		        expectedListSize,
		        listClients.size());
		
	}
	
	@Test
	public void findBySharedKey() {
		int expectedListSize = 1;
		String sharedKey = "jgutierrez";
		List<Client> listClients = clientService.findBySharedKey(sharedKey);
		
		Assert.assertNotNull("List shouldn't be null", listClients);
		
		Assert.assertEquals(
		        "findBySharedKey() should return "+ expectedListSize +" results",
		        expectedListSize,
		        listClients.size());
		
		Assert.assertEquals(
		        "findBySharedKey() should return "+ sharedKey +" as client",
		        sharedKey,
		        listClients.get(0).getSharedKey());
		
		
			
	}

}
