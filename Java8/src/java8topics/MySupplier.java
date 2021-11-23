package java8topics;

import java.util.function.Consumer;
import java.util.function.Supplier;
public class MySupplier {

      public static void main(String[] args) {
    getValue(() -> "Output1");
    getValue(() -> "OutPut2");
    }

    /**
     * Gets the value.
     *
     * @param supplier
     *            the supplier
     * @return the value
     */
    public static void getValue(Supplier<?> supplier) {
    System.out.println(supplier.get());
	}

}
