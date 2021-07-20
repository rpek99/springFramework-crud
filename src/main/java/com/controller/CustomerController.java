package com.controller;

import com.dao.CustomerDao;
import com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/")
    public String home(Model model){

        List<Customer> customers = customerDao.getCustomers();
        model.addAttribute("customers", customers);

        return "index";
    }

    @RequestMapping("/add_customer")
    public String addProduct(){
        return "add_customer";
    }

    @RequestMapping("/update_customer/{customerId}")
    public String updateCustomer(@PathVariable("customerId") int c_id, Model model){

        Customer customer = customerDao.getCustomer(c_id);
        model.addAttribute("customer", customer);
        return "update_customer";

    }

    @RequestMapping(value = "/action", method = RequestMethod.POST)
    public RedirectView action(Customer customer, HttpServletRequest request){

        customerDao.createOrUpdateCustomer(customer);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+ "/");
        return redirectView;
    }

    @RequestMapping(value = "/delete_customer/{customerId}")
    public RedirectView deleteCustomer(@PathVariable("customerId") int c_id, HttpServletRequest request){

        customerDao.deleteCustomer(c_id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+ "/");

        return redirectView;
    }
}
