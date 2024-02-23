package Day3;
import java.util.*;
public class ListTest {
    public static void main(String[] args) {


        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            ll.add(i);
        }
        Iterator<Integer> it= ll.iterator();
        while(it.hasNext())
        {
//            System.out.println(it.);
            System.out.println(it.next());

        }


    }

}
