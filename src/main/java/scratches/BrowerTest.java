package scratches;

/**
 * Label in java
 * Created by ivan on 17-6-16.
 **/
public class BrowerTest {
    public static void main(String[] args) {
        System.out.print("iexplore:");
        http:
//www.google.com;
        System.out.println(":maximize");
        outer: // pin position
        for(int i = 1; i<10;i++){
            for(int j = 1; j<10;j++){
                System.out.println(i);
                System.out.println(j);
                if(j==2) break outer;
            }
        }
    }
    /*
    iexplore::maximize
    1
    1
    1
    2
     */
}
