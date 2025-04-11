import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class EcommerceProgram {
    public static void main(String[] args) {
        
        Product p = new Product("Wireless Mouse", 25.99, "P101");

        
        Customer c = new Customer("Alice Smith", 2001);

        
        Order o = new Order(c, p, 3);
        o.placeOrder();
    }
}
