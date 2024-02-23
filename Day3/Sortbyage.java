package Day3;

import java.util.Comparator;

public class Sortbyage implements Comparator<Student> {
// defining type in comparator
    @Override
    public int compare(Student s1, Student s2) {
        return s1.age- s2.age;
    }

}
