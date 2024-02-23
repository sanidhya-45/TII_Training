package Day3;

import java.util.*;

public class HashClass {
    public static void main(String[] args) {
        HashSet<Integer> hm= new HashSet<Integer>();
        Random rn= new Random();
        int mi=1, ma=10;

        for(int i=0; i<10; i++)
        {
            int n=rn.nextInt(ma - mi + 1) + mi;
            System.out.println(n);
            hm.add(n);
        }
        Iterator it= hm.iterator();
        System.out.println("HashSet values are :");
        while(it.hasNext())
            System.out.print(it.next() + " ");

    }

}
