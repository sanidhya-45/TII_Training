package Day3;

public class Student {
    int age, rollno;
    String name;
    Student(String name, int age, int rollno)
    {
        this.age=age;
        this.rollno=rollno;
        this.name= name;
    }
    public String toString()
    {
        return this.rollno + " " + this.name + " "+  this.age;
    }
}
