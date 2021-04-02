package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer.accept(new Customer("dovi", "123434"));

    }

    static Consumer<Customer> greetCustomer =
            customer -> System.out.println("Hello " + customer.customerName);

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
