/**
 * for if test,data type and order is important
 * Created by ivan on 17-6-15.
 **/
public class DosEquis {
    public static void main(String[] args) {
        char t = 'X';
        int i = 0;
        System.out.println(true ? t : 0); // first is char, second is int(can be char/byte/short),print(char)
        System.out.println(false ? i : t);// first is int , secong is char,organize type to binary,print(int)
    }
}
