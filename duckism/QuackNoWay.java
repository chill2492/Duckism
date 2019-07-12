package duckism;

@SuppressWarnings("javadoc")
public class QuackNoWay
    implements QuackBehavior
{
    public void getQuackState(Duck duck)
    {
        duck.setState(State.SWIMMING);

    }


    public String getQuackText()
    {
        return "";
    }

}
