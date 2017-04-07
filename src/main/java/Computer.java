import java.util.function.Function;

/**
 * Function Pro Example
 * Created by ivan on 17-4-1.
 **/
public class Computer {

    private static Integer compute(Function<Integer, Integer> function, Integer value) {
        return function.apply(value);
    }

    private static Integer invert(Integer value) {

        return -value;
    }

    private static Integer invertTheNumber() {
        Integer toInvert = -5;
        Function<Integer, Integer> invertFunction = Computer::invert;
        return compute(invertFunction, toInvert);
    }

    public static void main(String[] args) {
        Integer i = Computer.invertTheNumber();
        System.out.println("------Value Print-------i Value=" + i + ", " + "With Caller=Computer.main");
    }
}
