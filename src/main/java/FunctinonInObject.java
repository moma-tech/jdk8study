import java.util.function.Function;

/**
 * use object represent a function
 * Created by ivan on 17-4-5.
 **/
public class FunctinonInObject {

    // design as a  function
    private static String greeting(String name) {
        name += "aaa";
        return "Greeting " + name;
    }

    // method use a function
    private String doIt(Function<String, String> function, String name) {
        return function.apply(name);
    }

    // define function
    // call method
    private String call() {
        String name = "Ivan";
        Function<String, String> call = FunctinonInObject::greeting;
        return doIt(call, name);
    }

    private String callLambda() {
        String name = "Ivan";
        return doIt((a) -> "Greeting " + a, name);
    }

    // test
    public static void main(String[] args) {
        FunctinonInObject fio = new FunctinonInObject();
        System.out.println(fio.call());
        System.out.println(fio.callLambda());
    }
}
