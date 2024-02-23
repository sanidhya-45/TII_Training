package Day3;

public class GenClass<T> {
    private T t;

    public static <T> boolean isEqual(GenClass<T> t1, GenClass<T> t2)
    {
//        return t1.get()==t2.get();
        return t1.get().equals(t2.get());
    }
    public T get()
    {
        return this.t;
    }
    public void set(T t)
    {
    this.t=t;
    }

    public static void main(String[] args) {
        GenClass<String> genS= new GenClass<String>();
        genS.set("Carl");
        System.out.println(genS.get());

        GenClass<String> genI= new GenClass<String>();
        genI.set("Sanidhya");
        System.out.println(genI.get());
//        GenClass<Integer> genI= new GenClass<Integer>();
//        genI.set(45);
//        System.out.println(genI.get());

        boolean b= GenClass.<String>isEqual(genI,genS);
        System.out.println(b);

    }
}
