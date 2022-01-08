public class MySQLDatabase extends Database {
    MySQLDatabase() {
        super("ABC");
        setUsername();
    }

    @Override
    void connect() {

    }

    @Override
    void setUsername() {
        System.out.println("Username of My");
    }

    @Override
    void createTable() {

    }
}


// How object creation works
// Lab -> Dog -> Animal -> Object
// when we construct Lab
// Lab will construct Dog
// Dog will construct Animal object
// Animal will construct Object