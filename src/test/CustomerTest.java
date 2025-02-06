package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        // Create a new Customer object with sample data
        Customer customer = new Customer();
        
        // Display initial customer information
        System.out.println("Initial customer info:");
        customer.displayCustomerInfo();
        
        // Test setter methods
        System.out.println("\nTesting setters:");
        System.out.println("Set ID to 5: " + customer.setID(5));
        System.out.println("Set ID to -1: " + customer.setID(-1));
        
        customer.setStatus(false);
        
        System.out.println("Set total to 4000.50: " + customer.setTotal(4000.50));
        System.out.println("Set total to -500: " + customer.setTotal(-500));
        
        // Display updated customer information
        System.out.println("\nUpdated customer info:");
        customer.displayCustomerInfo();
    }
}
