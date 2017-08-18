public class SequenceSumTest {
    public static void main(String[] args) {
        int x = 2, y = 1, t;
        //No.1
        //开始写代码，在此写入实现代码
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println(x);
            System.out.println(y);
            double value = ((double) x) / y;
            System.out.println(value);
            sum += value;
            int temp = x;
            x = x + y;
            y = temp;
        }


        //end_code
        System.out.println("前20项相加之和是： " + sum);
    }
}