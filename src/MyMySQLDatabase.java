public class MyMySQLDatabase extends MySQLDatabase{
    private String name;

    @Override
    void setUsername() {
        this.name = "Hello";
        System.out.println(this.name);
    }
}
