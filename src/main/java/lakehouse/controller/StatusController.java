package lakehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lakehouse.model.Status;
import lakehouse.service.StatusService;

@RestController
@RequestMapping("/status")
public class StatusController {
	
	@Autowired
	private StatusService statusService;
	
	@RequestMapping(path="/current-status", method=RequestMethod.GET)
	Status getStatus() {
		return statusService.getStatus();
	}

}
