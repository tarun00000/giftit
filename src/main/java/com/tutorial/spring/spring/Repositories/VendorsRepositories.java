package com.tutorial.spring.spring.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.tutorial.spring.spring.Resources.Vendors;

public interface VendorsRepositories extends CrudRepository<Vendors, String>
{
	
}
