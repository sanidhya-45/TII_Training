package Day4

        fun printMessage(message: String)
        {
            println( message)
        }
        fun printMessageWithPrefix(message: String, prefix:String= "Info")
        {
            println("$prefix" + " " + message )
        }
        fun sum(a:Int, b:Int): Int
        {
            return a+b;
        }
        fun multiply(a:Int, b:Int)= a * b;


fun main()
        {
            printMessage("Daniel");
            printMessageWithPrefix("Hey", "Daniel")
            printMessageWithPrefix("Hey")
            println(sum(5,6));
            println(multiply(4,5));
        }
