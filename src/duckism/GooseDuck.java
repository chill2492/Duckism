package duckism;

import java.awt.Color;
import java.util.Observable;

@SuppressWarnings("javadoc")
public class GooseDuck
    extends Duck
{

    public Goose goose;


    public GooseDuck(Duck gooseDuck, Observable observable)
    {
        super(observable);
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackSqueek();
        goose = new Goose();
        setColor(Color.BLUE);
    }


    @Override
    public String display()
    {
        return goose.getName();
    }


    @Override
    public String getQuack()
    {
        return goose.getHonk();
    }

}
