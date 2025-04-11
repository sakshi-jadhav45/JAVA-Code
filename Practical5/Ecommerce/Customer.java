package Ecommerce;

public class Customer {
    private String name;
    private int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name       : " + name);
    }

    public int getCustomerId() {
        return customerId;
    }
}
