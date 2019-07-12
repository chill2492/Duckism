package duckism;

@SuppressWarnings("javadoc")
public class QuackNormal
    implements QuackBehavior
{

    public void getQuackState(Duck duck)
    {
        duck.setState(State.QUACKING);

    }


    public String getQuackText()
    {

        return "Quack!";
    }
}
