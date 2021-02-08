package kulkov.JavaCore.Lesson5;

public class Dog extends Animal {
    Dog()   {
        super();
    }

    Dog(int distanceRunLimit,
        int distanceSwimLimit)    {
        super(distanceRunLimit, distanceSwimLimit);
        objectCNT++;
    }
    @Override
    public void run(int distanceRun)
    {
        System.out.print(" Dog ");
        super.run(distanceRun);
    }

    @Override
    public void swim(int distanceSwim)
    {
        System.out.print(" Dog ");
        super.swim(distanceSwim);
    }

}
