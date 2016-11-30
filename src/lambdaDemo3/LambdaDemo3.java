
package lambdaDemo3;

public class LambdaDemo3 {
    
    public interface StringTest{
        boolean test(String s, String d); }
    
    public static void main(String[] args) {
        
        StringTest myTest;
        
        myTest = (a, b) -> (a.contains(b));
        
        String s = "This is a test";
        
        System.out.println("Testing string: " + s);
        
        if((myTest.test(s, "is a")))
            System.out.println("\"is a\" found");
        else
            System.out.println("\"is a\" not found");
        
         if((myTest.test(s, "xyz")))
            System.out.println("\"xyz\" found");
        else
            System.out.println("\"xyz\" not found");
        
        
    }

}
