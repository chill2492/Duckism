package duckism;

@SuppressWarnings("javadoc")
public class FlyNoWay
    implements FlyBehavior
{

    public State getFlyState()
    {

        return State.SWIMMING;
    }

}
