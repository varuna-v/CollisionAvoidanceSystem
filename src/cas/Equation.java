//***********************************************************************************************
//* File: 'Equation.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/Equation.pd'
//* by Perfect Developer version 6.10.01 at 12:25:36 UTC on Monday March 23rd 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf3AE.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class Equation extends _eAny
{
    protected double a;
    protected double b;
    protected double c;
    public double getXForMinimumValue ()
    {
        Equation _vLet_derivative_17_17 = differentiateWRTx ();
        return _eSystem._oDiv (((- 1.0) * _vLet_derivative_17_17.c), _vLet_derivative_17_17.b);
    }

    public double solve ()
    {
        double _vLet_toBeRoot_21_17 = ((b * b) - ((4 * a) * c));
        if ((_vLet_toBeRoot_21_17 < 0.0))
        {
            return 100000.0;
        }
        else
        {
            double _vLet_r1_23_23 = _eSystem._oDiv ((((- 1.0) * b) + _eSystem._oExp (
                _vLet_toBeRoot_21_17, 0.5)), (2 * a));
            double _vLet_r2_24_23 = _eSystem._oDiv ((((- 1.0) * b) - _eSystem._oExp (
                _vLet_toBeRoot_21_17, 0.5)), (2 * a));
            return (((0.0 < _vLet_r1_23_23) && (_vLet_r1_23_23 <= _vLet_r2_24_23)) ?
            _vLet_r1_23_23 : ((0.0 < _vLet_r2_24_23) && (_vLet_r2_24_23 < _vLet_r1_23_23)) ?
            _vLet_r2_24_23 : 100000.0);
        }
    }

    public Equation differentiateWRTx ()
    {
        return new Equation (0.0, (2.0 * a), b);
    }

    public Equation _oPlus (Equation other)
    {
        return new Equation ((a + other.a), (b + other.b), (c + other.c));
    }

    public Equation _oMinus (Equation other)
    {
        return new Equation ((a - other.a), (b - other.b), (c - other.c));
    }

    public _eSeq _rtoString ()
    {
        return _eSystem._lString ("\n(")._oPlusPlus (_eSystem._ltoString (a), (_eTemplate_0) null).
            _oPlusPlus (_eSystem._lString (") x^2 + ("), (_eTemplate_0) null)._oPlusPlus (_eSystem.
            _ltoString (b), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString (") x + ("), (
            _eTemplate_0) null)._oPlusPlus (_eSystem._ltoString (c), (_eTemplate_0) null)._oPlusPlus
            (_eSystem._lString (")"), (_eTemplate_0) null);
    }

    public Equation (double _va, double _vb, double _vc)
    {
        super ();
        a = _va;
        b = _vb;
        c = _vc;
    }

    public boolean _lEqual (Equation _vArg_10_9)
    {
        if (this == _vArg_10_9)
        {
            return true;
        }
        return (((_vArg_10_9.a == a) && (_vArg_10_9.b == b)) && (_vArg_10_9.c == c));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == Equation.class && _lEqual ((
            Equation) _lArg));
    }

}


// End of file.
