//***********************************************************************************************
//* File: 'VectorWithVariables.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/VectorWithVariables.pd'
//* by Perfect Developer version 6.10.01 at 17:34:08 UTC on Monday March 9th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf8F71.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class VectorWithVariables extends _eAny
{
    protected double xconst;
    protected double yconst;
    protected double zconst;
    protected double xt;
    protected double yt;
    protected double zt;
    public QuadraticEquation squareOfMagnitude ()
    {
        return new QuadraticEquation (((_eSystem._oExp (xt, 2) + _eSystem._oExp (yt, 2)) + _eSystem.
            _oExp (zt, 2)), ((((2 * xt) * xconst) + ((2 * yt) * yconst)) + ((2 * zt) * zconst)), ((
            _eSystem._oExp (xconst, 2) + _eSystem._oExp (yconst, 2)) + _eSystem._oExp (zconst, 2)));
    }

    public VectorWithVariables _oPlus (VectorWithVariables other)
    {
        return new VectorWithVariables ((xconst + other.xconst), (yconst + other.yconst), (zconst +
            other.zconst), (xt + other.xt), (yt + other.yt), (zt + other.zt));
    }

    public VectorWithVariables _oMinus (VectorWithVariables other)
    {
        return new VectorWithVariables ((xconst - other.xconst), (yconst - other.yconst), (zconst -
            other.zconst), (xt - other.xt), (yt - other.yt), (zt - other.zt));
    }

    public VectorWithVariables (double _vxconst, double _vyconst, double _vzconst, double _vxt,
        double _vyt, double _vzt)
    {
        super ();
        xconst = _vxconst;
        yconst = _vyconst;
        zconst = _vzconst;
        xt = _vxt;
        yt = _vyt;
        zt = _vzt;
    }

    public boolean _lEqual (VectorWithVariables _vArg_10_9)
    {
        if (this == _vArg_10_9)
        {
            return true;
        }
        return ((((((_vArg_10_9.xconst == xconst) && (_vArg_10_9.yconst == yconst)) && (_vArg_10_9.
            zconst == zconst)) && (_vArg_10_9.xt == xt)) && (_vArg_10_9.yt == yt)) && (_vArg_10_9.zt
            == zt));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == VectorWithVariables.class &&
            _lEqual ((VectorWithVariables) _lArg));
    }

}


// End of file.
