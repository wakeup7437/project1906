package com.bitcamp.web.service;

import java.util.List;
import java.util.Optional;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.entities.Customer;
import com.bitcamp.web.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerService
 */
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Boolean addCustomer(Customer customer) {
        Customer i = null;
        try {
            i = customerRepository.save(customer);

        } catch (Exception e) {
            // TODO: handle exception
        }
        if (i != null)
            return true;
        else
            return false;
    }

    public Iterable<Customer> findCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findbyId(Long id) {
        Optional<Customer> r = customerRepository.findById(id);
        return r;
    }
  
    public List<CustomerDTO> findCustomersByOption(Customer option) {
        return null;
    }

   
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

 
    public int updateCustomer(Customer customer) {
        int res = 0;
        if(res == 1){
            System.out.println("서비스 수정성공");
        }else{
            System.out.println("서비스 수정실패");
        }
        return res;
    }


    public void deleteCustomer(Customer customer) {
        
    }

 
    public Long countAll() {
        return customerRepository.count();
    }

 
    public CustomerDTO login(Customer customer) {
        System.out.println("컨트롤러에서 넘어온 ID: "+customer.getCustomerId());
        System.out.println("컨트롤러에서 넘어온 PASS: "+customer.getPassword());
        return null;
    }
    
}