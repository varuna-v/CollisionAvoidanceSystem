//***********************************************************************************************
//* File: 'QuadraticEquation.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/QuadraticEquation.pd'
//* by Perfect Developer version 6.10.01 at 12:35:31 UTC on Tuesday March 10th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf8562.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class QuadraticEquation extends _eAny
{
    protected double a;
    protected double b;
    protected double c;
    public double getXForMinimumValue ()
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((0.0 < a))) throw new _xPre ("QuadraticEquation.pd:18,15");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        QuadraticEquation _vLet_derivative_19_17 = differentiateWRTx ();
        return _eSystem._oDiv (((- 1.0) * _vLet_derivative_19_17.c), _vLet_derivative_19_17.b);
    }

    public double solve ()
    {
        double _vLet_toBeRoot_23_17 = ((b * b) - ((4 * a) * c));
        if ((_vLet_toBeRoot_23_17 < 0.0))
        {
            return 100000.0;
        }
        else
        {
            double _vLet_r1_25_23 = _eSystem._oDiv ((((- 1.0) * a) + _eSystem._oExp (
                _vLet_toBeRoot_23_17, 0.5)), (2 * a));
            double _vLet_r2_26_23 = _eSystem._oDiv ((((- 1.0) * a) - _eSystem._oExp (
                _vLet_toBeRoot_23_17, 0.5)), (2 * a));
            return (((0.0 < _vLet_r1_25_23) && (_vLet_r2_26_23 < _vLet_r1_25_23)) ?
            _vLet_r1_25_23 : ((0.0 < _vLet_r2_26_23) && (_vLet_r1_25_23 < _vLet_r2_26_23)) ?
            _vLet_r2_26_23 : 100000.0);
        }
    }

    public QuadraticEquation differentiateWRTx ()
    {
        return new QuadraticEquation (0.0, (2.0 * a), b);
    }

    public QuadraticEquation _oPlus (QuadraticEquation other)
    {
        return new QuadraticEquation ((a + other.a), (b + other.b), (c + other.c));
    }

    public QuadraticEquation _oMinus (QuadraticEquation other)
    {
        return new QuadraticEquation ((a - other.a), (b - other.b), (c - other.c));
    }

    public QuadraticEquation (double _va, double _vb, double _vc)
    {
        super ();
        a = _va;
        b = _vb;
        c = _vc;
    }

    public boolean _lEqual (QuadraticEquation _vArg_11_9)
    {
        if (this == _vArg_11_9)
        {
            return true;
        }
        return (((_vArg_11_9.a == a) && (_vArg_11_9.b == b)) && (_vArg_11_9.c == c));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == QuadraticEquation.class &&
            _lEqual ((QuadraticEquation) _lArg));
    }

}


// End of file.
