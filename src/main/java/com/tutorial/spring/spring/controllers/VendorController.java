package com.tutorial.spring.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.spring.spring.Resources.Vendors;
import com.tutorial.spring.spring.Services.VendorService;

@RestController
public class VendorController 
{
	@Autowired
	private VendorService vendorService;
	
	@GetMapping("/vendors")
	public List<Vendors> getVendors()
	{
		return vendorService.getAllVendors();
	}
	@GetMapping("/vendors/{ID}")
	public Vendors getVendor(@PathVariable String ID)
	{
		return vendorService.getVendorsByID(ID); 
	}
	
	@PostMapping("/vendors")
	public void addVendor(@RequestBody Vendors vendor)
	{
		vendorService.addVendor(vendor);
	}
	@PutMapping("/vendors")
	public void updateVendor(@RequestBody Vendors vendor)
	{
		vendorService.updateVendor(vendor);
	}
	@DeleteMapping("/vendors/{ID}")
	public void deleteVendor(@PathVariable String ID)
	{
		vendorService.deleteVendor(ID);
	}
}
