package Day3;

import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(104, "Sanidhya");
        hm.put(9, "Ayush");
        hm.put(043, "Divyam");
        hm.put(076, "Nandan");

        Iterator it= hm.entrySet().iterator();
        while(it.hasNext())
        {
            System.out.println(it);
        }

    }
}
