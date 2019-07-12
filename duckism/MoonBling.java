package duckism;

import java.util.Observable;

@SuppressWarnings("javadoc")
public class MoonBling
    extends Bling
{

    public MoonBling(Duck duckArg, Observable observable)
    {
        super(duckArg, observable);

    }


    @Override
    public String display()
    {
        return super.display() + ":)";
    }
}
