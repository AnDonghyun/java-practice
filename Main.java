public class Main {
    public static void main(String[] args) {
        testIfA();
    }
    public static void testIfA() {
        if (testIfB("true")) {
            System.out.println("True");
        } else {
            System.out.println("Not true");
        }
    }
    public static Boolean testIfB(String str) {
        return Boolean.valueOf(str);
    }
}
