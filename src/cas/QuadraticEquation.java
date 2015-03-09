//***********************************************************************************************
//* File: 'QuadraticEquation.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/QuadraticEquation.pd'
//* by Perfect Developer version 6.10.01 at 17:34:08 UTC on Monday March 9th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf8F71.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class QuadraticEquation extends _eAny
{
    protected double x2;
    protected double x;
    protected double constant;
    public double getXForMinimumValue ()
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((0.0 < x2))) throw new _xPre ("QuadraticEquation.pd:18,16");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        QuadraticEquation _vLet_derivative_19_17 = differentiateWRTx ();
        return _eSystem._oDiv (((- 1.0) * _vLet_derivative_19_17.constant), _vLet_derivative_19_17.x)
            ;
    }

    public QuadraticEquation differentiateWRTx ()
    {
        return new QuadraticEquation (0.0, (2.0 * x2), x);
    }

    public QuadraticEquation _oPlus (QuadraticEquation other)
    {
        return new QuadraticEquation ((x2 + other.x2), (x + other.x), (constant + other.constant));
    }

    public QuadraticEquation _oMinus (QuadraticEquation other)
    {
        return new QuadraticEquation ((x2 - other.x2), (x - other.x), (constant - other.constant));
    }

    public QuadraticEquation (double _vx2, double _vx, double _vconstant)
    {
        super ();
        x2 = _vx2;
        x = _vx;
        constant = _vconstant;
    }

    public boolean _lEqual (QuadraticEquation _vArg_11_9)
    {
        if (this == _vArg_11_9)
        {
            return true;
        }
        return (((_vArg_11_9.x2 == x2) && (_vArg_11_9.x == x)) && (_vArg_11_9.constant == constant));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == QuadraticEquation.class &&
            _lEqual ((QuadraticEquation) _lArg));
    }

}


// End of file.
