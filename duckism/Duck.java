
package duckism;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("javadoc")
public abstract class Duck
    implements Observer
{

    private Color   color    = Color.BLACK;
    private State   state    = State.SWIMMING;
    private boolean isFree   = true;
    private boolean isOnDSWC = false;

    FlyBehavior     flyBehavior;
    FlyBehavior     originalFlyState;
    QuackBehavior   quackBehavior;
    QuackBehavior   originalQuackState;

    Observable      observable;


    public Duck(Observable o)
    {
        observable = o;

    }


    @Override
    public void update(Observable obs, Object arg)
    {

        setState(State.WELCOMING);
    }


    // typical duck commands

    public void swim()
    {
        state = State.SWIMMING;
    }


    public void quack()
    {
        quackBehavior.getQuackState(this);
    }


    public String getQuack()
    {
        return quackBehavior.getQuackText();
    }


    public void fly()
    {
        state = flyBehavior.getFlyState();

    }


    public State getState()
    {
        return state;
    }


    public void setState(State state)
    {
        this.state = state;
    }


    public void setColor(Color c)
    {
        color = c;
    }


    public Color getColor()
    {
        return color;
    }


    // join / quit and capture / release commands

    public void joinDSWC()
    {
        isOnDSWC = true;
        observable.addObserver(this);

    }


    public void quitDSWC()
    {
        observable.deleteObserver(this);
        isOnDSWC = false;
    }


    public boolean isOnDSWC()
    {

        return isOnDSWC;
    }


    public void capture()
    {
        isFree = false;
        this.originalFlyState = flyBehavior;
        this.originalQuackState = quackBehavior;

        quackBehavior = new QuackNoWay();
        flyBehavior = new FlyNoWay();

    }


    public void release()
    {
        isFree = true;
        flyBehavior = originalFlyState;
        quackBehavior = originalQuackState;

    }


    public boolean isFree()
    {
        return isFree;
    }


    public abstract String display();

}
