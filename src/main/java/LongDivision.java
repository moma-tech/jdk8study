/**
 * Long Division with data type
 * Created by ivan on 17-6-15.
 **/
public class LongDivision {

    public static void main(String[] args) {
        long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        System.out.println(MICROS_PER_DAY); // overflow
        long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        System.out.println(MICROS_PER_DAY);
        MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}
