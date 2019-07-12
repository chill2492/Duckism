
package duckism;

import java.awt.Color;
import java.util.Observable;

@SuppressWarnings("javadoc")
public class RedheadDuck
    extends Duck
{

    public RedheadDuck(Duck redheadDuck, Observable observable)
    {

        super(observable);
        quackBehavior = new QuackNormal();
        flyBehavior = new FlyWithWings();
        setColor(Color.RED);
    }


    @Override
    public String display()
    {
        return "Redhead";
    }
}
