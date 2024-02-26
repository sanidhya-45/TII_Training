package Day4

class Third constructor(age:Int, name:String){
    var name:String="";
    var age=0;
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
    fun getDetails()
    {
        println(this.name + " " + this.age)
    }
    

}
fun main()
{
    var obj= Third(22, "Carl Johnson");
    obj.getDetails();
    obj.age=25;
    obj.getDetails();

}