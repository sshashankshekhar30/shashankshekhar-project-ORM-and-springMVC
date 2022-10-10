package com.GL.CS.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.GL.CS.DAO.CustomerDAO;
import com.GL.CS.DAO.CustomerDAOImpl;
import com.GL.CS.Model.Customer;

@Controller
@RequestMapping("Customer")
public class CustomerController {
	
	@Autowired
	CustomerDAO dao;
	
	@GetMapping("List")
	public String CustomerList(Model model) {

		List<Customer> customers = dao.findAll();
		model.addAttribute("customers", customers);
		return "List-Customer";
	}

	@GetMapping("ShowCustomerForm")
	public String ShowCustomerform(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "Form-Customer";
	}

	@PostMapping("save")
	public String SaveOrUpadate(Model model, @ModelAttribute("customer") Customer customer) {

		dao.saveCustomer(customer);
		return "redirect:/Customer/List";
	}

	@GetMapping("Update")
	public String UpdateCustomer(Model model, @RequestParam("id") int id) {

		Customer customer = dao.findbyid(id);
		model.addAttribute("customer", customer);
		return "Form-Customer";

	}

	@GetMapping("Delete")
	public String DeleteCustomer(Model model, @RequestParam("id") int id) {

		Customer customer = dao.findbyid(id);
		dao.DeleteCustomer(id);
		return "redirect:/Customer/List";
}

}
