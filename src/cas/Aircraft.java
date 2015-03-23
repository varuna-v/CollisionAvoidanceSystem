//***********************************************************************************************
//* File: 'Aircraft.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/Aircraft.pd'
//* by Perfect Developer version 6.10.01 at 12:25:36 UTC on Monday March 23rd 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf3AE.tmp
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
                    "Aircraft.pd:23,29", _lArg);
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
                    "Aircraft.pd:24,29", _lArg);
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
                    "Aircraft.pd:25,15", _lArg);
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

    protected final static double angleScale = 0.52;
    protected final static double verticalBreakPoint = 8800.0;
    protected final static double cosOfDescentAngle = 0.99;
    public Vector position;
    public Vector velocity;
    public double boundaryRadius;
    protected int status;
    public _eSeq identification;
    public int conflictStatus;
    protected int model;
    protected double targetHeight;
    protected boolean futureConflict (Aircraft other)
    {
        return (breaksMinimumVerticalSeparation (other) && (getMinimum2DDistanceBetweenPaths (other)
            <= getBiggerRadius (other)));
    }

    protected double getMinimum2DDistanceBetweenPaths (Aircraft other)
    {
        double _vLet_tForMinD_33_17 = getTimeToMinimumDistanceBetweenPaths (other);
        return ((_vLet_tForMinD_33_17 < 0.0) ?
        100000.0 : positionAfterFlying (_vLet_tForMinD_33_17).getTwoDimensionalDistanceFrom (other.
            positionAfterFlying (_vLet_tForMinD_33_17)));
    }

    protected double getTimeToMinimumDistanceBetweenPaths (Aircraft other)
    {
        Equation _vLet_magSquare_38_17 = getSquareOfMagnitudeOfPostionOfOtherWRTThis (other);
        return _vLet_magSquare_38_17.getXForMinimumValue ();
    }

    protected Equation getSquareOfMagnitudeOfPostionOfOtherWRTThis (Aircraft other)
    {
        VectorWithVariables _vLet_q1_42_17 = new VectorWithVariables (position.x, position.y,
            position.z, velocity.x, velocity.y, velocity.z);
        VectorWithVariables _vLet_q2_43_16 = new VectorWithVariables (other.position.x, other.
            position.y, other.position.z, other.velocity.x, other.velocity.y, other.velocity.z);
        VectorWithVariables _vLet_q21_44_16 = _vLet_q2_43_16._oMinus (_vLet_q1_42_17);
        return _vLet_q21_44_16.squareOf2DMagnitude ();
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
                    new _xPre ("Aircraft.pd:56,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        Vector _vLet_velocityDifference_57_17 = other.velocity._oMinus (velocity);
        return _eSystem._oDiv (position._oMinus (other.position).dotProduct (
            _vLet_velocityDifference_57_17), _eSystem._oExp (_vLet_velocityDifference_57_17.
            magnitude (), 2));
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
        double _vLet_cosOfAngle_73_17 = (Aircraft.angleScale * (isAscent ?
        getCosineOfAngleForClimb () : Aircraft.cosOfDescentAngle));
        double _vLet_vx2plusvy2_75_17 = (_eSystem._oExp (velocity.x, 2) + _eSystem._oExp (velocity.y,
            2));
        double _vLet_vz_76_17 = _eSystem._oExp ((_eSystem._oExp (_eSystem._oDiv (
            _vLet_vx2plusvy2_75_17, (_eSystem._oExp (_vLet_vx2plusvy2_75_17, 0.5) *
            _vLet_cosOfAngle_73_17)), 2) - _vLet_vx2plusvy2_75_17), 0.5);
        double _vLet_elevationMultiplier_77_17 = (isAscent ?
        1.0 : (- 1.0));
        return new Vector (velocity.x, velocity.y, (_vLet_vz_76_17 * _vLet_elevationMultiplier_77_17)
            , VectorType.Velocity, (VectorType) null);
    }

    protected boolean hasCrossedTargetHeight (Vector newPosition)
    {
        return ((((status == AircraftStatus.Ascending) && (position.z < targetHeight)) && (
            targetHeight <= newPosition.z)) || (((status == AircraftStatus.Descending) && (
            targetHeight < position.z)) && (newPosition.z <= targetHeight)));
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

    protected Aircraft (Vector _vposition, Vector _vvelocity, double _vtargetHeight, double
        _vboundaryRadius, int _vstatus, AircraftStatus _t0_vstatus, _eSeq _videntification, char
        _t0_videntification, int _vmodel, AircraftModel _t0_vmodel)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((_vposition.type == VectorType.Position) && (_vvelocity.type == VectorType.
                    Velocity)))) throw new _xPre ("Aircraft.pd:92,28");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        position = _vposition;
        velocity = _vvelocity;
        targetHeight = _vtargetHeight;
        boundaryRadius = _vboundaryRadius;
        status = _vstatus;
        identification = _videntification;
        model = _vmodel;
        conflictStatus = ConflictStatus.NoConflict;
        _lc_Aircraft ("Aircraft.pd:93,14");
    }

    protected Aircraft (Vector _vposition, Vector _vvelocity, double _vtargetHeight, double
        _vboundaryRadius, int _vstatus, AircraftStatus _t0_vstatus, _eSeq _videntification, char
        _t0_videntification, int _vconflictStatus, ConflictStatus _t0_vconflictStatus, int _vmodel,
        AircraftModel _t0_vmodel)
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
        targetHeight = _vtargetHeight;
        boundaryRadius = _vboundaryRadius;
        status = _vstatus;
        identification = _videntification;
        conflictStatus = _vconflictStatus;
        model = _vmodel;
        _lc_Aircraft ("Aircraft.pd:95,5");
    }

    public double speed ()
    {
        return velocity.magnitude ();
    }

    public double getMinimumVerticalSeparation (Aircraft other)
    {
        return (((position.z <= Aircraft.verticalBreakPoint) && (other.position.z <= Aircraft.
            verticalBreakPoint)) ?
        300.0 : 600.0);
    }

    public double getHeightDifference (Aircraft other)
    {
        return ((position.z < other.position.z) ?
        (other.position.z - position.z) : (position.z - other.position.z));
    }

    public boolean breaksMinimumVerticalSeparation (Aircraft other)
    {
        return (getHeightDifference (other) < getMinimumVerticalSeparation (other));
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
            return new Aircraft (_vLet_newPos_138_46, _vLet_newVelocity_137_46, 0.0, boundaryRadius,
                AircraftStatus.FlyingAtLevel, (AircraftStatus) null, identification, (char) 0, model,
                (AircraftModel) null);
        }
        else
        {
            return new Aircraft (_vLet_posAfterStraightFlight_134_17, velocity, targetHeight,
                boundaryRadius, status, (AircraftStatus) null, identification, (char) 0, model, (
                AircraftModel) null);
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
            Equation _vLet_magSquare_145_23 = getSquareOfMagnitudeOfPostionOfOtherWRTThis (other);
            Equation _vLet_eqn_146_23 = _vLet_magSquare_145_23._oMinus (new Equation (0.0, 0.0,
                _eSystem._oExp (getBiggerRadius (other), 2.0)));
            return _vLet_eqn_146_23.solve ();
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
        return new Aircraft (position, velocity, targetHeight, boundaryRadius, status, (
            AircraftStatus) null, identification, (char) 0, cs, (ConflictStatus) null, model, (
            AircraftModel) null);
    }

    public Aircraft getCraftTargettingHeight (double heightToTarget)
    {
        return ((heightToTarget == position.z) ?
        new Aircraft (position, velocity, targetHeight, boundaryRadius, status, (AircraftStatus)
            null, identification, (char) 0, model, (AircraftModel) null) : (position.z <
            heightToTarget) ?
        new Aircraft (position, getVelocityForAscentOrDescent (true), heightToTarget, boundaryRadius,
            AircraftStatus.Ascending, (AircraftStatus) null, identification, (char) 0, model, (
            AircraftModel) null) : new Aircraft (position, getVelocityForAscentOrDescent (false),
            heightToTarget, boundaryRadius, AircraftStatus.Descending, (AircraftStatus) null,
            identification, (char) 0, model, (AircraftModel) null));
    }

    public Aircraft (Vector _vposition, Vector _vvelocity, double _vboundaryRadius, _eSeq
        _videntification, char _t0_videntification, int _vmodel, AircraftModel _t0_vmodel)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((((_vposition.type == VectorType.Position) && (_vvelocity.type == VectorType.
                    Velocity)) && (!_videntification.empty ())))) throw new _xPre (
                    "Aircraft.pd:161,28");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        position = _vposition;
        velocity = _vvelocity;
        boundaryRadius = _vboundaryRadius;
        identification = _videntification;
        model = _vmodel;
        conflictStatus = ConflictStatus.NoConflict;
        status = AircraftStatus.FlyingAtLevel;
        targetHeight = 0.0;
        _lc_Aircraft ("Aircraft.pd:164,13");
    }

    public boolean _lEqual (Aircraft _vArg_10_11)
    {
        if (this == _vArg_10_11)
        {
            return true;
        }
        return (((((((_vArg_10_11.position._lEqual (position) && _vArg_10_11.velocity._lEqual (
            velocity)) && (_vArg_10_11.boundaryRadius == boundaryRadius)) && (_vArg_10_11.status ==
            status)) && _vArg_10_11.identification._lEqual (identification)) && (_vArg_10_11.
            conflictStatus == conflictStatus)) && (_vArg_10_11.model == model)) && (_vArg_10_11.
            targetHeight == targetHeight));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == Aircraft.class && _lEqual ((
            Aircraft) _lArg));
    }

}


// End of file.
