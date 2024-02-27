package Day5;

public class Calc {
    public int add(int a, int b) {
        return a + b;
    }
    public void addKid(int a, int b, MobilePhone mob)
    {
        try{
            Thread.sleep(5000);
            int c= a+b;
            mob.sumResult(c);
        }catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
