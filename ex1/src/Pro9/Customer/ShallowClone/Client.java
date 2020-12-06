package Pro9.Customer.ShallowClone;

public class Client {
    public static void main(String args[]) {
        Customer customer,copyCustomer;
        customer = new Customer();
        copyCustomer = (Customer)customer.clone();
        System.out.println("customer == copyCustomer?");
        System.out.println(customer == copyCustomer);

        System.out.println("customer.getAddress() == copyCustomer.getAddress()?");
        System.out.println(customer.getAddress() == copyCustomer.getAddress());
    }
}
