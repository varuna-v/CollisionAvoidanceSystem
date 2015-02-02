//***********************************************************************************************
//* File: 'AirTrafficController.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/AirTrafficController.pd'
//* by Perfect Developer version 6.10.01 at 12:40:02 UTC on Monday February 2nd 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf4A33.tmp
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
        _eSeq _vForYield_28_22 = new _eSeq ();
        {
            int _vCaptureCount_i_28_34 = aircrafts._oHash ();
            int _vLoopCounter_28_27 = 0;
            for (;;)
            {
                if ((_vCaptureCount_i_28_34 <= _vLoopCounter_28_27)) break;
                _eSeq _vForYield_28_51 = new _eSeq ();
                {
                    int _vCaptureCount_j_28_67 = aircrafts._oHash ();
                    int _vLoopCounter_28_56 = (1 + _vLoopCounter_28_27);
                    for (;;)
                    {
                        if ((_vCaptureCount_j_28_67 <= _vLoopCounter_28_56)) break;
                        _vForYield_28_51 = _vForYield_28_51.append (((_eAny) new AircraftPair (((
                            Aircraft) aircrafts._oIndex (_vLoopCounter_28_27)), ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_28_56)))));
                        _vLoopCounter_28_56 = _eSystem._oSucc (_vLoopCounter_28_56);
                    }
                }
                _vForYield_28_22 = _vForYield_28_22.append (((_eAny) _vForYield_28_51.ran ()));
                _vLoopCounter_28_27 = _eSystem._oSucc (_vLoopCounter_28_27);
            }
        }
        _eSet _vLet_s_28_17 = _vForYield_28_22.ran ();
        return Ertsys.RtsGlobals.flatten (_vLet_s_28_17, (_eSet) null, (_eTemplate_0) null);
    }

    public _eMap conflicts ()
    {
        _eSet _vLet_pairs_33_17 = getPairs ();
        _eSet _vForYield_34_53 = new _eSet ();
        {
            int _vCaptureCount_p_34_61 = _vLet_pairs_33_17._oHash ();
            int _vLoopCounter_34_58 = 0;
            for (;;)
            {
                if ((_vLoopCounter_34_58 == _vCaptureCount_p_34_61)) break;
                _vForYield_34_53 = _vForYield_34_53.append (((_eAny) new _ePair (_vLet_pairs_33_17.
                    _oIndex (_vLoopCounter_34_58), ((_eAny) new ConflictStatus (((AircraftPair)
                    _vLet_pairs_33_17._oIndex (_vLoopCounter_34_58)).getConflictStatus ())))));
                _vLoopCounter_34_58 = _eSystem._oSucc (_vLoopCounter_34_58);
            }
        }
        return new _eMap (_vForYield_34_53, (_ePair) null, (_eTemplate_0) null, (_eTemplate_1) null);
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
            _ePair _vThatAny_44_28 = null;
            {
                boolean _vSelectorCondition_44_28;
                _vSelectorCondition_44_28 = false;
                int _vCaptureCount_k_44_35 = cons._oHash ();
                int _vLoopCounter_44_32 = 0;
                for (;;)
                {
                    if (((_vLoopCounter_44_32 == _vCaptureCount_k_44_35) ||
                        _vSelectorCondition_44_28)) break;
                    _vSelectorCondition_44_28 = ((_ePair) cons._oIndex (_vLoopCounter_44_32)).
                        _lEqual (((_ePair) cons._oIndex (_vLoopCounter_44_32)));
                    if (_vSelectorCondition_44_28)
                    {
                        _vThatAny_44_28 = ((_ePair) cons._oIndex (_vLoopCounter_44_32));
                    }
                    if (_vSelectorCondition_44_28)
                    {
                    }
                    else
                    {
                        _vLoopCounter_44_32 = _eSystem._oSucc (_vLoopCounter_44_32);
                    }
                }
                if (_eSystem.enableThatOrAny && _eSystem.currentCheckNesting <= _eSystem.
                    maxCheckNesting)
                {
                    _eSystem.currentCheckNesting ++;
                    try
                    {
                        if (!(_vSelectorCondition_44_28)) throw new _xThatOrAny (
                            "AirTrafficController.pd:44,28");
                    }
                    catch (_xCannotEvaluate _lException)
                    {
                    }
                    _eSystem.currentCheckNesting --;
                }
            }
            _ePair _vLet_c_44_23 = _vThatAny_44_28;
            return _eSystem._lString ("Pair <br>")._oPlusPlus (((AircraftPair) _vLet_c_44_23.x).
                _rtoString (), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("<br> Status: "),
                (_eTemplate_0) null)._oPlusPlus (ConflictStatus._ltoString (((ConflictStatus)
                _vLet_c_44_23.y).value), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("<br>"),
                (_eTemplate_0) null)._oPlusPlus (getConflictsString (cons.remove (((_eAny)
                _vLet_c_44_23)), (_ePair) null, (AircraftPair) null, (ConflictStatus) null), (
                _eTemplate_0) null);
        }
    }

    public boolean willAllAircraftsBeInBoundaryAfterFlying (double flyForTime)
    {
        boolean _vQuantifierResult_48_12;
        {
            _vQuantifierResult_48_12 = true;
            int _vCaptureCount_a_48_22 = aircrafts._oHash ();
            int _vLoopCounter_48_19 = 0;
            for (;;)
            {
                if (((_vLoopCounter_48_19 == _vCaptureCount_a_48_22) || (!_vQuantifierResult_48_12)))
                    break;
                _vQuantifierResult_48_12 = willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts
                    ._oIndex (_vLoopCounter_48_19)), flyForTime);
                if ((!_vQuantifierResult_48_12))
                {
                }
                else
                {
                    _vLoopCounter_48_19 = _eSystem._oSucc (_vLoopCounter_48_19);
                }
            }
        }
        return _vQuantifierResult_48_12;
    }

    public boolean willAircraftBeInBoundryAfterFlying (Aircraft aircraft, double flyForTime)
    {
        Vector _vLet_endPosition_51_17 = aircraft.positionAfterFlying (flyForTime);
        return (((minX <= _vLet_endPosition_51_17.x) && (_vLet_endPosition_51_17.x <= maxX)) && ((
            minY <= _vLet_endPosition_51_17.y) && (_vLet_endPosition_51_17.y <= maxY)));
    }

    public int getConflictStatus (Aircraft aircraft, _eMap incconflicts, AircraftPair
        _t0incconflicts, ConflictStatus _t1incconflicts)
    {
        _eSet _vForYield_55_24 = new _eSet ();
        {
            _eSet _vCaptureBound_c_55_51 = incconflicts.pairs ();
            int _vCaptureCount_c_55_51 = _vCaptureBound_c_55_51._oHash ();
            int _vLoopCounter_55_35 = 0;
            for (;;)
            {
                if ((_vLoopCounter_55_35 == _vCaptureCount_c_55_51)) break;
                if ((aircraft._lEqual (((AircraftPair) ((_ePair) _vCaptureBound_c_55_51._oIndex (
                    _vLoopCounter_55_35)).x).craft1) || aircraft._lEqual (((AircraftPair) ((_ePair)
                    _vCaptureBound_c_55_51._oIndex (_vLoopCounter_55_35)).x).craft2)))
                {
                    _vForYield_55_24 = _vForYield_55_24.append (((_ePair) _vCaptureBound_c_55_51.
                        _oIndex (_vLoopCounter_55_35)).y);
                }
                _vLoopCounter_55_35 = _eSystem._oSucc (_vLoopCounter_55_35);
            }
        }
        _eSet _vLet_lst_55_17 = _vForYield_55_24;
        return (_vLet_lst_55_17._ovIn (((_eAny) new ConflictStatus (ConflictStatus.Conflicted))) ?
        ConflictStatus.Conflicted : _vLet_lst_55_17._ovIn (((_eAny) new ConflictStatus (
            ConflictStatus.PotentialFutureConflict))) ?
        ConflictStatus.PotentialFutureConflict : ConflictStatus.NoConflict);
    }

    public void dropIfLeavesBoundaryAfterFlying (double flyForTime)
    {
        {
            _eSeq _vThose_62_27 = new _eSeq ();
            {
                int _vCaptureCount_a_62_37 = aircrafts._oHash ();
                int _vLoopCounter_62_34 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_62_34 == _vCaptureCount_a_62_37)) break;
                    if (willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts._oIndex (
                        _vLoopCounter_62_34)), flyForTime))
                    {
                        _vThose_62_27 = _vThose_62_27.append (aircrafts._oIndex (_vLoopCounter_62_34)
                            );
                    }
                    _vLoopCounter_62_34 = _eSystem._oSucc (_vLoopCounter_62_34);
                }
            }
            aircrafts = _vThose_62_27;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:62,14");
    }

    public void fly (double forTime)
    {
        dropIfLeavesBoundaryAfterFlying (forTime);
        {
            _eSeq _vForYield_68_27 = new _eSeq ();
            {
                int _vCaptureCount_craft_68_39 = aircrafts._oHash ();
                int _vLoopCounter_68_32 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_68_32 == _vCaptureCount_craft_68_39)) break;
                    _vForYield_68_27 = _vForYield_68_27.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_68_32)).getCraftAfterFlying (forTime)));
                    _vLoopCounter_68_32 = _eSystem._oSucc (_vLoopCounter_68_32);
                }
            }
            aircrafts = _vForYield_68_27;
        }
        {
            _eMap _vLet_locConflicts_69_19 = conflicts ();
            _eSeq _vForYield_70_28 = new _eSeq ();
            {
                int _vCaptureCount_craft_70_40 = aircrafts._oHash ();
                int _vLoopCounter_70_33 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_70_33 == _vCaptureCount_craft_70_40)) break;
                    _vForYield_70_28 = _vForYield_70_28.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_70_33)).getCraftWithConflictStatus (getConflictStatus
                        (((Aircraft) aircrafts._oIndex (_vLoopCounter_70_33)),
                        _vLet_locConflicts_69_19, (AircraftPair) null, (ConflictStatus) null), (
                        ConflictStatus) null)));
                    _vLoopCounter_70_33 = _eSystem._oSucc (_vLoopCounter_70_33);
                }
            }
            aircrafts = _vForYield_70_28;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:67,19");
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
                boolean _vCondResult_76_13;
                if (((_vminX < _vmaxX) && (_vminY < _vmaxY)))
                {
                    boolean _vQuantifierResult_76_15;
                    {
                        _vQuantifierResult_76_15 = true;
                        int _vCaptureCount_i_76_30 = _vaircrafts._oHash ();
                        int _vLoopCounter_76_23 = 0;
                        for (;;)
                        {
                            if (((_vCaptureCount_i_76_30 <= _vLoopCounter_76_23) || (!
                                _vQuantifierResult_76_15))) break;
                            boolean _vQuantifierResult_76_43;
                            {
                                _vQuantifierResult_76_43 = true;
                                int _vCaptureCount_j_76_62 = _vaircrafts._oHash ();
                                int _vLoopCounter_76_51 = (1 + _vLoopCounter_76_23);
                                for (;;)
                                {
                                    if (((_vCaptureCount_j_76_62 <= _vLoopCounter_76_51) || (!
                                        _vQuantifierResult_76_43))) break;
                                    _vQuantifierResult_76_43 = (!((Aircraft) _vaircrafts._oIndex (
                                        _vLoopCounter_76_51))._lEqual (((Aircraft) _vaircrafts.
                                        _oIndex (_vLoopCounter_76_23))));
                                    if ((!_vQuantifierResult_76_43))
                                    {
                                    }
                                    else
                                    {
                                        _vLoopCounter_76_51 = _eSystem._oSucc (_vLoopCounter_76_51);
                                    }
                                }
                            }
                            _vQuantifierResult_76_15 = _vQuantifierResult_76_43;
                            if ((!_vQuantifierResult_76_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_76_23 = _eSystem._oSucc (_vLoopCounter_76_23);
                            }
                        }
                    }
                    _vCondResult_76_13 = _vQuantifierResult_76_15;
                }
                else
                {
                    _vCondResult_76_13 = false;
                }
                boolean _vCondResult_77_13;
                if (_vCondResult_76_13)
                {
                    boolean _vQuantifierResult_77_15;
                    {
                        _vQuantifierResult_77_15 = true;
                        int _vCaptureCount_a_77_26 = _vaircrafts._oHash ();
                        int _vLoopCounter_77_23 = 0;
                        for (;;)
                        {
                            if (((_vLoopCounter_77_23 == _vCaptureCount_a_77_26) || (!
                                _vQuantifierResult_77_15))) break;
                            _vQuantifierResult_77_15 = (((_vminX <= ((Aircraft) _vaircrafts._oIndex
                                (_vLoopCounter_77_23)).position.x) && (((Aircraft) _vaircrafts.
                                _oIndex (_vLoopCounter_77_23)).position.x <= _vmaxX)) && ((_vminY <=
                                ((Aircraft) _vaircrafts._oIndex (_vLoopCounter_77_23)).position.y)
                                && (((Aircraft) _vaircrafts._oIndex (_vLoopCounter_77_23)).position.
                                y <= _vmaxY)));
                            if ((!_vQuantifierResult_77_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_77_23 = _eSystem._oSucc (_vLoopCounter_77_23);
                            }
                        }
                    }
                    _vCondResult_77_13 = _vQuantifierResult_77_15;
                }
                else
                {
                    _vCondResult_77_13 = false;
                }
                if (!(_vCondResult_77_13)) throw new _xPre ("AirTrafficController.pd:77,13");
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
        _lc_AirTrafficController ("AirTrafficController.pd:78,14");
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
