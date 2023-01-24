public class Main {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception ex) {
            throw new RuntimeException("Ошибка Exception обработана");
        }
    }

    static void doSomething() throws Exception {
        throw new Exception();
    }
}