package Day4

open class Third constructor(age:Int, name:String){
    var name:String="";
    var age=0;
    // init for initialising code...runs in order it is written

   init{
       println("This is first");
   }
    init{
        println("This is second");
        this.name= name;
        this.age=age;
    }

//    fun setAge(a:Int)
//        {
//            this.age=a;
//        }
    // cannot set...it already has getter and setter in-built
    fun getDetails()
    {
        println(this.name + " " + this.age)
    }
    open fun playfun()
    {
        println("Represents third function");
    }

}
class SecondAfterThird: Third(25, "Sameer"){
    override fun playfun() {
        super.playfun();
        println("This is second after third");

    }
}
fun main()
{
    var obj= Third(22, "Carl Johnson");
    obj.getDetails();
    obj.age=25;
    obj.getDetails();

    var pf:Third= SecondAfterThird()
    pf.playfun();

}