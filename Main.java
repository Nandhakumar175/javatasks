package com.Ebrain;
public class Main {
    public static void main(String[] args) {
        
        Customer customer = Customer.getInstance();

        System.out.println("Customer name: "+ customer.getName());
        System.out.println("Customer email: "+ customer.getEmail());
        System.out.println("Customer id: "+ customer.getId());
        System.out.println("Customer phoneNumber: "+ customer.getPhoneNumber());
        System.out.println("Customer address: "+ customer.getAddress());
        
       
        

        
        Customer customer2 = Customer.getInstance();

        
        System.out.println(customer == customer2); 
    }
}
