package duckism;

@SuppressWarnings("javadoc")
public class QuackSqueek
    implements QuackBehavior
{

    public void getQuackState(Duck duck)
    {
        duck.setState(State.QUACKING);

    }


    public String getQuackText()
    {

        return "Squeek!";
    }
}
