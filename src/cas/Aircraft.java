//***********************************************************************************************
//* File: 'Aircraft.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/Aircraft.pd'
//* by Perfect Developer version 6.10.01 at 14:04:19 UTC on Friday January 30th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf39F9.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class Aircraft extends _eAny
{
    final void _lc_Aircraft (String _lArg)
    {
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((position.type == VectorType.Position))) throw new _xClassInvariantItem (
                    "Aircraft.pd:21,29", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((velocity.type == VectorType.Velocity))) throw new _xClassInvariantItem (
                    "Aircraft.pd:22,29", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!identification.empty ()))) throw new _xClassInvariantItem (
                    "Aircraft.pd:23,15", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
    }

    protected void _lClassInvariantCheck (String _lArg)
    {
        _lc_Aircraft (_lArg);
    }

    protected final static double safteyTime = 300.0;
    protected final static double verticalBreakPoint = 8800.0;
    public Vector position;
    public Vector velocity;
    public double boundaryRadius;
    protected int status;
    protected _eSeq identification;
    public int conflictStatus;
    public double speed ()
    {
        return velocity.magnitude ();
    }

    public int getConflictStatus (Aircraft other)
    {
        return ((!breaksMinimumVerticalSeparation (other)) ?
        ConflictStatus.NoConflict : isInConflictWith (other) ?
        ConflictStatus.Conflicted : ((!velocity._lEqual (other.velocity)) && potentialFutureConflict
            (other)) ?
        ConflictStatus.PotentialFutureConflict : ConflictStatus.NoConflict);
    }

    public boolean breaksMinimumVerticalSeparation (Aircraft other)
    {
        double _vLet_heightDifference_46_17 = ((position.y < other.position.y) ?
        (other.position.y - position.y) : (position.y - other.position.y));
        return (((position.y <= Aircraft.verticalBreakPoint) && (other.position.y <= Aircraft.
            verticalBreakPoint)) ?
        (300.0 < _vLet_heightDifference_46_17) : (600.0 < _vLet_heightDifference_46_17));
    }

    public boolean isInConflictWith (Aircraft other)
    {
        double _vLet_biggerRadius_52_17 = ((other.boundaryRadius < boundaryRadius) ?
        boundaryRadius : other.boundaryRadius);
        return (position.getTwoDimensionalDistanceFrom (other.position) <= _vLet_biggerRadius_52_17);
    }

    public boolean potentialFutureConflict (Aircraft other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((!isInConflictWith (other)) && (!velocity._lEqual (other.velocity))))) throw
                    new _xPre ("Aircraft.pd:57,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        return (timeToCollision (other) <= (Aircraft.safteyTime + timeToHypotheticalCollisionWith (
            other)));
    }

    public double timeToCollision (Aircraft other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((!isInConflictWith (other)) && (!velocity._lEqual (other.velocity))))) throw
                    new _xPre ("Aircraft.pd:61,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        Vector _vLet_velocityDifference_62_17 = other.velocity._oMinus (velocity);
        return _eSystem._oDiv (position._oMinus (other.position).dotProduct (
            _vLet_velocityDifference_62_17), _eSystem._oExp (_vLet_velocityDifference_62_17.
            magnitude (), 2));
    }

    public double timeToHypotheticalCollisionWith (Aircraft other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!isInConflictWith (other)))) throw new _xPre ("Aircraft.pd:68,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        double _vLet_biggerRadius_69_17 = ((other.boundaryRadius < boundaryRadius) ?
        boundaryRadius : other.boundaryRadius);
        return _eSystem._oDiv (_vLet_biggerRadius_69_17, (speed () + other.speed ()));
    }

    public Vector positionAfterFlying (double time)
    {
        return position.plus (velocity._oStar (time), VectorType.Position, (VectorType) null);
    }

    public Aircraft getCraftAfterFlying (double time)
    {
        return new Aircraft (positionAfterFlying (time), velocity, boundaryRadius, status, (
            AircraftStatus) null, identification, (char) 0);
    }

    public _eSeq _rtoString ()
    {
        return _eSystem._lString ("\t Position: ")._oPlusPlus (position._rtoString (), (_eTemplate_0)
            null)._oPlusPlus (_eSystem._lString ("<br>\t Velocity: "), (_eTemplate_0) null).
            _oPlusPlus (velocity._rtoString (), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString (
            "<br>\t Conflict Status: "), (_eTemplate_0) null)._oPlusPlus (ConflictStatus._ltoString
            (conflictStatus), (_eTemplate_0) null);
    }

    public Aircraft getCraftWithConflictStatus (int cs, ConflictStatus _t0cs)
    {
        return new Aircraft (position, velocity, boundaryRadius, status, (AircraftStatus) null,
            identification, (char) 0, cs, (ConflictStatus) null);
    }

    public Aircraft (Vector _vposition, Vector _vvelocity, double _vboundaryRadius, int _vstatus,
        AircraftStatus _t0_vstatus, _eSeq _videntification, char _t0_videntification)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((((_vposition.type == VectorType.Position) && (_vvelocity.type == VectorType.
                    Velocity)) && (!_videntification.empty ())))) throw new _xPre (
                    "Aircraft.pd:89,28");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        position = _vposition;
        velocity = _vvelocity;
        boundaryRadius = _vboundaryRadius;
        status = _vstatus;
        identification = _videntification;
        conflictStatus = ConflictStatus.NoConflict;
        _lc_Aircraft ("Aircraft.pd:90,14");
    }

    public Aircraft (Vector _vposition, Vector _vvelocity, double _vboundaryRadius, int _vstatus,
        AircraftStatus _t0_vstatus, _eSeq _videntification, char _t0_videntification, int
        _vconflictStatus, ConflictStatus _t0_vconflictStatus)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((((_vposition.type == VectorType.Position) && (_vvelocity.type == VectorType.
                    Velocity)) && (!_videntification.empty ())))) throw new _xPre (
                    "Aircraft.pd:93,28");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        position = _vposition;
        velocity = _vvelocity;
        boundaryRadius = _vboundaryRadius;
        status = _vstatus;
        identification = _videntification;
        conflictStatus = _vconflictStatus;
        _lc_Aircraft ("Aircraft.pd:92,5");
    }

    public boolean _lEqual (Aircraft _vArg_11_11)
    {
        if (this == _vArg_11_11)
        {
            return true;
        }
        return (((((_vArg_11_11.position._lEqual (position) && _vArg_11_11.velocity._lEqual (
            velocity)) && (_vArg_11_11.boundaryRadius == boundaryRadius)) && (_vArg_11_11.status ==
            status)) && _vArg_11_11.identification._lEqual (identification)) && (_vArg_11_11.
            conflictStatus == conflictStatus));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == Aircraft.class && _lEqual ((
            Aircraft) _lArg));
    }

}


// End of file.
