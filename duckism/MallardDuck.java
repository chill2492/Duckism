
package duckism;

import java.awt.Color;
import java.util.Observable;

@SuppressWarnings("javadoc")
public class MallardDuck
    extends Duck
{

    public MallardDuck(Duck mallardDuck, Observable observable)
    {
        super(observable);
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackNormal();
        setColor(Color.GREEN);
    }


    @Override
    public String display()
    {
        return "Mallard:";
    }

}
