package com.phanathem.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.phanathem.demo.model.Customer;
import com.phanathem.demo.repository.CustomerRepository;

@Controller
@RequestMapping("/customers") // All mappings now start with /customers
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
 
	@GetMapping("/register")
	public String showForm() {
		return "redirect:/index.jsp";
	}

	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute Customer customer) {
		customerRepository.save(customer);
		return "redirect:/index.jsp?success";
	}
}
