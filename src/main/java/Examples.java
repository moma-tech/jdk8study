import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * example for lambda
 * Created by ivan on 17-4-6.
 **/
public class Examples {

    public static void main(String[] args) {
        Double sum = 0.0;
        List<Double> paras = new ArrayList<>();
        paras.add(1.0);
        paras.add(2.0);
        paras.add(3.0);
        paras.add(4.0);
        paras.add(5.0);
        paras.add(6.0);
        for (Double p : paras) {
            sum = sum + Math.pow(p, 2);
        }
        System.out.println("sum = " + sum);

        //-------------------------
        // Reduce Way
        Double sum2 = Stream.of(10000.0, 20000.0, 30000.0, 40000.0, 50000.0, 60000.0).reduce(0.0, (acc, element) -> acc + Math.pow(element, 2));
        System.out.println(sum2);
        // Summary Statistics
        DoubleSummaryStatistics dss = Stream.of(10000.0, 20000.0, 30000.0, 40000.0, 50000.0, 60000.0).mapToDouble(element -> Math.pow(element, 2)).summaryStatistics();
        System.out.println(dss.getSum());
    }
}
