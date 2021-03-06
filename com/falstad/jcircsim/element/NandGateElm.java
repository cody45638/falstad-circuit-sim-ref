package com.falstad.jcircsim.element;

import java.util.StringTokenizer;

public class NandGateElm extends AndGateElm
{
    public static final String NAME = "NAND Gate";

    public NandGateElm(int xx, int yy)
    {
        super(xx, yy);
    }

    public NandGateElm(int xa, int ya, int xb, int yb, int f, StringTokenizer st)
    {
        super(xa, ya, xb, yb, f, st);
    }

    public boolean isInverting()
    {
        return true;
    }

    public String getGateName()
    {
        return "NAND gate";
    }

    public int getDumpType()
    {
        return DUMP_TYPE;
    }

    public static final int DUMP_TYPE = 151;

}
