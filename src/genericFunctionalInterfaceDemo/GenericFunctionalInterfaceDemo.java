package genericFunctionalInterfaceDemo;

public class GenericFunctionalInterfaceDemo {

    public interface SomeTest<T> {
        boolean test(T t1, T t2); }
    
    public static void main(String[] args) {
        
        SomeTest<Integer> testIntegers = (a, b) -> a%b==0;
        if(testIntegers.test(8, 2))
        System.out.println("2 is a factor of 8");
        
        SomeTest<String> testStrings = (a, b) -> (a.contains(b));
        String s = "Java is fun";
        if(testStrings.test(s, "Java"))
            System.out.println("Java is part of " + s);
        
        SomeTest<Double> testDoubles = (a, b) -> a%b==0;
        if(testDoubles.test(245.0, 5.0))
            System.out.println("5 is factor of 245");
        
        
    }
}
