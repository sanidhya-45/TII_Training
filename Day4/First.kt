package Day4
import Day3.Student;
class First {

}
fun main()
{
    var msg:String = "How are you?";
    var age:Int =20;
    // without mentioning also works
    println("Hello World \n" + msg);

    var temp= Employee("Sanidhya", 22, "Target NXT")
    println(temp.name);
    println(temp.age);
    println(temp.address);

    var st= Student("Ayush", 21,9);

    st.toString();
}