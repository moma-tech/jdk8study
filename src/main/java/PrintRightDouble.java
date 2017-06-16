import java.math.BigDecimal;

/**
 * how to print right double
 * Created by ivan on 17-6-15.
 **/
public class PrintRightDouble {
    public static void main(String[] args) {
        System.out.println(2.00 - 1.10);  // wrong
        System.out.printf("%.2f%n", 2.00 - 1.10); // not so good
        System.out.println(200 - 110 + " cents"); // translate unit,careful with range
        System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.1))); // wrong
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1"))); // best
    }
}
