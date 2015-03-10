//***********************************************************************************************
//* File: 'VectorWithVariables.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/VectorWithVariables.pd'
//* by Perfect Developer version 6.10.01 at 23:07:43 UTC on Tuesday March 10th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf51FB.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class VectorWithVariables extends _eAny
{
    protected double xconst;
    protected double yconst;
    protected double xt;
    protected double yt;
    public QuadraticEquation squareOfMagnitude ()
    {
        return new QuadraticEquation ((_eSystem._oExp (xt, 2) + _eSystem._oExp (yt, 2)), (((2 * xt)
            * xconst) + ((2 * yt) * yconst)), (_eSystem._oExp (xconst, 2) + _eSystem._oExp (yconst,
            2)));
    }

    public VectorWithVariables _oPlus (VectorWithVariables other)
    {
        return new VectorWithVariables ((xconst + other.xconst), (yconst + other.yconst), (xt +
            other.xt), (yt + other.yt));
    }

    public VectorWithVariables _oMinus (VectorWithVariables other)
    {
        return new VectorWithVariables ((xconst - other.xconst), (yconst - other.yconst), (xt -
            other.xt), (yt - other.yt));
    }

    public _eSeq _rtoString ()
    {
        return _eSystem._lString ("\n (")._oPlusPlus (_eSystem._ltoString (xconst), (_eTemplate_0)
            null)._oPlusPlus (_eSystem._lString (" + "), (_eTemplate_0) null)._oPlusPlus (_eSystem.
            _ltoString (xt), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("t) x + ("), (
            _eTemplate_0) null)._oPlusPlus (_eSystem._ltoString (yconst), (_eTemplate_0) null).
            _oPlusPlus (_eSystem._lString (" + "), (_eTemplate_0) null)._oPlusPlus (_eSystem.
            _ltoString (yt), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("t) y"), (
            _eTemplate_0) null);
    }

    public VectorWithVariables (double _vxconst, double _vyconst, double _vxt, double _vyt)
    {
        super ();
        xconst = _vxconst;
        yconst = _vyconst;
        xt = _vxt;
        yt = _vyt;
    }

    public boolean _lEqual (VectorWithVariables _vArg_10_9)
    {
        if (this == _vArg_10_9)
        {
            return true;
        }
        return ((((_vArg_10_9.xconst == xconst) && (_vArg_10_9.yconst == yconst)) && (_vArg_10_9.xt
            == xt)) && (_vArg_10_9.yt == yt));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == VectorWithVariables.class &&
            _lEqual ((VectorWithVariables) _lArg));
    }

}


// End of file.
