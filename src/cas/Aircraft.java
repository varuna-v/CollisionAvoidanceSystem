//***********************************************************************************************
//* File: 'Aircraft.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/Aircraft.pd'
//* by Perfect Developer version 6.10.01 at 08:31:11 UTC on Thursday March 12th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf8E5F.tmp
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

    protected final static double verticalBreakPoint = 8800.0;
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
    protected boolean futureConflict (Aircraft other)
    {
        return (breaksMinimumVerticalSeparation (other) && (getMinimum2DDistanceBetweenPaths (other)
            <= getBiggerRadius (other)));
    }

    protected double getMinimum2DDistanceBetweenPaths (Aircraft other)
    {
        double _vLet_tForMinD_36_17 = getTimeToMinimumDistanceBetweenPaths (other);
        return ((_vLet_tForMinD_36_17 < 0.0) ?
        100000.0 : positionAfterFlying (_vLet_tForMinD_36_17).getTwoDimensionalDistanceFrom (other.
            positionAfterFlying (_vLet_tForMinD_36_17)));
    }

    protected double getTimeToMinimumDistanceBetweenPaths (Aircraft other)
    {
        QuadraticEquation _vLet_magSquare_41_17 = getSquareOfMagnitudeOfPostionOfOtherWRTThis (other)
            ;
        return _vLet_magSquare_41_17.getXForMinimumValue ();
    }

    protected QuadraticEquation getSquareOfMagnitudeOfPostionOfOtherWRTThis (Aircraft other)
    {
        VectorWithVariables _vLet_q1_45_17 = new VectorWithVariables (position.x, position.y,
            position.z, velocity.x, velocity.y, velocity.z);
        VectorWithVariables _vLet_q2_46_16 = new VectorWithVariables (other.position.x, other.
            position.y, other.position.z, other.velocity.x, other.velocity.y, other.velocity.z);
        VectorWithVariables _vLet_q21_47_16 = _vLet_q2_46_16._oMinus (_vLet_q1_45_17);
        return _vLet_q21_47_16.squareOf2DMagnitude ();
    }

    protected double getBiggerRadius (Aircraft other)
    {
        return ((other.boundaryRadius < boundaryRadius) ?
        boundaryRadius : other.boundaryRadius);
    }

    protected boolean isInConflictWith (Aircraft other)
    {
        return (breaksMinimumVerticalSeparation (other) && (position.getTwoDimensionalDistanceFrom (
            other.position) <= getBiggerRadius (other)));
    }

    protected double timeToCollision (Aircraft other)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((!isInConflictWith (other)) && (!velocity._lEqual (other.velocity))))) throw
                    new _xPre ("Aircraft.pd:59,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        Vector _vLet_velocityDifference_60_17 = other.velocity._oMinus (velocity);
        return _eSystem._oDiv (position._oMinus (other.position).dotProduct (
            _vLet_velocityDifference_60_17), _eSystem._oExp (_vLet_velocityDifference_60_17.
            magnitude (), 2));
    }

    protected double getCosineOfAngleForClimb ()
    {
        return 0.5;
    }

    protected Vector getVelocityForAscentOrDescent (boolean isAscent)
    {
        double _vLet_cosOfAngle_77_17 = (isAscent ?
        getCosineOfAngleForClimb () : Aircraft.cosOfDescentAngle);
        double _vLet_vx2plusvy2_79_17 = (_eSystem._oExp (velocity.x, 2) + _eSystem._oExp (velocity.y,
            2));
        double _vLet_vz_80_17 = _eSystem._oExp ((_eSystem._oExp (_eSystem._oDiv (
            _vLet_vx2plusvy2_79_17, (_eSystem._oExp (_vLet_vx2plusvy2_79_17, 0.5) *
            _vLet_cosOfAngle_77_17)), 2) - _vLet_vx2plusvy2_79_17), 0.5);
        double _vLet_elevationMultiplier_81_17 = (isAscent ?
        1.0 : (- 1.0));
        return new Vector (velocity.x, velocity.y, (_vLet_vz_80_17 * _vLet_elevationMultiplier_81_17)
            , VectorType.Velocity, (VectorType) null);
    }

    protected boolean hasCrossedTargetHeight (Vector newPosition)
    {
        return (isElevatingOrDescending && (((position.z < targetHeight) && (targetHeight <=
            newPosition.z)) || ((targetHeight < position.z) && (newPosition.z <= targetHeight))));
    }

    protected Vector getPositionAfterStraightFlight (double time, Vector velocityForFlight, Vector
        startPosition)
    {
        return startPosition.plus (velocityForFlight._oStar (time), VectorType.Position, (VectorType)
            null);
    }

    protected double getTimeToTargetHeight ()
    {
        return _eSystem._oDiv ((targetHeight - position.z), velocity.z);
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
                    Velocity)))) throw new _xPre ("Aircraft.pd:96,28");
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
        _lc_Aircraft ("Aircraft.pd:97,14");
    }

    protected Aircraft (Vector _vposition, Vector _vvelocity, boolean _visElevatingOrDescending,
        double _vtargetHeight, double _vboundaryRadius, int _vstatus, AircraftStatus _t0_vstatus,
        _eSeq _videntification, char _t0_videntification, int _vconflictStatus, ConflictStatus
        _t0_vconflictStatus, int _vmodel, AircraftModel _t0_vmodel)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((_vposition.type == VectorType.Position) && (_vvelocity.type == VectorType.
                    Velocity)))) throw new _xPre ("Aircraft.pd:100,28");
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
        conflictStatus = _vconflictStatus;
        model = _vmodel;
        _lc_Aircraft ("Aircraft.pd:99,5");
    }

    public double speed ()
    {
        return velocity.magnitude ();
    }

    public boolean breaksMinimumVerticalSeparation (Aircraft other)
    {
        double _vLet_heightDifference_118_17 = ((position.z < other.position.z) ?
        (other.position.z - position.z) : (position.z - other.position.z));
        return (((position.z <= Aircraft.verticalBreakPoint) && (other.position.z <= Aircraft.
            verticalBreakPoint)) ?
        (_vLet_heightDifference_118_17 < 300.0) : (_vLet_heightDifference_118_17 < 600.0));
    }

    public int getConflictStatus (Aircraft other)
    {
        return ((!breaksMinimumVerticalSeparation (other)) ?
        ConflictStatus.NoConflict : isInConflictWith (other) ?
        ConflictStatus.Conflicted : futureConflict (other) ?
        ConflictStatus.PotentialFutureConflict : ConflictStatus.NoConflict);
    }

    public Vector positionAfterFlying (double time)
    {
        return position.plus (velocity._oStar (time), VectorType.Position, (VectorType) null);
    }

    public Aircraft getCraftAfterFlying (double time)
    {
        Vector _vLet_posAfterStraightFlight_134_17 = positionAfterFlying (time);
        if (hasCrossedTargetHeight (_vLet_posAfterStraightFlight_134_17))
        {
            double _vLet_timeToTarget_135_70 = getTimeToTargetHeight ();
            Vector _vLet_posAtTarget_136_46 = positionAfterFlying (_vLet_timeToTarget_135_70);
            Vector _vLet_newVelocity_137_46 = new Vector (velocity.x, velocity.y, VectorType.
                Velocity, (VectorType) null);
            Vector _vLet_newPos_138_46 = getPositionAfterStraightFlight ((time -
                _vLet_timeToTarget_135_70), _vLet_newVelocity_137_46, _vLet_posAtTarget_136_46);
            return new Aircraft (_vLet_newPos_138_46, _vLet_newVelocity_137_46, false, 0.0,
                boundaryRadius, status, (AircraftStatus) null, identification, (char) 0, model, (
                AircraftModel) null);
        }
        else
        {
            return new Aircraft (_vLet_posAfterStraightFlight_134_17, velocity,
                isElevatingOrDescending, targetHeight, boundaryRadius, status, (AircraftStatus) null,
                identification, (char) 0, model, (AircraftModel) null);
        }
    }

    public double timeToConflict (Aircraft other)
    {
        if ((!futureConflict (other)))
        {
            return 100000.0;
        }
        else
        {
            QuadraticEquation _vLet_magSquare_155_23 = getSquareOfMagnitudeOfPostionOfOtherWRTThis (
                other);
            QuadraticEquation _vLet_eqn_156_23 = _vLet_magSquare_155_23._oMinus (new
                QuadraticEquation (0.0, 0.0, _eSystem._oExp (getBiggerRadius (other), 2.0)));
            return _vLet_eqn_156_23.solve ();
        }
    }

    public _eSeq _rtoString ()
    {
        return _eSystem._lString ("\n Id:")._oPlusPlus (identification, (_eTemplate_0) null).
            _oPlusPlus (_eSystem._lString ("\n Position: "), (_eTemplate_0) null)._oPlusPlus (
            position._rtoString (), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString (
            "\n Velocity: "), (_eTemplate_0) null)._oPlusPlus (velocity._rtoString (), (_eTemplate_0)
            null)._oPlusPlus (_eSystem._lString ("\n Conflict Status: "), (_eTemplate_0) null).
            _oPlusPlus (ConflictStatus._ltoString (conflictStatus), (_eTemplate_0) null)._oPlusPlus
            (_eSystem._lString ("\n"), (_eTemplate_0) null)._oPlusPlus (_eSystem._ltoString (
            boundaryRadius), (_eTemplate_0) null);
    }

    public Aircraft getCraftWithConflictStatus (int cs, ConflictStatus _t0cs)
    {
        return new Aircraft (position, velocity, isElevatingOrDescending, targetHeight,
            boundaryRadius, status, (AircraftStatus) null, identification, (char) 0, cs, (
            ConflictStatus) null, model, (AircraftModel) null);
    }

    public Aircraft getCraftTargettingHeight (double heightToTarget)
    {
        return ((heightToTarget == position.z) ?
        new Aircraft (position, velocity, isElevatingOrDescending, targetHeight, boundaryRadius,
            status, (AircraftStatus) null, identification, (char) 0, model, (AircraftModel) null) :
            new Aircraft (position, getVelocityForAscentOrDescent ((position.z < heightToTarget)),
            true, heightToTarget, boundaryRadius, status, (AircraftStatus) null, identification, (
            char) 0, model, (AircraftModel) null));
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
                    "Aircraft.pd:176,28");
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
        _lc_Aircraft ("Aircraft.pd:179,13");
    }

    public boolean _lEqual (Aircraft _vArg_12_11)
    {
        if (this == _vArg_12_11)
        {
            return true;
        }
        return ((((((((_vArg_12_11.position._lEqual (position) && _vArg_12_11.velocity._lEqual (
            velocity)) && (_vArg_12_11.boundaryRadius == boundaryRadius)) && (_vArg_12_11.status ==
            status)) && _vArg_12_11.identification._lEqual (identification)) && (_vArg_12_11.
            conflictStatus == conflictStatus)) && (_vArg_12_11.model == model)) && (_vArg_12_11.
            isElevatingOrDescending == isElevatingOrDescending)) && (_vArg_12_11.targetHeight ==
            targetHeight));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == Aircraft.class && _lEqual ((
            Aircraft) _lArg));
    }

}


// End of file.
