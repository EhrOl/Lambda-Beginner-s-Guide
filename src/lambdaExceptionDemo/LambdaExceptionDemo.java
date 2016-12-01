
package lambdaExceptionDemo;

import java.io.*;

public class LambdaExceptionDemo {
    
    interface MyIQAction {
        boolean ioAction(Reader r) throws IOException;
    }

    public static void main(String[] args) {
        
        double[] values = {1.0, 2.0, 3.0, 4.0};
        
        MyIQAction myIQ = (r) -> { int ch = r.read();
        return true;   };
        
    }
}
