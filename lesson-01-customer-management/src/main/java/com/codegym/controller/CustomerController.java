package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class CustomerController extends HttpServlet {
    @Autowired
    private CustomerService customerService;

    @GetMapping ("/customers")
    public ModelAndView showList(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("customers/list.jsp");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping ("/customer-info")
    public ModelAndView showCustomerInfo(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        ModelAndView modelAndView = new ModelAndView("customers/info.jsp");
        Customer customer = customerService.findOne(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/customers")
    public void addNew(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {
        Customer customer = new Customer();
        customer.setName(request.getParameter("name"));
        customer.setEmail(request.getParameter("email"));
        customer.setAddress(request.getParameter("address"));

        Long id = Long.valueOf(request.getParameter("id"));
        customer.setId(id);
        customerService.save(customer);

        response.sendRedirect("/customers");
    }
}
