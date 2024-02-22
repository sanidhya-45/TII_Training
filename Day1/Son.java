package Day1;

public class Son extends Parent{
    int age=10;
    Son(int age)
   {
       super();
       System.out.println(this.age);
       System.out.println(age);
       System.out.println("I am son");
   }

   @Override
   public void say()
   {
        System.out.println("Hello I am son");
   }

}
