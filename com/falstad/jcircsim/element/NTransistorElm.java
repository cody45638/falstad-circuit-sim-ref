package com.falstad.jcircsim.element;

public class NTransistorElm extends TransistorElm
{
    public static final String NAME = "Transistor (bipolar, NPN)";

    public NTransistorElm(int xx, int yy)
    {
        super(xx, yy, false);
    }

    public Class getDumpClass()
    {
        return TransistorElm.class;
    }
}
