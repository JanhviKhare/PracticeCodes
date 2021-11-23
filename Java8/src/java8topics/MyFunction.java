package java8topics;
import java.util.function.Function;

public class MyFunction {

    public static void main(String[] args) {

        Function<String, Integer> func = x -> x.length();
       

          func.apply("hii");   
        
        System.out.println(func.apply("hii"));//checking length of string
        System.out.println(func.apply("janhvi"));
        
        Function<Integer,Integer> f=n->n*n;
        
        
        System.out.println(f.apply(4));//checking the square 
        
    }

}
