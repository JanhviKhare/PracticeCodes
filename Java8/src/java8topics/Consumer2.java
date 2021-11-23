package java8topics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {

        public static void main(String[] args) {

    List<String> str = new ArrayList<>();
    str.add("DEMO");
    str.add("DEMO2");
    str.add("DEMO3");
    
    Consumer<String> consumer = new Consumer<String>() {
       
    	public void accept(String t) {

        
        System.out.println(t);
        }
    };

    str.forEach(consumer);

    }

}


