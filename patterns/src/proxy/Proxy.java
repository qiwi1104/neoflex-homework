package proxy;

public class Proxy {
    private Connection connection;

    public Proxy(Connection connection) {
        this.connection = connection;
    }

    public void connect() {
        connection.connect("localhost:port/" + connection.getDb());
    }
}
