package interfejsy;

public interface ConnectionInterface {
    void connect();
    void disconnect();
    String getCustomer(int id);
    void saveCustomer(String name);
}
