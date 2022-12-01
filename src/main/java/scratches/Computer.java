package scratches;

import java.util.function.Function;

/**
 * Function Pro Example
 * Created by ivan on 17-4-1.
 **/
public class Computer {

    /**
     * function caller
     *
     * @param function :Function<Integer, Integer>
     * @param value input
     * @return
     */
    private static Integer compute(Function<Integer, Integer> function, Integer value) {
        return function.apply(value);
    }

    /**
     * a Function<Integer, Integer>
     *
     * @param value
     * @return
     */
    private static Integer invert(Integer value) {

        return -value;
    }

    private static Integer invertTheNumber() {
        Integer toInvert = -5;
        // Declare Function
        Function<Integer, Integer> invertFunction = Computer::invert;
        return compute(invertFunction, toInvert);
    }

    public static void main(String[] args) {
        Integer i = Computer.invertTheNumber();
        System.out.println("------Value Print-------i Value=" + i + ", " + "With Caller=scratches.Computer.main");
    }
    /*
    ------Value Print-------i Value=5, With Caller=scraches.Computer.main
     */

}
