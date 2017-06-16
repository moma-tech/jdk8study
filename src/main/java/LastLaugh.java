/**
 * Print String
 * Created by ivan on 17-6-15.
 **/
public class LastLaugh {
    public static void main(String[] args) {
        System.out.print("H" + "a");
        System.out.println('H' + 'a');
        StringBuffer sb = new StringBuffer();
        sb.append('H');
        sb.append('a');
        System.out.println(sb);
        System.out.println("" + 'H' + 'a');
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.printf("%c%c", 'H', 'a');
    }
}
