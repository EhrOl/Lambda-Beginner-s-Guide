
package varCapture;

public class VarCapture {
    
    interface MyFunc {
        int func(int i);    }
    
    public static void main(String[] args) {
        int num = 10;    /* a local variable that can be captured */
        
        MyFunc mf = i -> { int v = num+i; /* Here we use num but not modify it, so it's OK */
//            num++; Here we try to modify num, it's not allowed and will not compile
            return v;  };
        System.out.println(mf.func(8)); 
        
//        num = 9; Will not compile, it would remove the effectively final status from num;
        
    }

}
