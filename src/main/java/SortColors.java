/**
 * Created by Ivan on 8/14/2017.
 */
public class SortColors {

    public static void main(String []args ){
        SortColors sc = new SortColors();
        Person p1 = new Person("a");
        Person p2 = new Person("b");
        Person p3 = new Person("c");
        Person [] nump = {p1,p2,p3};
        sc.swapPerson(nump[0],nump[2]);
        System.out.println(nump[0].getName());
        /*String [] nums = {"a","b","c","d","e","f"};
        String a= nums[0];
        String b = nums[2];
        sc.swapString(a,b);
        System.out.println(nums[0]);
        System.out.println(a);*/
    }

    public void sortColors(int[] nums){
        int left = 0, right = nums.length-1;
        if(nums.length ==1)
            return ;
        for(int i = 0; i<nums.length && right>=0; ){
            if(nums[i]==0){
                swap(nums[i], nums[left]);
                i++;
                left++;
            }
            else if (nums[i]==2){
                swap(nums[i], nums[right--]);
            }
            else
                i++;
        }
    }

    public void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
    public void swapString(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }

    public void swapPerson(Person a, Person b) {
        Person temp = a;
        a = b;
        b = temp;
    }
}
class Person{
    Person(String a){
        name = a;
    }
    private String name;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
}
