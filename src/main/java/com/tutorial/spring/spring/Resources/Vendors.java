package com.tutorial.spring.spring.Resources;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Vendors 
{
	public Vendors()
	{
		super();
		this.ID=null;
		this.Name=null;
		this.Industry=null;
	}
	
	public Vendors(String ID, String Name, String Industry)
	{
		super();
		this.ID=ID;
		this.Name=Name;
		this.Industry=Industry;
	}
	
	@Id
	private String ID;
	private String Name;
	private String Industry;

	public void setID(String ID)
	{
		this.ID=ID;
	}
	public String getID()
	{
		return ID;
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
	
	public void setIndustry(String Industry)
	{
		this.Industry=Industry;
	}
	public String getIndustry()
	{
		return Industry;
	}
}
