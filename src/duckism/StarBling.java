package duckism;

import java.util.Observable;

@SuppressWarnings("javadoc")
public class StarBling
    extends Bling
{

    public StarBling(Duck duckArg, Observable observable)
    {
        super(duckArg, observable);
        
    }


    @Override
    public String display()
    {
        return super.display() + ":*";
    }

}
