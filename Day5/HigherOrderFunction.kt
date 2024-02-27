package Day5

// below is higher order function
fun calculate(x:Int, y:Int,operation:(Int, Int)->Int ):Int
{
    return operation(x,y);
}
fun calculate2(s1:String, s2:String, operation:(String, String)->String):String
{
    return operation(s1, s2);
}

// functions passed as arguement in higher order functions

fun sum(x:Int, y:Int)= x+y;
fun mul(x:Int, y:Int)= x*y;
fun encode(str1:String, str2:String): String {
    var st:String= str1 + str2;
    return st.uppercase();
    
}

fun main()
{

    var s= calculate(4,5,::sum)
    println(s);
    var m= calculate(4,5,::mul)
    println(m);

    var st= calculate2("sanidhya is ", "attending training in target office", ::encode);
    println(st)

}