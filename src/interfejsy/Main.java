package interfejsy;

public class Main {
    public static void main(String[] args) {
        ConnectionInterface c = new ConnectionImpl();

        c.connect();

        String customer = c.getCustomer(5);

        customer = customer + "ABC";

        c.saveCustomer(customer);

        c.disconnect();

    }
}
