package com.klef.jfsd.exam.Controller;
import java.util.List;


	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomerController {

   @Autowired
   private CustomerService customerService;
	
  @GetMapping("/")    
  public String main() 
  {
	  return "index";
  }
  
  @GetMapping("viewallcustomers")
  public ModelAndView viewcustomers()
  {
	  ModelAndView mv = new ModelAndView("viewallcustomers");
	  
	  List<Customer> customerlist = customerService.displayAllCustomers();
	  mv.addObject("customerdata", customerlist);
	  
	  return mv;
  }
}
