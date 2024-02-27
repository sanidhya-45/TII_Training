package Day5;

public class CallbackDemo {
    public static void main(String[] args) {
        Calc calc= new Calc();
        int sum= calc.add(25 ,15);
        System.out.println("sum: "+ sum);
        MobilePhone mob= new ElderBro();

        new Thread()
        {
            @Override
            public void run()
            {
                calc.addKid(25,15, mob);
            }
        }.start();
        System.out.println("I am continuing with my work while kidbro is adding");

    }
}
