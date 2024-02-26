package Day4
class Second {

}



    fun printMessage(message: String) {
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("$prefix" + " " + message)
    }

    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    fun multiply(a: Int, b: Int) = a * b;


fun main()
        {
            printMessage("Daniel");
            printMessageWithPrefix("Hey", "Daniel")
            printMessageWithPrefix("Hey")
            println(sum(5,6));
            println(multiply(4,5));

            var firstName:String ="This is non null name";
            firstName="Ayush"

//            firstName=null; throws error...by default non null
            var MiddleName:String?="This can become null because of ?";
            MiddleName=null;
            var LastName:String= "This cant be null";
            LastName="Jain"
            println(firstName + MiddleName + LastName)
        }
