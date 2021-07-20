package com.dao;

import com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CustomerDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    //get all customers
    public List<Customer> getCustomers(){
        List<Customer> customers = this.hibernateTemplate.loadAll(Customer.class);
        return customers;
    }

    //get a single customer with id
    public Customer getCustomer(int c_id){

        Customer customer = this.hibernateTemplate.get(Customer.class, c_id);
        return customer;
    }

    //delete a single customer
    @Transactional
    public void deleteCustomer(int c_id){

        Customer customer = this.hibernateTemplate.load(Customer.class, c_id);
        this.hibernateTemplate.delete(customer);
    }

    //create or update new customer
    @Transactional
    public void createOrUpdateCustomer(Customer customer){
        this.hibernateTemplate.saveOrUpdate(customer);
    }



}
