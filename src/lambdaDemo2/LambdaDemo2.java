package lambdaDemo2;

public class LambdaDemo2 {
    
    public interface NumericTest {
         boolean test(int a, int b); }

    public static void main(String[] args) {
        
        NumericTest myTest;
        
        myTest= (a, b) -> a % b == 0;
        if (myTest.test(8, 4)) 
            System.out.println("4 is factor of 8");
        if (!myTest.test(7, 5))
            System.out.println("5 is not factor of 7");
      
         myTest = (a, b) -> a<b;
        if(myTest.test(5, 6))
            System.out.println("5 is less than 6");
        if(!myTest.test(7, 3))
            System.out.println("7 is not less than 3");
        
         myTest = (a, b) -> (a<0 ? -a:a) == (b<0 ? -b:b);
        if(myTest.test(3, -3))
            System.out.println("Absolute values of 3 and -3 are equals");
        if(!myTest.test(4, -7))
            System.out.println("Absolute values of 4 and -7 are not equals");
    }
}
