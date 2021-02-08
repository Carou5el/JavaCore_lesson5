package kulkov.JavaCore.Lesson5;

public class Main {
    public static void main(String[] args)
    {

        Cat Bulka = new Cat(100);
        Dog Max = new Dog(150, 10);

        Bulka.run(20);
        Bulka.swim(5);
        Max.run(21);
        Max.swim(21);

        System.out.printf("Object counter = %d\n", Animal.objectCNT);

    }
}
