package com.bitcamp.web.controller;

import java.util.HashMap;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.entities.Customer;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired CustomerService customerService;
    
    @GetMapping("/count")   
    public String count() {
        System.out.println("CustomerController count() 경로로 들어옴");
        Long count = customerService.countAll();
        return String.valueOf(count);
    }

    @GetMapping("{customerId}")
    public CustomerDTO selectOne(){
        return null;
    }

    @PostMapping(value="/join")
   public Boolean join(@RequestBody Customer param) {
       System.out.println("join()");
       System.out.println(param);
       System.out.println(param.toString());
       boolean result = customerService.addCustomer(param);
       return result;
   }
}