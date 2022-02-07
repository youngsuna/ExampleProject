package com.share.boot.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/delivery")
public class DeliveryController {
	  @Autowired
	 DeliveryService deliveryService;

	  @GetMapping(value = "/{id}")
	  public String name(@PathVariable("id") String id) {
		  return deliveryService.getMenu(id);
	  }

}
