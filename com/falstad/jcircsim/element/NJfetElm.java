package com.falstad.jcircsim.element;

public class NJfetElm extends JfetElm
{
    public static final String NAME = "JFET (n-channel)";

    public NJfetElm(int xx, int yy)
    {
        super(xx, yy, false);
    }

    public Class getDumpClass()
    {
        return JfetElm.class;
    }
}

