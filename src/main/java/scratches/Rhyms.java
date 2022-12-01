package scratches;

import java.util.Random;

/**
 * Random Usage
 * Created by ivan on 17-6-16.
 **/
public class Rhyms {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        // Method 1 Wrong
        StringBuffer word = null;
        switch (rnd.nextInt(2)) {
            case 1:
                word = new StringBuffer('P');
            case 2:
                word = new StringBuffer('G');
            default:
                word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);

        // Method 2 unreadable
        System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");

        // Method 3 isolate
        String a[] = {"Main", "Pain", "Gain"};
        System.out.println(randomElement(a));
    }

    private static String randomElement(String[] a) {
        return a[rnd.nextInt(a.length)];
    }
}
