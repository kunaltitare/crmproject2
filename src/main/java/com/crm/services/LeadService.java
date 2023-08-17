package com.crm.services;

import java.util.List;

import com.crm.entities.Lead;

public interface LeadService {

	public void saveLead(Lead lead);

	public List<Lead> findAllLeads();

	public Lead findLeadById(long id);

	public void deleteLeadByid(long id);



	
}
