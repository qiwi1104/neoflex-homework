package proxy;

public class Connection {
    private String db;

    public Connection(String db) {
        this.db = db;
    }

    public void connect(String url) {
        System.out.println("Connected to " + url);
    }

    public String getDb() {
        return db;
    }
}
