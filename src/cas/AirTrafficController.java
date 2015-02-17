//***********************************************************************************************
//* File: 'AirTrafficController.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/AirTrafficController.pd'
//* by Perfect Developer version 6.10.01 at 04:35:47 UTC on Tuesday February 17th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etfC3F0.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class AirTrafficController extends _eAny
{
    final void _lc_AirTrafficController (String _lArg)
    {
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_17_15;
                {
                    _vQuantifierResult_17_15 = true;
                    int _vCaptureCount_a_17_25 = aircrafts._oHash ();
                    int _vLoopCounter_17_22 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_17_22 == _vCaptureCount_a_17_25) || (!
                            _vQuantifierResult_17_15))) break;
                        _vQuantifierResult_17_15 = (((minX <= ((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_17_22)).position.x) && (((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_17_22)).position.x <= maxX)) && ((minY <= ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_17_22)).position.y) && (((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_17_22)).position.y <= maxY)));
                        if ((!_vQuantifierResult_17_15))
                        {
                        }
                        else
                        {
                            _vLoopCounter_17_22 = _eSystem._oSucc (_vLoopCounter_17_22);
                        }
                    }
                }
                if (!(_vQuantifierResult_17_15)) throw new _xClassInvariantItem (
                    "AirTrafficController.pd:17,15", _lArg);
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
                boolean _vQuantifierResult_18_15;
                {
                    _vQuantifierResult_18_15 = true;
                    int _vCaptureCount_i_18_29 = aircrafts._oHash ();
                    int _vLoopCounter_18_22 = 0;
                    for (;;)
                    {
                        if (((_vCaptureCount_i_18_29 <= _vLoopCounter_18_22) || (!
                            _vQuantifierResult_18_15))) break;
                        boolean _vQuantifierResult_18_42;
                        {
                            _vQuantifierResult_18_42 = true;
                            int _vCaptureCount_j_18_61 = aircrafts._oHash ();
                            int _vLoopCounter_18_50 = (1 + _vLoopCounter_18_22);
                            for (;;)
                            {
                                if (((_vCaptureCount_j_18_61 <= _vLoopCounter_18_50) || (!
                                    _vQuantifierResult_18_42))) break;
                                _vQuantifierResult_18_42 = (!((Aircraft) aircrafts._oIndex (
                                    _vLoopCounter_18_50))._lEqual (((Aircraft) aircrafts._oIndex (
                                    _vLoopCounter_18_22))));
                                if ((!_vQuantifierResult_18_42))
                                {
                                }
                                else
                                {
                                    _vLoopCounter_18_50 = _eSystem._oSucc (_vLoopCounter_18_50);
                                }
                            }
                        }
                        _vQuantifierResult_18_15 = _vQuantifierResult_18_42;
                        if ((!_vQuantifierResult_18_15))
                        {
                        }
                        else
                        {
                            _vLoopCounter_18_22 = _eSystem._oSucc (_vLoopCounter_18_22);
                        }
                    }
                }
                if (!(_vQuantifierResult_18_15)) throw new _xClassInvariantItem (
                    "AirTrafficController.pd:18,15", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
    }

    protected void _lClassInvariantCheck (String _lArg)
    {
        _lc_AirTrafficController (_lArg);
    }

    public _eSeq aircrafts;
    protected double minX;
    protected double maxX;
    protected double minY;
    protected double maxY;
    public int numberOfAirCrafts ()
    {
        return aircrafts._oHash ();
    }

    public _eSet getPairs ()
    {
        _eSeq _vForYield_31_22 = new _eSeq ();
        {
            int _vCaptureCount_i_31_34 = aircrafts._oHash ();
            int _vLoopCounter_31_27 = 0;
            for (;;)
            {
                if ((_vCaptureCount_i_31_34 <= _vLoopCounter_31_27)) break;
                _eSeq _vForYield_31_51 = new _eSeq ();
                {
                    int _vCaptureCount_j_31_67 = aircrafts._oHash ();
                    int _vLoopCounter_31_56 = (1 + _vLoopCounter_31_27);
                    for (;;)
                    {
                        if ((_vCaptureCount_j_31_67 <= _vLoopCounter_31_56)) break;
                        _vForYield_31_51 = _vForYield_31_51.append (((_eAny) new AircraftPair (((
                            Aircraft) aircrafts._oIndex (_vLoopCounter_31_27)), ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_31_56)))));
                        _vLoopCounter_31_56 = _eSystem._oSucc (_vLoopCounter_31_56);
                    }
                }
                _vForYield_31_22 = _vForYield_31_22.append (((_eAny) _vForYield_31_51.ran ()));
                _vLoopCounter_31_27 = _eSystem._oSucc (_vLoopCounter_31_27);
            }
        }
        _eSet _vLet_s_31_17 = _vForYield_31_22.ran ();
        return Ertsys.RtsGlobals.flatten (_vLet_s_31_17, (_eSet) null, (_eTemplate_0) null);
    }

    public _eMap conflicts ()
    {
        _eSet _vLet_pairs_36_17 = getPairs ();
        _eSet _vForYield_37_53 = new _eSet ();
        {
            int _vCaptureCount_p_37_61 = _vLet_pairs_36_17._oHash ();
            int _vLoopCounter_37_58 = 0;
            for (;;)
            {
                if ((_vLoopCounter_37_58 == _vCaptureCount_p_37_61)) break;
                _vForYield_37_53 = _vForYield_37_53.append (((_eAny) new _ePair (_vLet_pairs_36_17.
                    _oIndex (_vLoopCounter_37_58), ((_eAny) new ConflictStatus (((AircraftPair)
                    _vLet_pairs_36_17._oIndex (_vLoopCounter_37_58)).getConflictStatus ())))));
                _vLoopCounter_37_58 = _eSystem._oSucc (_vLoopCounter_37_58);
            }
        }
        return new _eMap (_vForYield_37_53, (_ePair) null, (_eTemplate_0) null, (_eTemplate_1) null);
    }

    public _eSeq getMinimumTimeToConflict ()
    {
        _eSet _vLet_pairs_42_17 = getPairs ();
        boolean _vCondResult_43_26;
        if ((0 < _vLet_pairs_42_17._oHash ()))
        {
            boolean _vQuantifierResult_43_27;
            {
                _vQuantifierResult_43_27 = false;
                int _vCaptureCount_p_43_38 = _vLet_pairs_42_17._oHash ();
                int _vLoopCounter_43_35 = 0;
                for (;;)
                {
                    if (((_vLoopCounter_43_35 == _vCaptureCount_p_43_38) || _vQuantifierResult_43_27)
                        ) break;
                    _vQuantifierResult_43_27 = (ConflictStatus.Conflicted == ((AircraftPair)
                        _vLet_pairs_42_17._oIndex (_vLoopCounter_43_35)).getConflictStatus ());
                    if (_vQuantifierResult_43_27)
                    {
                    }
                    else
                    {
                        _vLoopCounter_43_35 = _eSystem._oSucc (_vLoopCounter_43_35);
                    }
                }
            }
            _vCondResult_43_26 = _vQuantifierResult_43_27;
        }
        else
        {
            _vCondResult_43_26 = false;
        }
        if (_vCondResult_43_26)
        {
            return _eSystem._lString ("0");
        }
        else
        {
            _eSet _vForYield_44_42 = new _eSet ();
            {
                int _vCaptureCount_p_44_56 = _vLet_pairs_42_17._oHash ();
                int _vLoopCounter_44_53 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_44_53 == _vCaptureCount_p_44_56)) break;
                    if (((AircraftPair) _vLet_pairs_42_17._oIndex (_vLoopCounter_44_53)).
                        breaksMinimumVerticalSeparation ())
                    {
                        _vForYield_44_42 = _vForYield_44_42.append (((_eAny) new _eWrapper_real (((
                            AircraftPair) _vLet_pairs_42_17._oIndex (_vLoopCounter_44_53)).
                            timeToConflict ())));
                    }
                    _vLoopCounter_44_53 = _eSystem._oSucc (_vLoopCounter_44_53);
                }
            }
            _eSet _vLet_timesToConsider_44_23 = _vForYield_44_42;
            return (((0 < _vLet_timesToConsider_44_23._oHash ()) && (!(100000.0 == ((_eWrapper_real)
                _vLet_timesToConsider_44_23.min ()).value))) ?
            _eSystem._ltoString (((_eWrapper_real) _vLet_timesToConsider_44_23.min ()).value) :
                _eSystem._lString ("infinite"));
        }
    }

    public _eSeq getAircraftPairsOrderedByTimeToConflict ()
    {
        return getPairs ().permndec ();
    }

    public _eSeq printConflicts ()
    {
        return _eSystem._lString ("Number of aircrafts in system: ")._oPlusPlus (_eSystem._ltoString
            (numberOfAirCrafts ()), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("<br>"), (
            _eTemplate_0) null)._oPlusPlus (getConflictsString (conflicts ().pairs (), (_ePair) null,
            (AircraftPair) null, (ConflictStatus) null), (_eTemplate_0) null);
    }

    public _eSeq getConflictsString (_eSet cons, _ePair _t0cons, AircraftPair _t1cons,
        ConflictStatus _t2cons)
    {
        if ((0 == cons._oHash ()))
        {
            return _eSystem._lString ("");
        }
        else
        {
            _ePair _vThatAny_57_28 = null;
            {
                boolean _vSelectorCondition_57_28;
                _vSelectorCondition_57_28 = false;
                int _vCaptureCount_k_57_35 = cons._oHash ();
                int _vLoopCounter_57_32 = 0;
                for (;;)
                {
                    if (((_vLoopCounter_57_32 == _vCaptureCount_k_57_35) ||
                        _vSelectorCondition_57_28)) break;
                    _vSelectorCondition_57_28 = ((_ePair) cons._oIndex (_vLoopCounter_57_32)).
                        _lEqual (((_ePair) cons._oIndex (_vLoopCounter_57_32)));
                    if (_vSelectorCondition_57_28)
                    {
                        _vThatAny_57_28 = ((_ePair) cons._oIndex (_vLoopCounter_57_32));
                    }
                    if (_vSelectorCondition_57_28)
                    {
                    }
                    else
                    {
                        _vLoopCounter_57_32 = _eSystem._oSucc (_vLoopCounter_57_32);
                    }
                }
                if (_eSystem.enableThatOrAny && _eSystem.currentCheckNesting <= _eSystem.
                    maxCheckNesting)
                {
                    _eSystem.currentCheckNesting ++;
                    try
                    {
                        if (!(_vSelectorCondition_57_28)) throw new _xThatOrAny (
                            "AirTrafficController.pd:57,28");
                    }
                    catch (_xCannotEvaluate _lException)
                    {
                    }
                    _eSystem.currentCheckNesting --;
                }
            }
            _ePair _vLet_c_57_23 = _vThatAny_57_28;
            return _eSystem._lString ("Pair <br>")._oPlusPlus (((AircraftPair) _vLet_c_57_23.x).
                _rtoString (), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("<br> Status: "),
                (_eTemplate_0) null)._oPlusPlus (ConflictStatus._ltoString (((ConflictStatus)
                _vLet_c_57_23.y).value), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("<br>"),
                (_eTemplate_0) null)._oPlusPlus (getConflictsString (cons.remove (((_eAny)
                _vLet_c_57_23)), (_ePair) null, (AircraftPair) null, (ConflictStatus) null), (
                _eTemplate_0) null);
        }
    }

    public boolean willAllAircraftsBeInBoundaryAfterFlying (double flyForTime)
    {
        boolean _vQuantifierResult_61_12;
        {
            _vQuantifierResult_61_12 = true;
            int _vCaptureCount_a_61_22 = aircrafts._oHash ();
            int _vLoopCounter_61_19 = 0;
            for (;;)
            {
                if (((_vLoopCounter_61_19 == _vCaptureCount_a_61_22) || (!_vQuantifierResult_61_12)))
                    break;
                _vQuantifierResult_61_12 = willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts
                    ._oIndex (_vLoopCounter_61_19)), flyForTime);
                if ((!_vQuantifierResult_61_12))
                {
                }
                else
                {
                    _vLoopCounter_61_19 = _eSystem._oSucc (_vLoopCounter_61_19);
                }
            }
        }
        return _vQuantifierResult_61_12;
    }

    public boolean willAircraftBeInBoundryAfterFlying (Aircraft aircraft, double flyForTime)
    {
        Vector _vLet_endPosition_64_17 = aircraft.positionAfterFlying (flyForTime);
        return (((minX <= _vLet_endPosition_64_17.x) && (_vLet_endPosition_64_17.x <= maxX)) && ((
            minY <= _vLet_endPosition_64_17.y) && (_vLet_endPosition_64_17.y <= maxY)));
    }

    public int getConflictStatus (Aircraft aircraft, _eMap incconflicts, AircraftPair
        _t0incconflicts, ConflictStatus _t1incconflicts)
    {
        _eSet _vForYield_68_24 = new _eSet ();
        {
            _eSet _vCaptureBound_c_68_51 = incconflicts.pairs ();
            int _vCaptureCount_c_68_51 = _vCaptureBound_c_68_51._oHash ();
            int _vLoopCounter_68_35 = 0;
            for (;;)
            {
                if ((_vLoopCounter_68_35 == _vCaptureCount_c_68_51)) break;
                if ((aircraft._lEqual (((AircraftPair) ((_ePair) _vCaptureBound_c_68_51._oIndex (
                    _vLoopCounter_68_35)).x).craft1) || aircraft._lEqual (((AircraftPair) ((_ePair)
                    _vCaptureBound_c_68_51._oIndex (_vLoopCounter_68_35)).x).craft2)))
                {
                    _vForYield_68_24 = _vForYield_68_24.append (((_ePair) _vCaptureBound_c_68_51.
                        _oIndex (_vLoopCounter_68_35)).y);
                }
                _vLoopCounter_68_35 = _eSystem._oSucc (_vLoopCounter_68_35);
            }
        }
        _eSet _vLet_lst_68_17 = _vForYield_68_24;
        return (_vLet_lst_68_17._ovIn (((_eAny) new ConflictStatus (ConflictStatus.Conflicted))) ?
        ConflictStatus.Conflicted : _vLet_lst_68_17._ovIn (((_eAny) new ConflictStatus (
            ConflictStatus.PotentialFutureConflict))) ?
        ConflictStatus.PotentialFutureConflict : ConflictStatus.NoConflict);
    }

    public void dropIfLeavesBoundaryAfterFlying (double flyForTime)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_75_13;
                {
                    _vQuantifierResult_75_13 = true;
                    int _vCaptureCount_a_75_23 = aircrafts._oHash ();
                    int _vLoopCounter_75_20 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_75_20 == _vCaptureCount_a_75_23) || (!
                            _vQuantifierResult_75_13))) break;
                        _vQuantifierResult_75_13 = (((minX <= ((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_75_20)).position.x) && (((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_75_20)).position.x <= maxX)) && ((minY <= ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_75_20)).position.y) && (((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_75_20)).position.y <= maxY)));
                        if ((!_vQuantifierResult_75_13))
                        {
                        }
                        else
                        {
                            _vLoopCounter_75_20 = _eSystem._oSucc (_vLoopCounter_75_20);
                        }
                    }
                }
                if (!(_vQuantifierResult_75_13)) throw new _xPre ("AirTrafficController.pd:75,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        {
            _eSeq _vThose_76_27 = new _eSeq ();
            {
                int _vCaptureCount_a_76_37 = aircrafts._oHash ();
                int _vLoopCounter_76_34 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_76_34 == _vCaptureCount_a_76_37)) break;
                    if (willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts._oIndex (
                        _vLoopCounter_76_34)), flyForTime))
                    {
                        _vThose_76_27 = _vThose_76_27.append (aircrafts._oIndex (_vLoopCounter_76_34)
                            );
                    }
                    _vLoopCounter_76_34 = _eSystem._oSucc (_vLoopCounter_76_34);
                }
            }
            aircrafts = _vThose_76_27;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:76,14");
    }

    public void fly (double forTime)
    {
        dropIfLeavesBoundaryAfterFlying (forTime);
        {
            _eSeq _vForYield_82_27 = new _eSeq ();
            {
                int _vCaptureCount_craft_82_39 = aircrafts._oHash ();
                int _vLoopCounter_82_32 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_82_32 == _vCaptureCount_craft_82_39)) break;
                    _vForYield_82_27 = _vForYield_82_27.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_82_32)).getCraftAfterFlying (forTime)));
                    _vLoopCounter_82_32 = _eSystem._oSucc (_vLoopCounter_82_32);
                }
            }
            aircrafts = _vForYield_82_27;
        }
        {
            _eMap _vLet_locConflicts_83_19 = conflicts ();
            _eSeq _vForYield_84_28 = new _eSeq ();
            {
                int _vCaptureCount_craft_84_40 = aircrafts._oHash ();
                int _vLoopCounter_84_33 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_84_33 == _vCaptureCount_craft_84_40)) break;
                    _vForYield_84_28 = _vForYield_84_28.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_84_33)).getCraftWithConflictStatus (getConflictStatus
                        (((Aircraft) aircrafts._oIndex (_vLoopCounter_84_33)),
                        _vLet_locConflicts_83_19, (AircraftPair) null, (ConflictStatus) null), (
                        ConflictStatus) null)));
                    _vLoopCounter_84_33 = _eSystem._oSucc (_vLoopCounter_84_33);
                }
            }
            aircrafts = _vForYield_84_28;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:81,19");
    }

    public AirTrafficController (_eSeq _vaircrafts, Aircraft _t0_vaircrafts, double _vminX, double
        _vmaxX, double _vminY, double _vmaxY)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vCondResult_90_13;
                if (((_vminX < _vmaxX) && (_vminY < _vmaxY)))
                {
                    boolean _vQuantifierResult_90_15;
                    {
                        _vQuantifierResult_90_15 = true;
                        int _vCaptureCount_i_90_30 = _vaircrafts._oHash ();
                        int _vLoopCounter_90_23 = 0;
                        for (;;)
                        {
                            if (((_vCaptureCount_i_90_30 <= _vLoopCounter_90_23) || (!
                                _vQuantifierResult_90_15))) break;
                            boolean _vQuantifierResult_90_43;
                            {
                                _vQuantifierResult_90_43 = true;
                                int _vCaptureCount_j_90_62 = _vaircrafts._oHash ();
                                int _vLoopCounter_90_51 = (1 + _vLoopCounter_90_23);
                                for (;;)
                                {
                                    if (((_vCaptureCount_j_90_62 <= _vLoopCounter_90_51) || (!
                                        _vQuantifierResult_90_43))) break;
                                    _vQuantifierResult_90_43 = (!((Aircraft) _vaircrafts._oIndex (
                                        _vLoopCounter_90_51))._lEqual (((Aircraft) _vaircrafts.
                                        _oIndex (_vLoopCounter_90_23))));
                                    if ((!_vQuantifierResult_90_43))
                                    {
                                    }
                                    else
                                    {
                                        _vLoopCounter_90_51 = _eSystem._oSucc (_vLoopCounter_90_51);
                                    }
                                }
                            }
                            _vQuantifierResult_90_15 = _vQuantifierResult_90_43;
                            if ((!_vQuantifierResult_90_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_90_23 = _eSystem._oSucc (_vLoopCounter_90_23);
                            }
                        }
                    }
                    _vCondResult_90_13 = _vQuantifierResult_90_15;
                }
                else
                {
                    _vCondResult_90_13 = false;
                }
                boolean _vCondResult_91_13;
                if (_vCondResult_90_13)
                {
                    boolean _vQuantifierResult_91_15;
                    {
                        _vQuantifierResult_91_15 = true;
                        int _vCaptureCount_a_91_26 = _vaircrafts._oHash ();
                        int _vLoopCounter_91_23 = 0;
                        for (;;)
                        {
                            if (((_vLoopCounter_91_23 == _vCaptureCount_a_91_26) || (!
                                _vQuantifierResult_91_15))) break;
                            _vQuantifierResult_91_15 = (((_vminX <= ((Aircraft) _vaircrafts._oIndex
                                (_vLoopCounter_91_23)).position.x) && (((Aircraft) _vaircrafts.
                                _oIndex (_vLoopCounter_91_23)).position.x <= _vmaxX)) && ((_vminY <=
                                ((Aircraft) _vaircrafts._oIndex (_vLoopCounter_91_23)).position.y)
                                && (((Aircraft) _vaircrafts._oIndex (_vLoopCounter_91_23)).position.
                                y <= _vmaxY)));
                            if ((!_vQuantifierResult_91_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_91_23 = _eSystem._oSucc (_vLoopCounter_91_23);
                            }
                        }
                    }
                    _vCondResult_91_13 = _vQuantifierResult_91_15;
                }
                else
                {
                    _vCondResult_91_13 = false;
                }
                if (!(_vCondResult_91_13)) throw new _xPre ("AirTrafficController.pd:91,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        aircrafts = _vaircrafts;
        minX = _vminX;
        maxX = _vmaxX;
        minY = _vminY;
        maxY = _vmaxY;
        fly (0.0);
        _lc_AirTrafficController ("AirTrafficController.pd:92,14");
    }

    public boolean _lEqual (AirTrafficController _vArg_10_9)
    {
        if (this == _vArg_10_9)
        {
            return true;
        }
        return ((((_vArg_10_9.aircrafts._lEqual (aircrafts) && (_vArg_10_9.minX == minX)) && (
            _vArg_10_9.maxX == maxX)) && (_vArg_10_9.minY == minY)) && (_vArg_10_9.maxY == maxY));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == AirTrafficController.class &&
            _lEqual ((AirTrafficController) _lArg));
    }

}


// End of file.
