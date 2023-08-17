package com.crm.services;

import java.util.List;

import com.crm.entities.Contact;

public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> findAllContact();

	public Contact findContactById(long id);



	
}
