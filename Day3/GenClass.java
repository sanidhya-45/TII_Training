package Day3;

public class GenClass<T> {
    private T t;

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

        GenClass<Integer> genI= new GenClass<Integer>();
        genI.set(45);
        System.out.println(genI.get());


    }
}
