package com.tutorial.spring.spring.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.spring.spring.Repositories.VendorsRepositories;
import com.tutorial.spring.spring.Resources.Vendors;


@Service
public class VendorService 
{
	@Autowired
	private VendorsRepositories vendorRepository;
	
	public List<Vendors> getAllVendors()
	{	
		List<Vendors> vendors = new ArrayList<Vendors>();
		vendorRepository.findAll().forEach(vendors::add);
		
		return vendors;
	}
	
	public Vendors getVendorsByID(String ID)
	{
		return vendorRepository.findById(ID).get();
	}
	public void addVendor(Vendors vendor)
	{
		vendorRepository.save(vendor);
	}
	
	public void updateVendor(Vendors vendor)
	{
		vendorRepository.save(vendor);	
	}
	public void deleteVendor(String ID)
	{
		vendorRepository.deleteById(ID);
	}
}
