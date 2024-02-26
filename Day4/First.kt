package Day4
import Day3.Student;
class First {

}
fun play()
{
    var arr= arrayOf(1,2,3,4,5);

    for( i in arr)
    {

        println("Index ${i}"+ arr[i-1]);
    }
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

    println(2.times(3));
    println((3.5).plus(8));

    var oneMillion= 1_000_000;
    var idNumber= 99_99_001;
    println(idNumber)

    var mrBeastSays= "I have ${oneMillion} dollars in my account, my account no. is ${idNumber}";
    println(mrBeastSays)

    // below is similar to final in java
    // val immutable
    val pie= 3.14;
    play();






}