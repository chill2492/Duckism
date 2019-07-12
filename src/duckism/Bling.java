package duckism;

import java.awt.Color;
import java.util.Observable;

@SuppressWarnings("javadoc")
public abstract class Bling
    extends Duck
{

    Duck duck;


    public Bling(Duck duckArg, Observable observable)
    {
        super(observable);
        this.duck = duckArg;

    }


    @Override
    public void swim()
    {
        duck.swim();
    }


    @Override
    public void quack()
    {
        duck.quack();
    }


    @Override
    public String getQuack()
    {
        return duck.getQuack();
    }


    @Override
    public void fly()
    {

        duck.fly();

    }


    @Override
    public State getState()
    {
        return duck.getState();
    }


    @Override
    public void setState(State state)
    {
        duck.setState(state);
    }


    @Override
    public void setColor(Color c)
    {
        duck.setColor(c);
    }


    @Override
    public Color getColor()
    {
        return duck.getColor();
    }


    @Override
    public String display()
    {
        return duck.display();
    }

}
