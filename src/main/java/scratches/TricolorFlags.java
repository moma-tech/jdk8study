package scratches;

/**
 * swap flag
 * Created by ivan on 17-7-26.
 **/
public class TricolorFlags {
    public static void main(String[] args) throws Exception {

        String flags = "RRWBWRBRBW";
        int moveCount = move(flags.toUpperCase().toCharArray());
        System.out.println("移动次数：" + moveCount + " ");
    }

    private static void swap(char[] flags, int x, int y) {
        char temp;
        temp = flags[x];
        flags[x] = flags[y];
        flags[y] = temp;
    }

    public static int move(char[] flags) {
        int moveCount = 0;

        int whiteFlag = 0;
        int blueFlag = 0;
        int redFlag = flags.length - 1;
        //No.1
        //开始写代码，在此写入实现代码
        String tempFlag = "";
        while (true) {
            for (int cur = 0; cur < flags.length - 1; cur++) {
                System.out.println("cur = [" + cur + "]");
                char c = flags[cur];
                char n = flags[cur + 1];
                System.out.println("c = [" + c + "]" + "; n = [" + n + "]");
                if (c == 'R' && n != 'R') {
                    System.out.println("swap 1: c = [" + c + "]" + "; n = [" + n + "]");
                    swap(flags, cur, cur + 1);
                    moveCount++;
                } else if (n == 'B' && c != 'B') {
                    System.out.println("swap 2: c = [" + c + "]" + "; n = [" + n + "]");
                    swap(flags, cur, cur + 1);
                    moveCount++;
                } else if (c == 'W' && n == 'B') {
                    System.out.println("swap 3: c = [" + c + "]" + "; n = [" + n + "]");
                    swap(flags, cur, cur + 1);
                    moveCount++;
                }
                System.out.println(String.valueOf(flags));
            }
            if (String.valueOf(flags).equals(tempFlag)) {
                break;
            } else {
                tempFlag = String.valueOf(flags);
            }
        }


        //end_code
        return moveCount;
    }
}
