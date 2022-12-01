package scratches;

/**
 * careful with comment
 * Created by ivan on 17-6-16.
 **/
public class Classifier {
    public static void main(String[] args) {
        System.out.println(
                Classifier.class.getName().
                        replaceAll("\\.", "/") + ".class");
    }
    /*
    scratches/Classifier.class
     */
}
