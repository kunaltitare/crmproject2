package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Contact;
import com.crm.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listAllContact")
	public String listAllContact(ModelMap model) {
		List<Contact> contact = contactService.findAllContact();
		model.addAttribute("contact", contact);
		return "contact_result";
	}
	
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id") long id, ModelMap model) {
		Contact contacts = contactService.findContactById(id);
		model.addAttribute("contacts", contacts);
		return "bill_generate";
	}
}
