//***********************************************************************************************
//* File: 'Aircraft.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/Aircraft.pd'
//* by Perfect Developer version 6.10.01 at 16:34:35 UTC on Saturday March 7th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf50C0.tmp
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
                    "Aircraft.pd:26,29", _lArg);
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
                    "Aircraft.pd:27,29", _lArg);
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
                    "Aircraft.pd:28,15", _lArg);
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

    protected final static double safteyTime = 0.3;
    protected final static double verticalBreakPoint = 8800.0;
    protected final static double flytimeForHypotheticalCollisionAnalysis = 0.01;
    protected final static double cosOfDescentAngle = 0.99;
    public Vector position;
    public Vector velocity;
    public double boundaryRadius;
    protected int status;
    public _eSeq identification;
    public int conflictStatus;
    protected int model;
    protected boolean isElevatingOrDescending;
    protected double targetHeight;
    protected boolean isInConflictWith (Aircraft other)
    {
        double _vLet_biggerRadius_33_17 = ((other.boundaryRadius < boundaryRadius) ?
        boundaryRadius : other.boundaryRadius);
        return (position.getTwoDimensionalDistanceFrom (other.position) <= _vLet_biggerRadius_33_17);
    }

    protected boolean potentialFutureConflict (Aircraft other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((!isInConflictWith (other)) && (!velocity._lEqual (other.velocity))))) throw
                    new _xPre ("Aircraft.pd:38,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        return ((!isFlyingTowards (other)) ?
        false : (timeToConflict (other) <= Aircraft.safteyTime));
    }

    protected double timeToCollision (Aircraft other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((!isInConflictWith (other)) && (!velocity._lEqual (other.velocity))))) throw
                    new _xPre ("Aircraft.pd:43,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        Vector _vLet_velocityDifference_44_17 = other.velocity._oMinus (velocity);
        return _eSystem._oDiv (position._oMinus (other.position).dotProduct (
            _vLet_velocityDifference_44_17), _eSystem._oExp (_vLet_velocityDifference_44_17.
            magnitude (), 2));
    }

    protected double timeToHypotheticalCollisionWith (Aircraft other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((!isInConflictWith (other)) && (!velocity._lEqual (other.velocity))))) throw
                    new _xPre ("Aircraft.pd:50,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        double _vLet_smallerRadius_51_17 = ((boundaryRadius < other.boundaryRadius) ?
        boundaryRadius : other.boundaryRadius);
        return _eSystem._oDiv (_vLet_smallerRadius_51_17, velocity._oMinus (other.velocity).
            magnitude ());
    }

    protected boolean isFlyingTowards (Aircraft other)
    {
        return (positionAfterFlying (Aircraft.flytimeForHypotheticalCollisionAnalysis).
            getTwoDimensionalDistanceFrom (other.positionAfterFlying (Aircraft.
            flytimeForHypotheticalCollisionAnalysis)) < position.getTwoDimensionalDistanceFrom (
            other.position));
    }

    protected double getCosineOfAngleForClimb ()
    {
        return (((model == AircraftModel.Boeing777200) || (model == AircraftModel.Boeing777300)) ?
        0.97 : (((model == AircraftModel.Boeing737300) || (model == AircraftModel.Boeing737400)) ||
            (model == AircraftModel.Boeing737500)) ?
        0.96 : (model == AircraftModel.Boeing717) ?
        0.95 : ((model == AircraftModel.Boeing737600) || (model == AircraftModel.Boeing737900)) ?
        0.96 : (model == AircraftModel.BoeingMD80) ?
        0.95 : (model == AircraftModel.Boeing747400) ?
        0.96 : (model == AircraftModel.BoeingMD90) ?
        0.95 : ((model == AircraftModel.Boeing757200) || (model == AircraftModel.Boeing767400)) ?
        0.96 : 0.94);
    }

    protected Vector getVelocityForAscentOrDescent (boolean isAscent)
    {
        double _vLet_cosOfAngle_71_17 = (isAscent ?
        getCosineOfAngleForClimb () : Aircraft.cosOfDescentAngle);
        double _vLet_vx2plusvy2_73_17 = (_eSystem._oExp (velocity.x, 2) + _eSystem._oExp (velocity.y,
            2));
        double _vLet_vz_74_17 = _eSystem._oExp ((_eSystem._oExp (_eSystem._oDiv (
            _vLet_vx2plusvy2_73_17, (_eSystem._oExp (_vLet_vx2plusvy2_73_17, 0.5) *
            _vLet_cosOfAngle_71_17)), 2) - _vLet_vx2plusvy2_73_17), _eSystem._oDiv (1, 2));
        return new Vector (velocity.x, velocity.y, _vLet_vz_74_17, VectorType.Velocity, (VectorType)
            null);
    }

    protected Aircraft (Vector _vposition, Vector _vvelocity, boolean _visElevatingOrDescending,
        double _vtargetHeight, double _vboundaryRadius, int _vstatus, AircraftStatus _t0_vstatus,
        _eSeq _videntification, char _t0_videntification, int _vmodel, AircraftModel _t0_vmodel)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((_vposition.type == VectorType.Position) && (_vvelocity.type == VectorType.
                    Velocity)))) throw new _xPre ("Aircraft.pd:78,28");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        position = _vposition;
        velocity = _vvelocity;
        isElevatingOrDescending = _visElevatingOrDescending;
        targetHeight = _vtargetHeight;
        boundaryRadius = _vboundaryRadius;
        status = _vstatus;
        identification = _videntification;
        model = _vmodel;
        conflictStatus = ConflictStatus.NoConflict;
        _lc_Aircraft ("Aircraft.pd:79,14");
    }

    public double speed ()
    {
        return velocity.magnitude ();
    }

    public boolean breaksMinimumVerticalSeparation (Aircraft other)
    {
        double _vLet_heightDifference_97_17 = ((position.y < other.position.y) ?
        (other.position.y - position.y) : (position.y - other.position.y));
        return (((position.y <= Aircraft.verticalBreakPoint) && (other.position.y <= Aircraft.
            verticalBreakPoint)) ?
        (_vLet_heightDifference_97_17 < 300.0) : (_vLet_heightDifference_97_17 < 600.0));
    }

    public int getConflictStatus (Aircraft other)
    {
        return ((!breaksMinimumVerticalSeparation (other)) ?
        ConflictStatus.NoConflict : isInConflictWith (other) ?
        ConflictStatus.Conflicted : ((!velocity._lEqual (other.velocity)) && potentialFutureConflict
            (other)) ?
        ConflictStatus.PotentialFutureConflict : ConflictStatus.NoConflict);
    }

    public Vector positionAfterFlying (double time)
    {
        return position.plus (velocity._oStar (time), VectorType.Position, (VectorType) null);
    }

    public Aircraft getCraftAfterFlying (double time)
    {
        Vector _vLet_posAfterFlying_113_17 = positionAfterFlying (time);
        return ((!isElevatingOrDescending) ?
        new Aircraft (_vLet_posAfterFlying_113_17, velocity, isElevatingOrDescending, targetHeight,
            boundaryRadius, status, (AircraftStatus) null, identification, (char) 0, model, (
            AircraftModel) null) : new Aircraft (_vLet_posAfterFlying_113_17, new Vector (velocity.x,
            velocity.y, 0.0, VectorType.Velocity, (VectorType) null), false, 0.0, boundaryRadius,
            status, (AircraftStatus) null, identification, (char) 0, model, (AircraftModel) null));
    }

    public double timeToConflict (Aircraft other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((!isInConflictWith (other)) && (!velocity._lEqual (other.velocity))))) throw
                    new _xPre ("Aircraft.pd:119,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        double _vLet_timeToColl_120_17 = timeToCollision (other);
        return ((0.0 <= _vLet_timeToColl_120_17) ?
        (_vLet_timeToColl_120_17 - timeToHypotheticalCollisionWith (other)) : 100000.0);
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
            identification, (char) 0, cs, (ConflictStatus) null, model, (AircraftModel) null);
    }

    public Aircraft getCraftTargettingHeight (double heightToTarget)
    {
        return ((heightToTarget == position.z) ?
        new Aircraft (position, velocity, boundaryRadius, status, (AircraftStatus) null,
            identification, (char) 0, model, (AircraftModel) null) : new Aircraft (position,
            getVelocityForAscentOrDescent ((position.z < heightToTarget)), true, heightToTarget,
            boundaryRadius, status, (AircraftStatus) null, identification, (char) 0, model, (
            AircraftModel) null));
    }

    public Aircraft (Vector _vposition, Vector _vvelocity, double _vboundaryRadius, int _vstatus,
        AircraftStatus _t0_vstatus, _eSeq _videntification, char _t0_videntification, int _vmodel,
        AircraftModel _t0_vmodel)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((((_vposition.type == VectorType.Position) && (_vvelocity.type == VectorType.
                    Velocity)) && (!_videntification.empty ())))) throw new _xPre (
                    "Aircraft.pd:138,28");
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
        model = _vmodel;
        conflictStatus = ConflictStatus.NoConflict;
        isElevatingOrDescending = false;
        targetHeight = 0.0;
        _lc_Aircraft ("Aircraft.pd:141,13");
    }

    public Aircraft (Vector _vposition, Vector _vvelocity, double _vboundaryRadius, int _vstatus,
        AircraftStatus _t0_vstatus, _eSeq _videntification, char _t0_videntification, int
        _vconflictStatus, ConflictStatus _t0_vconflictStatus, int _vmodel, AircraftModel _t0_vmodel)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((((_vposition.type == VectorType.Position) && (_vvelocity.type == VectorType.
                    Velocity)) && (!_videntification.empty ())))) throw new _xPre (
                    "Aircraft.pd:144,28");
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
        model = _vmodel;
        isElevatingOrDescending = false;
        targetHeight = 0.0;
        _lc_Aircraft ("Aircraft.pd:146,14");
    }

    public boolean _lEqual (Aircraft _vArg_11_11)
    {
        if (this == _vArg_11_11)
        {
            return true;
        }
        return ((((((((_vArg_11_11.position._lEqual (position) && _vArg_11_11.velocity._lEqual (
            velocity)) && (_vArg_11_11.boundaryRadius == boundaryRadius)) && (_vArg_11_11.status ==
            status)) && _vArg_11_11.identification._lEqual (identification)) && (_vArg_11_11.
            conflictStatus == conflictStatus)) && (_vArg_11_11.model == model)) && (_vArg_11_11.
            isElevatingOrDescending == isElevatingOrDescending)) && (_vArg_11_11.targetHeight ==
            targetHeight));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == Aircraft.class && _lEqual ((
            Aircraft) _lArg));
    }

}


// End of file.
