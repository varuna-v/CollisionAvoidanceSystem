//***********************************************************************************************
//* File: 'AirTrafficController.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/AirTrafficController.pd'
//* by Perfect Developer version 6.10.01 at 15:08:28 UTC on Wednesday March 11th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etfEDEA.tmp
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
    protected _eSet getPairs ()
    {
        _eSeq _vForYield_26_22 = new _eSeq ();
        {
            int _vCaptureCount_i_26_34 = aircrafts._oHash ();
            int _vLoopCounter_26_27 = 0;
            for (;;)
            {
                if ((_vCaptureCount_i_26_34 <= _vLoopCounter_26_27)) break;
                _eSeq _vForYield_26_51 = new _eSeq ();
                {
                    int _vCaptureCount_j_26_67 = aircrafts._oHash ();
                    int _vLoopCounter_26_56 = (1 + _vLoopCounter_26_27);
                    for (;;)
                    {
                        if ((_vCaptureCount_j_26_67 <= _vLoopCounter_26_56)) break;
                        _vForYield_26_51 = _vForYield_26_51.append (((_eAny) new AircraftPair (((
                            Aircraft) aircrafts._oIndex (_vLoopCounter_26_27)), ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_26_56)))));
                        _vLoopCounter_26_56 = _eSystem._oSucc (_vLoopCounter_26_56);
                    }
                }
                _vForYield_26_22 = _vForYield_26_22.append (((_eAny) _vForYield_26_51.ran ()));
                _vLoopCounter_26_27 = _eSystem._oSucc (_vLoopCounter_26_27);
            }
        }
        _eSet _vLet_s_26_17 = _vForYield_26_22.ran ();
        return Ertsys.RtsGlobals.flatten (_vLet_s_26_17, (_eSet) null, (_eTemplate_0) null);
    }

    protected _eMap conflicts ()
    {
        _eSet _vLet_pairs_31_17 = getPairs ();
        _eSet _vForYield_32_53 = new _eSet ();
        {
            int _vCaptureCount_p_32_61 = _vLet_pairs_31_17._oHash ();
            int _vLoopCounter_32_58 = 0;
            for (;;)
            {
                if ((_vLoopCounter_32_58 == _vCaptureCount_p_32_61)) break;
                _vForYield_32_53 = _vForYield_32_53.append (((_eAny) new _ePair (_vLet_pairs_31_17.
                    _oIndex (_vLoopCounter_32_58), ((_eAny) new ConflictStatus (((AircraftPair)
                    _vLet_pairs_31_17._oIndex (_vLoopCounter_32_58)).getConflictStatus ())))));
                _vLoopCounter_32_58 = _eSystem._oSucc (_vLoopCounter_32_58);
            }
        }
        return new _eMap (_vForYield_32_53, (_ePair) null, (_eTemplate_0) null, (_eTemplate_1) null);
    }

    protected boolean willAllAircraftsBeInBoundaryAfterFlying (double flyForTime)
    {
        boolean _vQuantifierResult_37_12;
        {
            _vQuantifierResult_37_12 = true;
            int _vCaptureCount_a_37_22 = aircrafts._oHash ();
            int _vLoopCounter_37_19 = 0;
            for (;;)
            {
                if (((_vLoopCounter_37_19 == _vCaptureCount_a_37_22) || (!_vQuantifierResult_37_12)))
                    break;
                _vQuantifierResult_37_12 = willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts
                    ._oIndex (_vLoopCounter_37_19)), flyForTime);
                if ((!_vQuantifierResult_37_12))
                {
                }
                else
                {
                    _vLoopCounter_37_19 = _eSystem._oSucc (_vLoopCounter_37_19);
                }
            }
        }
        return _vQuantifierResult_37_12;
    }

    protected boolean willAircraftBeInBoundryAfterFlying (Aircraft aircraft, double flyForTime)
    {
        Vector _vLet_endPosition_40_17 = aircraft.positionAfterFlying (flyForTime);
        return (((minX <= _vLet_endPosition_40_17.x) && (_vLet_endPosition_40_17.x <= maxX)) && ((
            minY <= _vLet_endPosition_40_17.y) && (_vLet_endPosition_40_17.y <= maxY)));
    }

    protected void dropIfLeavesBoundaryAfterFlying (double flyForTime)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_45_13;
                {
                    _vQuantifierResult_45_13 = true;
                    int _vCaptureCount_a_45_23 = aircrafts._oHash ();
                    int _vLoopCounter_45_20 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_45_20 == _vCaptureCount_a_45_23) || (!
                            _vQuantifierResult_45_13))) break;
                        _vQuantifierResult_45_13 = (((minX <= ((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_45_20)).position.x) && (((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_45_20)).position.x <= maxX)) && ((minY <= ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_45_20)).position.y) && (((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_45_20)).position.y <= maxY)));
                        if ((!_vQuantifierResult_45_13))
                        {
                        }
                        else
                        {
                            _vLoopCounter_45_20 = _eSystem._oSucc (_vLoopCounter_45_20);
                        }
                    }
                }
                if (!(_vQuantifierResult_45_13)) throw new _xPre ("AirTrafficController.pd:45,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        {
            _eSeq _vThose_46_27 = new _eSeq ();
            {
                int _vCaptureCount_a_46_37 = aircrafts._oHash ();
                int _vLoopCounter_46_34 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_46_34 == _vCaptureCount_a_46_37)) break;
                    if (willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts._oIndex (
                        _vLoopCounter_46_34)), flyForTime))
                    {
                        _vThose_46_27 = _vThose_46_27.append (aircrafts._oIndex (_vLoopCounter_46_34)
                            );
                    }
                    _vLoopCounter_46_34 = _eSystem._oSucc (_vLoopCounter_46_34);
                }
            }
            aircrafts = _vThose_46_27;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:46,14");
    }

    protected _eSet getPairsThatArePFC ()
    {
        _eSet _vLet_pairs_51_17 = getPairs ();
        _eSet _vThose_52_13 = new _eSet ();
        {
            int _vCaptureCount_p_52_22 = _vLet_pairs_51_17._oHash ();
            int _vLoopCounter_52_19 = 0;
            for (;;)
            {
                if ((_vLoopCounter_52_19 == _vCaptureCount_p_52_22)) break;
                if ((ConflictStatus.PotentialFutureConflict == ((AircraftPair) _vLet_pairs_51_17.
                    _oIndex (_vLoopCounter_52_19)).getConflictStatus ()))
                {
                    _vThose_52_13 = _vThose_52_13.append (_vLet_pairs_51_17._oIndex (
                        _vLoopCounter_52_19));
                }
                _vLoopCounter_52_19 = _eSystem._oSucc (_vLoopCounter_52_19);
            }
        }
        return _vThose_52_13;
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
        _eSet _vForYield_64_24 = new _eSet ();
        {
            _eSet _vCaptureBound_c_64_51 = incconflicts.pairs ();
            int _vCaptureCount_c_64_51 = _vCaptureBound_c_64_51._oHash ();
            int _vLoopCounter_64_35 = 0;
            for (;;)
            {
                if ((_vLoopCounter_64_35 == _vCaptureCount_c_64_51)) break;
                if ((aircraft._lEqual (((AircraftPair) ((_ePair) _vCaptureBound_c_64_51._oIndex (
                    _vLoopCounter_64_35)).x).craft1) || aircraft._lEqual (((AircraftPair) ((_ePair)
                    _vCaptureBound_c_64_51._oIndex (_vLoopCounter_64_35)).x).craft2)))
                {
                    _vForYield_64_24 = _vForYield_64_24.append (((_ePair) _vCaptureBound_c_64_51.
                        _oIndex (_vLoopCounter_64_35)).y);
                }
                _vLoopCounter_64_35 = _eSystem._oSucc (_vLoopCounter_64_35);
            }
        }
        _eSet _vLet_lst_64_17 = _vForYield_64_24;
        return (_vLet_lst_64_17._ovIn (((_eAny) new ConflictStatus (ConflictStatus.Conflicted))) ?
        ConflictStatus.Conflicted : _vLet_lst_64_17._ovIn (((_eAny) new ConflictStatus (
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
                boolean _vQuantifierResult_70_13;
                {
                    _vQuantifierResult_70_13 = false;
                    int _vCaptureCount_c_70_23 = aircrafts._oHash ();
                    int _vLoopCounter_70_20 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_70_20 == _vCaptureCount_c_70_23) ||
                            _vQuantifierResult_70_13)) break;
                        _vQuantifierResult_70_13 = identification._lEqual (((Aircraft) aircrafts.
                            _oIndex (_vLoopCounter_70_20)).identification);
                        if (_vQuantifierResult_70_13)
                        {
                        }
                        else
                        {
                            _vLoopCounter_70_20 = _eSystem._oSucc (_vLoopCounter_70_20);
                        }
                    }
                }
                if (!(_vQuantifierResult_70_13)) throw new _xPre ("AirTrafficController.pd:70,13");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        {
            Aircraft _vThatAny_71_28 = null;
            {
                boolean _vSelectorCondition_71_28;
                _vSelectorCondition_71_28 = false;
                int _vCaptureCount_c_71_36 = aircrafts._oHash ();
                int _vLoopCounter_71_33 = 0;
                for (;;)
                {
                    if (((_vLoopCounter_71_33 == _vCaptureCount_c_71_36) ||
                        _vSelectorCondition_71_28)) break;
                    _vSelectorCondition_71_28 = identification._lEqual (((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_71_33)).identification);
                    if (_vSelectorCondition_71_28)
                    {
                        _vThatAny_71_28 = ((Aircraft) aircrafts._oIndex (_vLoopCounter_71_33));
                    }
                    if (_vSelectorCondition_71_28)
                    {
                    }
                    else
                    {
                        _vLoopCounter_71_33 = _eSystem._oSucc (_vLoopCounter_71_33);
                    }
                }
                if (_eSystem.enableThatOrAny && _eSystem.currentCheckNesting <= _eSystem.
                    maxCheckNesting)
                {
                    _eSystem.currentCheckNesting ++;
                    try
                    {
                        if (!(_vSelectorCondition_71_28)) throw new _xThatOrAny (
                            "AirTrafficController.pd:71,28");
                    }
                    catch (_xCannotEvaluate _lException)
                    {
                    }
                    _eSystem.currentCheckNesting --;
                }
            }
            Aircraft _vLet_craft_71_19 = _vThatAny_71_28;
            _eSeq _vThose_72_28 = new _eSeq ();
            {
                int _vCaptureCount_c_72_38 = aircrafts._oHash ();
                int _vLoopCounter_72_35 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_72_35 == _vCaptureCount_c_72_38)) break;
                    if ((!identification._lEqual (((Aircraft) aircrafts._oIndex (_vLoopCounter_72_35)
                        ).identification)))
                    {
                        _vThose_72_28 = _vThose_72_28.append (aircrafts._oIndex (_vLoopCounter_72_35)
                            );
                    }
                    _vLoopCounter_72_35 = _eSystem._oSucc (_vLoopCounter_72_35);
                }
            }
            aircrafts = _vThose_72_28.append (((_eAny) _vLet_craft_71_19.getCraftTargettingHeight (
                targetHeight)));
        }
        _lClassInvariantCheck ("AirTrafficController.pd:71,14");
    }

    public void fly (double forTime)
    {
        dropIfLeavesBoundaryAfterFlying (forTime);
        {
            _eSeq _vForYield_76_27 = new _eSeq ();
            {
                int _vCaptureCount_craft_76_39 = aircrafts._oHash ();
                int _vLoopCounter_76_32 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_76_32 == _vCaptureCount_craft_76_39)) break;
                    _vForYield_76_27 = _vForYield_76_27.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_76_32)).getCraftAfterFlying (forTime)));
                    _vLoopCounter_76_32 = _eSystem._oSucc (_vLoopCounter_76_32);
                }
            }
            aircrafts = _vForYield_76_27;
        }
        {
            _eMap _vLet_locConflicts_77_19 = conflicts ();
            _eSeq _vForYield_78_28 = new _eSeq ();
            {
                int _vCaptureCount_craft_78_40 = aircrafts._oHash ();
                int _vLoopCounter_78_33 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_78_33 == _vCaptureCount_craft_78_40)) break;
                    _vForYield_78_28 = _vForYield_78_28.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_78_33)).getCraftWithConflictStatus (getConflictStatus
                        (((Aircraft) aircrafts._oIndex (_vLoopCounter_78_33)),
                        _vLet_locConflicts_77_19, (AircraftPair) null, (ConflictStatus) null), (
                        ConflictStatus) null)));
                    _vLoopCounter_78_33 = _eSystem._oSucc (_vLoopCounter_78_33);
                }
            }
            aircrafts = _vForYield_78_28;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:75,19");
    }

    public void addAircraft (Aircraft aircraft)
    {
        _eSeq _vUnshare_86_14 = ((_eSeq) aircrafts._lClone ());
        aircrafts = _vUnshare_86_14;
        _vUnshare_86_14._iz_append (((_eAny) aircraft));
        fly (0.0);
        _lClassInvariantCheck ("AirTrafficController.pd:86,14");
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
                boolean _vCondResult_91_13;
                if (((_vminX < _vmaxX) && (_vminY < _vmaxY)))
                {
                    boolean _vQuantifierResult_91_15;
                    {
                        _vQuantifierResult_91_15 = true;
                        int _vCaptureCount_i_91_30 = _vaircrafts._oHash ();
                        int _vLoopCounter_91_23 = 0;
                        for (;;)
                        {
                            if (((_vCaptureCount_i_91_30 <= _vLoopCounter_91_23) || (!
                                _vQuantifierResult_91_15))) break;
                            boolean _vQuantifierResult_91_43;
                            {
                                _vQuantifierResult_91_43 = true;
                                int _vCaptureCount_j_91_62 = _vaircrafts._oHash ();
                                int _vLoopCounter_91_51 = (1 + _vLoopCounter_91_23);
                                for (;;)
                                {
                                    if (((_vCaptureCount_j_91_62 <= _vLoopCounter_91_51) || (!
                                        _vQuantifierResult_91_43))) break;
                                    _vQuantifierResult_91_43 = (!((Aircraft) _vaircrafts._oIndex (
                                        _vLoopCounter_91_51))._lEqual (((Aircraft) _vaircrafts.
                                        _oIndex (_vLoopCounter_91_23))));
                                    if ((!_vQuantifierResult_91_43))
                                    {
                                    }
                                    else
                                    {
                                        _vLoopCounter_91_51 = _eSystem._oSucc (_vLoopCounter_91_51);
                                    }
                                }
                            }
                            _vQuantifierResult_91_15 = _vQuantifierResult_91_43;
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
                boolean _vCondResult_92_13;
                if (_vCondResult_91_13)
                {
                    boolean _vQuantifierResult_92_15;
                    {
                        _vQuantifierResult_92_15 = true;
                        int _vCaptureCount_a_92_26 = _vaircrafts._oHash ();
                        int _vLoopCounter_92_23 = 0;
                        for (;;)
                        {
                            if (((_vLoopCounter_92_23 == _vCaptureCount_a_92_26) || (!
                                _vQuantifierResult_92_15))) break;
                            _vQuantifierResult_92_15 = (((_vminX <= ((Aircraft) _vaircrafts._oIndex
                                (_vLoopCounter_92_23)).position.x) && (((Aircraft) _vaircrafts.
                                _oIndex (_vLoopCounter_92_23)).position.x <= _vmaxX)) && ((_vminY <=
                                ((Aircraft) _vaircrafts._oIndex (_vLoopCounter_92_23)).position.y)
                                && (((Aircraft) _vaircrafts._oIndex (_vLoopCounter_92_23)).position.
                                y <= _vmaxY)));
                            if ((!_vQuantifierResult_92_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_92_23 = _eSystem._oSucc (_vLoopCounter_92_23);
                            }
                        }
                    }
                    _vCondResult_92_13 = _vQuantifierResult_92_15;
                }
                else
                {
                    _vCondResult_92_13 = false;
                }
                if (!(_vCondResult_92_13)) throw new _xPre ("AirTrafficController.pd:92,13");
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
        _lc_AirTrafficController ("AirTrafficController.pd:93,14");
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
