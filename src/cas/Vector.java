//***********************************************************************************************
//* File: 'Vector.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/Vector.pd'
//* by Perfect Developer version 6.10.01 at 12:22:03 UTC on Monday February 2nd 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etfD3C3.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class Vector extends _eAny
{
    public double x;
    public double y;
    public double z;
    public int type;
    public double magnitude ()
    {
        return _eSystem._oExp (((_eSystem._oExp (x, 2) + _eSystem._oExp (y, 2)) + _eSystem._oExp (z,
            2)), 0.5);
    }

    public double getTwoDimensionalDistanceFrom (Vector other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((type == VectorType.Position) && (other.type == VectorType.Position)))) throw
                    new _xPre ("Vector.pd:29,18");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        return (((x == other.x) && (y == other.y)) ?
        0.0 : _eSystem._oExp ((_eSystem._oExp ((x - other.x), 2) + _eSystem._oExp ((y - other.y), 2))
            , 0.5));
    }

    public Vector positionAtTime (double t, Vector velocity)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((type == VectorType.Position) && (velocity.type == VectorType.Velocity))))
                    throw new _xPre ("Vector.pd:38,18");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        return new Vector (((velocity.x * t) + x), ((velocity.y * t) + y), ((velocity.z * t) + z),
            VectorType.Position, (VectorType) null);
    }

    public double dotProduct (Vector other)
    {
        return (((x * other.x) + (y * other.y)) + (z * other.z));
    }

    public Vector plus (Vector other, int resultType, VectorType _t0resultType)
    {
        return new Vector ((x + other.x), (y + other.y), (z + other.z), resultType, (VectorType)
            null);
    }

    public _eSeq _rtoString ()
    {
        return _eSystem._lString ("(")._oPlusPlus (_eSystem._ltoString (x), (_eTemplate_0) null).
            _oPlusPlus (_eSystem._lString (")x + ("), (_eTemplate_0) null)._oPlusPlus (_eSystem.
            _ltoString (y), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString (")y + ("), (
            _eTemplate_0) null)._oPlusPlus (_eSystem._ltoString (z), (_eTemplate_0) null)._oPlusPlus
            (_eSystem._lString (")z"), (_eTemplate_0) null);
    }

    public Vector _oMinus (Vector other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((type == other.type))) throw new _xPre ("Vector.pd:51,18");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        return new Vector ((x - other.x), (y - other.y), (z - other.z), type, (VectorType) null);
    }

    public Vector _oStar (double scalar)
    {
        return new Vector ((x * scalar), (y * scalar), (z * scalar), type, (VectorType) null);
    }

    public Vector (double _vx, double _vy, int _vtype, VectorType _t0_vtype)
    {
        super ();
        x = _vx;
        y = _vy;
        type = _vtype;
        z = 0.0;
    }

    public Vector (double _vx, double _vy, double _vz, int _vtype, VectorType _t0_vtype)
    {
        super ();
        x = _vx;
        y = _vy;
        z = _vz;
        type = _vtype;
    }

    public boolean _lEqual (Vector _vArg_10_9)
    {
        if (this == _vArg_10_9)
        {
            return true;
        }
        return ((((_vArg_10_9.x == x) && (_vArg_10_9.y == y)) && (_vArg_10_9.z == z)) && (_vArg_10_9
            .type == type));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == Vector.class && _lEqual ((
            Vector) _lArg));
    }

}


// End of file.
