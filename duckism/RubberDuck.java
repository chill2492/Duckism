package duckism;

import java.awt.Color;
import java.util.Observable;

@SuppressWarnings("javadoc")
public class RubberDuck
    extends Duck
{

    public RubberDuck(Duck rubberDuck, Observable observable)
    {
        super(observable);
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackSqueek();
        setColor(Color.YELLOW);
    }


    @Override
    public String display()
    {
        return "Rubber";
    }
}
