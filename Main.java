public class Main {
    public static void main(String[] args) throws Exception{
        // throw new Exception();
        try{
            // throw new Exception();
        } catch(Exception e){
            throw new Exception();
        } finally {
            System.out.println("FINALLY");
        }
    }
    
}
