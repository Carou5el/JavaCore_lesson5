package kulkov.JavaCore.Lesson5;

public class Cat extends Animal
{
    // Коты по условию не плавают, но чтобы продолжать использовать родительский конструктор, использую 0.
    static int distanceSwimLimit = 0;

    Cat(int distanceRunLimit)
    {
        super(distanceRunLimit, distanceSwimLimit);
        objectCNT++;
    }

    @Override
    public void run(int distanceRun)
    {
        System.out.print(" Cat ");
        super.run(distanceRun);
    }

    @Override
    public void swim(int distanceSwim)
    {
        System.out.println(" Cat cannot swim!");
    }

}
