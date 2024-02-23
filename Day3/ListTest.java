package Day3;
import java.sql.SQLOutput;
import java.util.*;
public class ListTest {
    public static void main(String[] args) {

          ArrayList<Student> arr= new ArrayList<Student>();

          arr.add(new Student("Sanidhya", 22, 104));
          arr.add(new Student("Ayush", 21, 12));
            arr.add(new Student("Nandan", 21, 76));
           arr.add(new Student("Zeeshan", 23, 138));
            arr.add(new Student("divyam", 21, 43));

        Collections.sort(arr, new Sortbyage());
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }

//        LinkedList<Integer> ll = new LinkedList<>();




//        System.out.println("first " + ll.getFirst());
//        System.out.println("last " + ll.getLast());
//        System.out.println("class " + ll.getClass());
//
//
    }

}
