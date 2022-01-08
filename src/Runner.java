public interface Runner {

    void run();

    default void runFreely() {
        System.out.println("hello");
    }
}
