package duckism;

@SuppressWarnings("javadoc")
public class FlyWithWings
    implements FlyBehavior
{

    public State getFlyState()
    {
        return State.FLYING;
    }

}
