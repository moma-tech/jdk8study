/**
 * Swape two var without temp
 * Created by ivan on 17-6-15.
 **/
public class SwapeTwoVar {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        x = x ^ y;
        System.out.println(x + "--" + y);
        y = y ^ x;
        System.out.println(x + "--" + y);
        x = y ^ x;
        System.out.println(x + "--" + y);

    }
}
