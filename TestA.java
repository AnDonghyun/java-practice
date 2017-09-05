class TestException extends Exception { }
class A {
    public String sayHello(String name) throws TestException {
        if(name == null) throw new TestException();
        return "Hello " + name;
    }
}
public class TestA {
    public static void main(String[] args) {
        try{
           new A().sayHello("Aiko");
       } catch (TestException te) {
            System.out.println(te);
       }
   }
}
