//***********************************************************************************************
//* File: 'AirTrafficController.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/AirTrafficController.pd'
//* by Perfect Developer version 6.10.01 at 17:42:02 UTC on Sunday February 1st 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etfFF35.tmp
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
                boolean _vQuantifierResult_19_15;
                {
                    _vQuantifierResult_19_15 = true;
                    int _vCaptureCount_a_19_25 = aircrafts._oHash ();
                    int _vLoopCounter_19_22 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_19_22 == _vCaptureCount_a_19_25) || (!
                            _vQuantifierResult_19_15))) break;
                        _vQuantifierResult_19_15 = (1 == aircrafts._ovHash (aircrafts._oIndex (
                            _vLoopCounter_19_22)));
                        if ((!_vQuantifierResult_19_15))
                        {
                        }
                        else
                        {
                            _vLoopCounter_19_22 = _eSystem._oSucc (_vLoopCounter_19_22);
                        }
                    }
                }
                if (!(_vQuantifierResult_19_15)) throw new _xClassInvariantItem (
                    "AirTrafficController.pd:19,15", _lArg);
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
                boolean _vQuantifierResult_20_15;
                {
                    _vQuantifierResult_20_15 = true;
                    int _vCaptureCount_a_20_25 = aircrafts._oHash ();
                    int _vLoopCounter_20_22 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_20_22 == _vCaptureCount_a_20_25) || (!
                            _vQuantifierResult_20_15))) break;
                        _vQuantifierResult_20_15 = (((minX <= ((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_20_22)).position.x) && (((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_20_22)).position.x <= maxX)) && ((minY <= ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_20_22)).position.y) && (((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_20_22)).position.y <= maxY)));
                        if ((!_vQuantifierResult_20_15))
                        {
                        }
                        else
                        {
                            _vLoopCounter_20_22 = _eSystem._oSucc (_vLoopCounter_20_22);
                        }
                    }
                }
                if (!(_vQuantifierResult_20_15)) throw new _xClassInvariantItem (
                    "AirTrafficController.pd:20,15", _lArg);
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

    protected final static double defaultTimeToFlyFor = 0.1;
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
            _ePair _vThatAny_47_28 = null;
            {
                boolean _vSelectorCondition_47_28;
                _vSelectorCondition_47_28 = false;
                int _vCaptureCount_k_47_35 = cons._oHash ();
                int _vLoopCounter_47_32 = 0;
                for (;;)
                {
                    if (((_vLoopCounter_47_32 == _vCaptureCount_k_47_35) ||
                        _vSelectorCondition_47_28)) break;
                    _vSelectorCondition_47_28 = ((_ePair) cons._oIndex (_vLoopCounter_47_32)).
                        _lEqual (((_ePair) cons._oIndex (_vLoopCounter_47_32)));
                    if (_vSelectorCondition_47_28)
                    {
                        _vThatAny_47_28 = ((_ePair) cons._oIndex (_vLoopCounter_47_32));
                    }
                    if (_vSelectorCondition_47_28)
                    {
                    }
                    else
                    {
                        _vLoopCounter_47_32 = _eSystem._oSucc (_vLoopCounter_47_32);
                    }
                }
                if (_eSystem.enableThatOrAny && _eSystem.currentCheckNesting <= _eSystem.
                    maxCheckNesting)
                {
                    _eSystem.currentCheckNesting ++;
                    try
                    {
                        if (!(_vSelectorCondition_47_28)) throw new _xThatOrAny (
                            "AirTrafficController.pd:47,28");
                    }
                    catch (_xCannotEvaluate _lException)
                    {
                    }
                    _eSystem.currentCheckNesting --;
                }
            }
            _ePair _vLet_c_47_23 = _vThatAny_47_28;
            return _eSystem._lString ("Pair <br>")._oPlusPlus (((AircraftPair) _vLet_c_47_23.x).
                _rtoString (), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("<br> Status: "),
                (_eTemplate_0) null)._oPlusPlus (ConflictStatus._ltoString (((ConflictStatus)
                _vLet_c_47_23.y).value), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("<br>"),
                (_eTemplate_0) null)._oPlusPlus (getConflictsString (cons.remove (((_eAny)
                _vLet_c_47_23)), (_ePair) null, (AircraftPair) null, (ConflictStatus) null), (
                _eTemplate_0) null);
        }
    }

    public boolean willAllAircraftsBeInBoundaryAfterFlying ()
    {
        boolean _vQuantifierResult_51_12;
        {
            _vQuantifierResult_51_12 = true;
            int _vCaptureCount_a_51_22 = aircrafts._oHash ();
            int _vLoopCounter_51_19 = 0;
            for (;;)
            {
                if (((_vLoopCounter_51_19 == _vCaptureCount_a_51_22) || (!_vQuantifierResult_51_12)))
                    break;
                _vQuantifierResult_51_12 = willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts
                    ._oIndex (_vLoopCounter_51_19)));
                if ((!_vQuantifierResult_51_12))
                {
                }
                else
                {
                    _vLoopCounter_51_19 = _eSystem._oSucc (_vLoopCounter_51_19);
                }
            }
        }
        return _vQuantifierResult_51_12;
    }

    public boolean willAircraftBeInBoundryAfterFlying (Aircraft aircraft)
    {
        Vector _vLet_endPosition_54_17 = aircraft.positionAfterFlying (AirTrafficController.
            defaultTimeToFlyFor);
        return (((minX <= _vLet_endPosition_54_17.x) && (_vLet_endPosition_54_17.x <= maxX)) && ((
            minY <= _vLet_endPosition_54_17.y) && (_vLet_endPosition_54_17.y <= maxY)));
    }

    public int getConflictStatus (Aircraft aircraft, _eMap incconflicts, AircraftPair
        _t0incconflicts, ConflictStatus _t1incconflicts)
    {
        _eSet _vForYield_58_24 = new _eSet ();
        {
            _eSet _vCaptureBound_c_58_51 = incconflicts.pairs ();
            int _vCaptureCount_c_58_51 = _vCaptureBound_c_58_51._oHash ();
            int _vLoopCounter_58_35 = 0;
            for (;;)
            {
                if ((_vLoopCounter_58_35 == _vCaptureCount_c_58_51)) break;
                if ((aircraft._lEqual (((AircraftPair) ((_ePair) _vCaptureBound_c_58_51._oIndex (
                    _vLoopCounter_58_35)).x).craft1) || aircraft._lEqual (((AircraftPair) ((_ePair)
                    _vCaptureBound_c_58_51._oIndex (_vLoopCounter_58_35)).x).craft2)))
                {
                    _vForYield_58_24 = _vForYield_58_24.append (((_ePair) _vCaptureBound_c_58_51.
                        _oIndex (_vLoopCounter_58_35)).y);
                }
                _vLoopCounter_58_35 = _eSystem._oSucc (_vLoopCounter_58_35);
            }
        }
        _eSet _vLet_lst_58_17 = _vForYield_58_24;
        return (_vLet_lst_58_17._ovIn (((_eAny) new ConflictStatus (ConflictStatus.Conflicted))) ?
        ConflictStatus.Conflicted : _vLet_lst_58_17._ovIn (((_eAny) new ConflictStatus (
            ConflictStatus.PotentialFutureConflict))) ?
        ConflictStatus.PotentialFutureConflict : ConflictStatus.NoConflict);
    }

    public void dropIfLeavesBoundaryAfterFlying ()
    {
        {
            _eSeq _vThose_65_27 = new _eSeq ();
            {
                int _vCaptureCount_a_65_37 = aircrafts._oHash ();
                int _vLoopCounter_65_34 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_65_34 == _vCaptureCount_a_65_37)) break;
                    if (willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts._oIndex (
                        _vLoopCounter_65_34))))
                    {
                        _vThose_65_27 = _vThose_65_27.append (aircrafts._oIndex (_vLoopCounter_65_34)
                            );
                    }
                    _vLoopCounter_65_34 = _eSystem._oSucc (_vLoopCounter_65_34);
                }
            }
            aircrafts = _vThose_65_27;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:65,14");
    }

    public void fly ()
    {
        dropIfLeavesBoundaryAfterFlying ();
        {
            _eSeq _vForYield_70_27 = new _eSeq ();
            {
                int _vCaptureCount_craft_70_39 = aircrafts._oHash ();
                int _vLoopCounter_70_32 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_70_32 == _vCaptureCount_craft_70_39)) break;
                    _vForYield_70_27 = _vForYield_70_27.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_70_32)).getCraftAfterFlying (AirTrafficController.
                        defaultTimeToFlyFor)));
                    _vLoopCounter_70_32 = _eSystem._oSucc (_vLoopCounter_70_32);
                }
            }
            aircrafts = _vForYield_70_27;
        }
        {
            _eMap _vLet_locConflicts_71_19 = conflicts ();
            _eSeq _vForYield_72_28 = new _eSeq ();
            {
                int _vCaptureCount_craft_72_40 = aircrafts._oHash ();
                int _vLoopCounter_72_33 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_72_33 == _vCaptureCount_craft_72_40)) break;
                    _vForYield_72_28 = _vForYield_72_28.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_72_33)).getCraftWithConflictStatus (getConflictStatus
                        (((Aircraft) aircrafts._oIndex (_vLoopCounter_72_33)),
                        _vLet_locConflicts_71_19, (AircraftPair) null, (ConflictStatus) null), (
                        ConflictStatus) null)));
                    _vLoopCounter_72_33 = _eSystem._oSucc (_vLoopCounter_72_33);
                }
            }
            aircrafts = _vForYield_72_28;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:69,19");
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
                boolean _vCondResult_77_13;
                if (((_vminX < _vmaxX) && (_vminY < _vmaxY)))
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
                            _vQuantifierResult_77_15 = (1 == _vaircrafts._ovHash (_vaircrafts.
                                _oIndex (_vLoopCounter_77_23)));
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
                boolean _vCondResult_78_13;
                if (_vCondResult_77_13)
                {
                    boolean _vQuantifierResult_78_15;
                    {
                        _vQuantifierResult_78_15 = true;
                        int _vCaptureCount_a_78_26 = _vaircrafts._oHash ();
                        int _vLoopCounter_78_23 = 0;
                        for (;;)
                        {
                            if (((_vLoopCounter_78_23 == _vCaptureCount_a_78_26) || (!
                                _vQuantifierResult_78_15))) break;
                            _vQuantifierResult_78_15 = (((_vminX <= ((Aircraft) _vaircrafts._oIndex
                                (_vLoopCounter_78_23)).position.x) && (((Aircraft) _vaircrafts.
                                _oIndex (_vLoopCounter_78_23)).position.x <= _vmaxX)) && ((_vminY <=
                                ((Aircraft) _vaircrafts._oIndex (_vLoopCounter_78_23)).position.y)
                                && (((Aircraft) _vaircrafts._oIndex (_vLoopCounter_78_23)).position.
                                y <= _vmaxY)));
                            if ((!_vQuantifierResult_78_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_78_23 = _eSystem._oSucc (_vLoopCounter_78_23);
                            }
                        }
                    }
                    _vCondResult_78_13 = _vQuantifierResult_78_15;
                }
                else
                {
                    _vCondResult_78_13 = false;
                }
                if (!(_vCondResult_78_13)) throw new _xPre ("AirTrafficController.pd:78,13");
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
        _lc_AirTrafficController ("AirTrafficController.pd:74,5");
    }

    public boolean _lEqual (AirTrafficController _vArg_10_11)
    {
        if (this == _vArg_10_11)
        {
            return true;
        }
        return ((((_vArg_10_11.aircrafts._lEqual (aircrafts) && (_vArg_10_11.minX == minX)) && (
            _vArg_10_11.maxX == maxX)) && (_vArg_10_11.minY == minY)) && (_vArg_10_11.maxY == maxY));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == AirTrafficController.class &&
            _lEqual ((AirTrafficController) _lArg));
    }

}


// End of file.
