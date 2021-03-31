package com.apidelivery.apidelivery.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apidelivery.apidelivery.Models.ClientModel;
import com.apidelivery.apidelivery.Services.ActivateClientService;


@Controller
public class ClientController {

	private ActivateClientService activateClientService;
	
	public ClientController(ActivateClientService activateClientService) {
		this.activateClientService = activateClientService;
		
		System.out.println("MyFirstController: "+activateClientService);
	}
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		ClientModel yuri = new ClientModel("Yuri", "ysodias@gmail.com", "999999999");
				
		activateClientService.active(yuri);
		
		return "Hello!";
	}
}
