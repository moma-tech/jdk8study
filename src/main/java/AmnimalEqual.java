/**
 * compare tow string
 * Created by ivan on 17-6-15.
 **/
public class AmnimalEqual {
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out.println("Animals are equal: " + pig == dog);
        System.out.println("Animals are equal: " + (pig == dog));
        System.out.println("Animals are equal: " + pig.equals(dog));
    }
}
