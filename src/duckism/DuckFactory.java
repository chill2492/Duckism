package duckism;

import java.util.Observable;

@SuppressWarnings("javadoc")
public class DuckFactory
    extends Observable
{
    private static DuckFactory uniqueInstance;


    public DuckFactory()
    {

    }


    public static DuckFactory getInstance()
    {

        if (uniqueInstance == null)
        {
            uniqueInstance = new DuckFactory();
        }
        return uniqueInstance;
    }


    public Duck createDuck(
        String duckType,
        int starCount,
        int moonCount,
        int crossCount)
    {
        Duck duck = null;

        if (duckType.equals("Mallard"))
        {
            duck = new MallardDuck(duck, this);
            duck = createBling(duck, starCount, moonCount, crossCount);
            duckChanged();

        }
        else if (duckType.equals("Redhead"))
        {
            duck = new RedheadDuck(duck, this);
            duck = createBling(duck, starCount, moonCount, crossCount);
            duckChanged();
        }
        else if (duckType.equals("Rubber"))
        {
            duck = new RubberDuck(duck, this);
            duck = createBling(duck, starCount, moonCount, crossCount);
            duckChanged();
        }

        else if (duckType.equals("Decoy"))
        {
            duck = new DecoyDuck(duck, this);
            duck = createBling(duck, starCount, moonCount, crossCount);
            duckChanged();
        }

        else if (duckType.equals("Goose"))
        {
            duck = new GooseDuck(duck, this);
            duck = createBling(duck, starCount, moonCount, crossCount);
            duckChanged();
        }

        return duck;
    }


    private Duck createBling(
        Duck duck,
        int starCount,
        int moonCount,
        int crossCount)
    {

        for (int starBlingCount =
            0; starBlingCount < starCount; starBlingCount++)
        {

            duck = new StarBling(duck, this);

        }

        for (int moonBlingCount =
            0; moonBlingCount < moonCount; moonBlingCount++)
        {
            duck = new MoonBling(duck, this);

        }

        for (int crossBlingCount =
            0; crossBlingCount < crossCount; crossBlingCount++)
        {
            duck = new CrossBling(duck, this);

        }

        return duck;
    }


    public void duckChanged()
    {
        setChanged();
        notifyObservers();
    }

}
