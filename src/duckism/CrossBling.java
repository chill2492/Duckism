package duckism;

import java.util.Observable;

@SuppressWarnings("javadoc")
public class CrossBling
    extends Bling
{

    public CrossBling(Duck duckArg, Observable observable)
    {
        super(duckArg, observable);

    }


    @Override
    public String display()
    {
        return super.display() + ":+";
    }

}
