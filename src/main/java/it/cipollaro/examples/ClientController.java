package it.cipollaro.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author a.cipollaro
 */

@RestController
public class ClientController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot CLient !!!";
    }
    
	@RequestMapping("/services")
	public List<String> services() {
		return this.discoveryClient.getServices();
	}

}
