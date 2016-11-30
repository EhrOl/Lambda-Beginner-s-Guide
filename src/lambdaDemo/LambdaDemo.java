package lambdaDemo;

public class LambdaDemo {
    
    public interface MyValue { double getValue(); }    
    
    public interface MyParamValue { double getValue(double v); }
    
    public static void main(String[] args) {
        
        MyValue myVal = () -> 98.6;
        System.out.println("A constant value is " + myVal.getValue());
        
        MyValue myVal2 = () -> 48;
        System.out.println(myVal2.getValue());
                   
        MyParamValue myPval = n -> 1.0/n;
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));                     
        
        MyParamValue myPval2 = d -> d*3;
        System.out.println(myPval2.getValue(7));
      
    }

}
