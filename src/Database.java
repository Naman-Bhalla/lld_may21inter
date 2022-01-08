import javax.xml.crypto.Data;

public abstract class Database {
    private String URL;
    private String Type;
    private int port;

    Database(String type) {
        System.out.println("type constructor");
        this.Type = type;
    }

    abstract void connect();

    abstract void setUsername();

    abstract void createTable();
}
