package interfejsy;

public class ConnectionImpl implements ConnectionInterface, I2 {
    @Override
    public void connect() {
        System.out.println("Polaczono !!!");
    }

    @Override
    public void disconnect() {
        System.out.println("Rozlaczono !!");
    }

    @Override
    public String getCustomer(int id) {
        return "Janusz";
    }

    @Override
    public void saveCustomer(String name) {
        System.out.println("Zapisano !!");
    }

    @Override
    public void m() {

    }
}
