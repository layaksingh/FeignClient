/*package feign.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import feign.client.service.FeignClientService;

@Controller
public class FeignClientController {

	@Autowired
	FeignClientService clientService;
	
	public void getCurrency(){
		System.out.println("in the feign client cotroller");
		try {
			clientService.getCurrency();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
*/