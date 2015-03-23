//***********************************************************************************************
//* File: 'AirTrafficController.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/AirTrafficController.pd'
//* by Perfect Developer version 6.10.01 at 12:25:36 UTC on Monday March 23rd 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf3AE.tmp
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
                boolean _vQuantifierResult_16_15;
                {
                    _vQuantifierResult_16_15 = true;
                    int _vCaptureCount_a_16_25 = aircrafts._oHash ();
                    int _vLoopCounter_16_22 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_16_22 == _vCaptureCount_a_16_25) || (!
                            _vQuantifierResult_16_15))) break;
                        _vQuantifierResult_16_15 = (((minX <= ((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_16_22)).position.x) && (((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_16_22)).position.x <= maxX)) && ((minY <= ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_16_22)).position.y) && (((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_16_22)).position.y <= maxY)));
                        if ((!_vQuantifierResult_16_15))
                        {
                        }
                        else
                        {
                            _vLoopCounter_16_22 = _eSystem._oSucc (_vLoopCounter_16_22);
                        }
                    }
                }
                if (!(_vQuantifierResult_16_15)) throw new _xClassInvariantItem (
                    "AirTrafficController.pd:16,15", _lArg);
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
                boolean _vQuantifierResult_17_15;
                {
                    _vQuantifierResult_17_15 = true;
                    int _vCaptureCount_i_17_29 = aircrafts._oHash ();
                    int _vLoopCounter_17_22 = 0;
                    for (;;)
                    {
                        if (((_vCaptureCount_i_17_29 <= _vLoopCounter_17_22) || (!
                            _vQuantifierResult_17_15))) break;
                        boolean _vQuantifierResult_17_42;
                        {
                            _vQuantifierResult_17_42 = true;
                            int _vCaptureCount_j_17_61 = aircrafts._oHash ();
                            int _vLoopCounter_17_50 = (1 + _vLoopCounter_17_22);
                            for (;;)
                            {
                                if (((_vCaptureCount_j_17_61 <= _vLoopCounter_17_50) || (!
                                    _vQuantifierResult_17_42))) break;
                                _vQuantifierResult_17_42 = (!((Aircraft) aircrafts._oIndex (
                                    _vLoopCounter_17_50))._lEqual (((Aircraft) aircrafts._oIndex (
                                    _vLoopCounter_17_22))));
                                if ((!_vQuantifierResult_17_42))
                                {
                                }
                                else
                                {
                                    _vLoopCounter_17_50 = _eSystem._oSucc (_vLoopCounter_17_50);
                                }
                            }
                        }
                        _vQuantifierResult_17_15 = _vQuantifierResult_17_42;
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
    protected _eSet getPairs ()
    {
        _eSeq _vForYield_22_22 = new _eSeq ();
        {
            int _vCaptureCount_i_22_34 = aircrafts._oHash ();
            int _vLoopCounter_22_27 = 0;
            for (;;)
            {
                if ((_vCaptureCount_i_22_34 <= _vLoopCounter_22_27)) break;
                _eSeq _vForYield_22_51 = new _eSeq ();
                {
                    int _vCaptureCount_j_22_67 = aircrafts._oHash ();
                    int _vLoopCounter_22_56 = (1 + _vLoopCounter_22_27);
                    for (;;)
                    {
                        if ((_vCaptureCount_j_22_67 <= _vLoopCounter_22_56)) break;
                        _vForYield_22_51 = _vForYield_22_51.append (((_eAny) new AircraftPair (((
                            Aircraft) aircrafts._oIndex (_vLoopCounter_22_27)), ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_22_56)))));
                        _vLoopCounter_22_56 = _eSystem._oSucc (_vLoopCounter_22_56);
                    }
                }
                _vForYield_22_22 = _vForYield_22_22.append (((_eAny) _vForYield_22_51.ran ()));
                _vLoopCounter_22_27 = _eSystem._oSucc (_vLoopCounter_22_27);
            }
        }
        _eSet _vLet_s_22_17 = _vForYield_22_22.ran ();
        return Ertsys.RtsGlobals.flatten (_vLet_s_22_17, (_eSet) null, (_eTemplate_0) null);
    }

    protected _eMap conflicts ()
    {
        _eSet _vLet_pairs_27_17 = getPairs ();
        _eSet _vForYield_28_53 = new _eSet ();
        {
            int _vCaptureCount_p_28_61 = _vLet_pairs_27_17._oHash ();
            int _vLoopCounter_28_58 = 0;
            for (;;)
            {
                if ((_vLoopCounter_28_58 == _vCaptureCount_p_28_61)) break;
                _vForYield_28_53 = _vForYield_28_53.append (((_eAny) new _ePair (_vLet_pairs_27_17.
                    _oIndex (_vLoopCounter_28_58), ((_eAny) new ConflictStatus (((AircraftPair)
                    _vLet_pairs_27_17._oIndex (_vLoopCounter_28_58)).getConflictStatus ())))));
                _vLoopCounter_28_58 = _eSystem._oSucc (_vLoopCounter_28_58);
            }
        }
        return new _eMap (_vForYield_28_53, (_ePair) null, (_eTemplate_0) null, (_eTemplate_1) null);
    }

    protected boolean willAllAircraftsBeInBoundaryAfterFlying (double flyForTime)
    {
        boolean _vQuantifierResult_33_12;
        {
            _vQuantifierResult_33_12 = true;
            int _vCaptureCount_a_33_22 = aircrafts._oHash ();
            int _vLoopCounter_33_19 = 0;
            for (;;)
            {
                if (((_vLoopCounter_33_19 == _vCaptureCount_a_33_22) || (!_vQuantifierResult_33_12)))
                    break;
                _vQuantifierResult_33_12 = willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts
                    ._oIndex (_vLoopCounter_33_19)), flyForTime);
                if ((!_vQuantifierResult_33_12))
                {
                }
                else
                {
                    _vLoopCounter_33_19 = _eSystem._oSucc (_vLoopCounter_33_19);
                }
            }
        }
        return _vQuantifierResult_33_12;
    }

    protected boolean willAircraftBeInBoundryAfterFlying (Aircraft aircraft, double flyForTime)
    {
        Vector _vLet_endPosition_36_17 = aircraft.positionAfterFlying (flyForTime);
        return (((minX <= _vLet_endPosition_36_17.x) && (_vLet_endPosition_36_17.x <= maxX)) && ((
            minY <= _vLet_endPosition_36_17.y) && (_vLet_endPosition_36_17.y <= maxY)));
    }

    protected void dropIfLeavesBoundaryAfterFlying (double flyForTime)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_40_13;
                {
                    _vQuantifierResult_40_13 = true;
                    int _vCaptureCount_a_40_23 = aircrafts._oHash ();
                    int _vLoopCounter_40_20 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_40_20 == _vCaptureCount_a_40_23) || (!
                            _vQuantifierResult_40_13))) break;
                        _vQuantifierResult_40_13 = (((minX <= ((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_40_20)).position.x) && (((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_40_20)).position.x <= maxX)) && ((minY <= ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_40_20)).position.y) && (((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_40_20)).position.y <= maxY)));
                        if ((!_vQuantifierResult_40_13))
                        {
                        }
                        else
                        {
                            _vLoopCounter_40_20 = _eSystem._oSucc (_vLoopCounter_40_20);
                        }
                    }
                }
                if (!(_vQuantifierResult_40_13)) throw new _xPre ("AirTrafficController.pd:40,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        {
            _eSeq _vThose_41_27 = new _eSeq ();
            {
                int _vCaptureCount_a_41_37 = aircrafts._oHash ();
                int _vLoopCounter_41_34 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_41_34 == _vCaptureCount_a_41_37)) break;
                    if (willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts._oIndex (
                        _vLoopCounter_41_34)), flyForTime))
                    {
                        _vThose_41_27 = _vThose_41_27.append (aircrafts._oIndex (_vLoopCounter_41_34)
                            );
                    }
                    _vLoopCounter_41_34 = _eSystem._oSucc (_vLoopCounter_41_34);
                }
            }
            aircrafts = _vThose_41_27;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:41,14");
    }

    protected _eSet getPairsThatArePFC ()
    {
        _eSet _vLet_pairs_46_17 = getPairs ();
        _eSet _vThose_47_13 = new _eSet ();
        {
            int _vCaptureCount_p_47_22 = _vLet_pairs_46_17._oHash ();
            int _vLoopCounter_47_19 = 0;
            for (;;)
            {
                if ((_vLoopCounter_47_19 == _vCaptureCount_p_47_22)) break;
                if ((ConflictStatus.PotentialFutureConflict == ((AircraftPair) _vLet_pairs_46_17.
                    _oIndex (_vLoopCounter_47_19)).getConflictStatus ()))
                {
                    _vThose_47_13 = _vThose_47_13.append (_vLet_pairs_46_17._oIndex (
                        _vLoopCounter_47_19));
                }
                _vLoopCounter_47_19 = _eSystem._oSucc (_vLoopCounter_47_19);
            }
        }
        return _vThose_47_13;
    }

    public int numberOfAirCrafts ()
    {
        return aircrafts._oHash ();
    }

    public _eSeq getAircraftPairsOrderedByTimeToConflict ()
    {
        return getPairsThatArePFC ().permndec ();
    }

    public int getConflictStatus (Aircraft aircraft, _eMap incconflicts, AircraftPair
        _t0incconflicts, ConflictStatus _t1incconflicts)
    {
        _eSet _vForYield_59_24 = new _eSet ();
        {
            _eSet _vCaptureBound_c_59_51 = incconflicts.pairs ();
            int _vCaptureCount_c_59_51 = _vCaptureBound_c_59_51._oHash ();
            int _vLoopCounter_59_35 = 0;
            for (;;)
            {
                if ((_vLoopCounter_59_35 == _vCaptureCount_c_59_51)) break;
                if ((aircraft._lEqual (((AircraftPair) ((_ePair) _vCaptureBound_c_59_51._oIndex (
                    _vLoopCounter_59_35)).x).craft1) || aircraft._lEqual (((AircraftPair) ((_ePair)
                    _vCaptureBound_c_59_51._oIndex (_vLoopCounter_59_35)).x).craft2)))
                {
                    _vForYield_59_24 = _vForYield_59_24.append (((_ePair) _vCaptureBound_c_59_51.
                        _oIndex (_vLoopCounter_59_35)).y);
                }
                _vLoopCounter_59_35 = _eSystem._oSucc (_vLoopCounter_59_35);
            }
        }
        _eSet _vLet_lst_59_17 = _vForYield_59_24;
        return (_vLet_lst_59_17._ovIn (((_eAny) new ConflictStatus (ConflictStatus.Conflicted))) ?
        ConflictStatus.Conflicted : _vLet_lst_59_17._ovIn (((_eAny) new ConflictStatus (
            ConflictStatus.PotentialFutureConflict))) ?
        ConflictStatus.PotentialFutureConflict : ConflictStatus.NoConflict);
    }

    public void changeCraftHeight (_eSeq identification, char _t0identification, double targetHeight)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_65_13;
                {
                    _vQuantifierResult_65_13 = false;
                    int _vCaptureCount_c_65_23 = aircrafts._oHash ();
                    int _vLoopCounter_65_20 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_65_20 == _vCaptureCount_c_65_23) ||
                            _vQuantifierResult_65_13)) break;
                        _vQuantifierResult_65_13 = identification._lEqual (((Aircraft) aircrafts.
                            _oIndex (_vLoopCounter_65_20)).identification);
                        if (_vQuantifierResult_65_13)
                        {
                        }
                        else
                        {
                            _vLoopCounter_65_20 = _eSystem._oSucc (_vLoopCounter_65_20);
                        }
                    }
                }
                if (!(_vQuantifierResult_65_13)) throw new _xPre ("AirTrafficController.pd:65,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        {
            Aircraft _vThatAny_66_28 = null;
            {
                boolean _vSelectorCondition_66_28;
                _vSelectorCondition_66_28 = false;
                int _vCaptureCount_c_66_36 = aircrafts._oHash ();
                int _vLoopCounter_66_33 = 0;
                for (;;)
                {
                    if (((_vLoopCounter_66_33 == _vCaptureCount_c_66_36) ||
                        _vSelectorCondition_66_28)) break;
                    _vSelectorCondition_66_28 = identification._lEqual (((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_66_33)).identification);
                    if (_vSelectorCondition_66_28)
                    {
                        _vThatAny_66_28 = ((Aircraft) aircrafts._oIndex (_vLoopCounter_66_33));
                    }
                    if (_vSelectorCondition_66_28)
                    {
                    }
                    else
                    {
                        _vLoopCounter_66_33 = _eSystem._oSucc (_vLoopCounter_66_33);
                    }
                }
                if (_eSystem.enableThatOrAny && _eSystem.currentCheckNesting <= _eSystem.
                    maxCheckNesting)
                {
                    _eSystem.currentCheckNesting ++;
                    try
                    {
                        if (!(_vSelectorCondition_66_28)) throw new _xThatOrAny (
                            "AirTrafficController.pd:66,28");
                    }
                    catch (_xCannotEvaluate _lException)
                    {
                    }
                    _eSystem.currentCheckNesting --;
                }
            }
            Aircraft _vLet_craft_66_19 = _vThatAny_66_28;
            _eSeq _vThose_67_28 = new _eSeq ();
            {
                int _vCaptureCount_c_67_38 = aircrafts._oHash ();
                int _vLoopCounter_67_35 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_67_35 == _vCaptureCount_c_67_38)) break;
                    if ((!identification._lEqual (((Aircraft) aircrafts._oIndex (_vLoopCounter_67_35)
                        ).identification)))
                    {
                        _vThose_67_28 = _vThose_67_28.append (aircrafts._oIndex (_vLoopCounter_67_35)
                            );
                    }
                    _vLoopCounter_67_35 = _eSystem._oSucc (_vLoopCounter_67_35);
                }
            }
            aircrafts = _vThose_67_28.append (((_eAny) _vLet_craft_66_19.getCraftTargettingHeight (
                targetHeight)));
        }
        _lClassInvariantCheck ("AirTrafficController.pd:66,14");
    }

    public void fly (double forTime)
    {
        dropIfLeavesBoundaryAfterFlying (forTime);
        {
            _eSeq _vForYield_71_27 = new _eSeq ();
            {
                int _vCaptureCount_craft_71_39 = aircrafts._oHash ();
                int _vLoopCounter_71_32 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_71_32 == _vCaptureCount_craft_71_39)) break;
                    _vForYield_71_27 = _vForYield_71_27.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_71_32)).getCraftAfterFlying (forTime)));
                    _vLoopCounter_71_32 = _eSystem._oSucc (_vLoopCounter_71_32);
                }
            }
            aircrafts = _vForYield_71_27;
        }
        {
            _eMap _vLet_locConflicts_72_19 = conflicts ();
            _eSeq _vForYield_73_28 = new _eSeq ();
            {
                int _vCaptureCount_craft_73_40 = aircrafts._oHash ();
                int _vLoopCounter_73_33 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_73_33 == _vCaptureCount_craft_73_40)) break;
                    _vForYield_73_28 = _vForYield_73_28.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_73_33)).getCraftWithConflictStatus (getConflictStatus
                        (((Aircraft) aircrafts._oIndex (_vLoopCounter_73_33)),
                        _vLet_locConflicts_72_19, (AircraftPair) null, (ConflictStatus) null), (
                        ConflictStatus) null)));
                    _vLoopCounter_73_33 = _eSystem._oSucc (_vLoopCounter_73_33);
                }
            }
            aircrafts = _vForYield_73_28;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:70,19");
    }

    public void addAircraft (Aircraft aircraft)
    {
        _eSeq _vUnshare_78_14 = ((_eSeq) aircrafts._lClone ());
        aircrafts = _vUnshare_78_14;
        _vUnshare_78_14._iz_append (((_eAny) aircraft));
        fly (0.0);
        _lClassInvariantCheck ("AirTrafficController.pd:78,14");
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
                boolean _vCondResult_83_13;
                if (((_vminX < _vmaxX) && (_vminY < _vmaxY)))
                {
                    boolean _vQuantifierResult_83_15;
                    {
                        _vQuantifierResult_83_15 = true;
                        int _vCaptureCount_i_83_30 = _vaircrafts._oHash ();
                        int _vLoopCounter_83_23 = 0;
                        for (;;)
                        {
                            if (((_vCaptureCount_i_83_30 <= _vLoopCounter_83_23) || (!
                                _vQuantifierResult_83_15))) break;
                            boolean _vQuantifierResult_83_43;
                            {
                                _vQuantifierResult_83_43 = true;
                                int _vCaptureCount_j_83_62 = _vaircrafts._oHash ();
                                int _vLoopCounter_83_51 = (1 + _vLoopCounter_83_23);
                                for (;;)
                                {
                                    if (((_vCaptureCount_j_83_62 <= _vLoopCounter_83_51) || (!
                                        _vQuantifierResult_83_43))) break;
                                    _vQuantifierResult_83_43 = (!((Aircraft) _vaircrafts._oIndex (
                                        _vLoopCounter_83_51))._lEqual (((Aircraft) _vaircrafts.
                                        _oIndex (_vLoopCounter_83_23))));
                                    if ((!_vQuantifierResult_83_43))
                                    {
                                    }
                                    else
                                    {
                                        _vLoopCounter_83_51 = _eSystem._oSucc (_vLoopCounter_83_51);
                                    }
                                }
                            }
                            _vQuantifierResult_83_15 = _vQuantifierResult_83_43;
                            if ((!_vQuantifierResult_83_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_83_23 = _eSystem._oSucc (_vLoopCounter_83_23);
                            }
                        }
                    }
                    _vCondResult_83_13 = _vQuantifierResult_83_15;
                }
                else
                {
                    _vCondResult_83_13 = false;
                }
                boolean _vCondResult_84_13;
                if (_vCondResult_83_13)
                {
                    boolean _vQuantifierResult_84_15;
                    {
                        _vQuantifierResult_84_15 = true;
                        int _vCaptureCount_a_84_26 = _vaircrafts._oHash ();
                        int _vLoopCounter_84_23 = 0;
                        for (;;)
                        {
                            if (((_vLoopCounter_84_23 == _vCaptureCount_a_84_26) || (!
                                _vQuantifierResult_84_15))) break;
                            _vQuantifierResult_84_15 = (((_vminX <= ((Aircraft) _vaircrafts._oIndex
                                (_vLoopCounter_84_23)).position.x) && (((Aircraft) _vaircrafts.
                                _oIndex (_vLoopCounter_84_23)).position.x <= _vmaxX)) && ((_vminY <=
                                ((Aircraft) _vaircrafts._oIndex (_vLoopCounter_84_23)).position.y)
                                && (((Aircraft) _vaircrafts._oIndex (_vLoopCounter_84_23)).position.
                                y <= _vmaxY)));
                            if ((!_vQuantifierResult_84_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_84_23 = _eSystem._oSucc (_vLoopCounter_84_23);
                            }
                        }
                    }
                    _vCondResult_84_13 = _vQuantifierResult_84_15;
                }
                else
                {
                    _vCondResult_84_13 = false;
                }
                if (!(_vCondResult_84_13)) throw new _xPre ("AirTrafficController.pd:84,13");
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
        _lc_AirTrafficController ("AirTrafficController.pd:85,14");
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
