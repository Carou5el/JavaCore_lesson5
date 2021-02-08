package kulkov.JavaCore.Lesson5;

public class Animal
{
    static int objectCNT = 0;               // Подсчёт объектов, реализованных от этого родительского класса.

    public int distLimitRun;
    public int distLimitSwim;

    Animal()
    {
        this.distLimitRun = 0;
        this.distLimitSwim = 0;
    }

    Animal(int distanceRunLimit, int distanceSwimLimit)
    {
        this.distLimitRun = distanceRunLimit;
        this.distLimitSwim = distanceSwimLimit;
    }

    public void run(int distanceRun)
    {

        if(distanceRun > this.distLimitRun)
        {
            System.out.println("cannot running on this distance.");
            System.out.println("Distance range is overrun.");
            System.out.println();
            return;
        }
        System.out.println(" is running on " + distanceRun + " m");
    }

    public void swim(int distanceSwim)
    {
        if(distanceSwim > this.distLimitSwim)
        {
            System.out.println("cannot swimming on this distance.");
            System.out.println("Distance range is overrun.");
            System.out.println();
            return;
        }
        System.out.println(" is swimming on " + distanceSwim + " m");
    }

}
