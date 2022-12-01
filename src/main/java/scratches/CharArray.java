package scratches;

/**
 * print a char array
 * Created by ivan on 17-6-15.
 **/
public class CharArray {
    public static void main(String[] args) {
        String letters = "ABC";
        char[] numbers = {'1', '2', '3'};
        System.out.println(letters + " easy as " + numbers);
        System.out.println(letters + " easy as " + String.valueOf(numbers));
        System.out.print(letters + " easy as ");
        System.out.println(numbers);
    }
    /*
    ABC easy as [C@4617c264
    ABC easy as 123
    ABC easy as 123
     */
}
