package duckism;

import java.awt.Color;
import java.util.Observable;

@SuppressWarnings("javadoc")
public class DecoyDuck
    extends Duck
{

    public DecoyDuck(Duck decoyDuck, Observable observable)
    {
        super(observable);
        quackBehavior = new QuackNoWay();
        flyBehavior = new FlyNoWay();
        setColor(Color.ORANGE);
    }


    @Override
    public String display()
    {
        return "Decoy";
    }

}
