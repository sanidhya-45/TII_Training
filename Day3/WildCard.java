package Day3;

abstract class Cuisine{
    abstract void type();
}
class Food extends Cuisine{
    Food()
    {
        System.out.println("Food constructor");
    }
    void type()
    {
        System.out.println("Food type Cuisines");
    }
}
class Drink extends Cuisine{
    Drink()
    {
        System.out.println("Drink constructor");
    }
    void type()
    {
        System.out.println("Drink type cuisine");
    }
}
class Ambience extends Cuisine{
    Ambience()
    {
        System.out.println("Ambience constructor");
    }
    void type()
    {
        System.out.println("Ambience type cuisine");
    }
}
class Chinese extends Food{
    Chinese()
    {
        super();
        System.out.println("Chinese constructor");
    }
}
class Italian extends Food{
    Italian()
    {
        super();
        System.out.println("Italian constructor");
    }
}
class Juice extends Drink{
    Juice()
    {
        super();
        System.out.println("Juice constructor");
    }
}
class Grape extends Juice{
    Grape()
    {
        super();
        System.out.println("Grape constructor");
    }
}



public class WildCard {

    public static void main(String[] args) {

    }
}
