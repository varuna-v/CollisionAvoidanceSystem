//***********************************************************************************************
//* File: 'AirTrafficController.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/AirTrafficController.pd'
//* by Perfect Developer version 6.10.01 at 12:22:03 UTC on Monday February 2nd 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etfD3C3.tmp
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
                        _vQuantifierResult_19_15 = (((minX <= ((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_19_22)).position.x) && (((Aircraft) aircrafts._oIndex (
                            _vLoopCounter_19_22)).position.x <= maxX)) && ((minY <= ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_19_22)).position.y) && (((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_19_22)).position.y <= maxY)));
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
                    int _vCaptureCount_i_20_29 = aircrafts._oHash ();
                    int _vLoopCounter_20_22 = 0;
                    for (;;)
                    {
                        if (((_vCaptureCount_i_20_29 <= _vLoopCounter_20_22) || (!
                            _vQuantifierResult_20_15))) break;
                        boolean _vQuantifierResult_20_42;
                        {
                            _vQuantifierResult_20_42 = true;
                            int _vCaptureCount_j_20_61 = aircrafts._oHash ();
                            int _vLoopCounter_20_50 = (1 + _vLoopCounter_20_22);
                            for (;;)
                            {
                                if (((_vCaptureCount_j_20_61 <= _vLoopCounter_20_50) || (!
                                    _vQuantifierResult_20_42))) break;
                                _vQuantifierResult_20_42 = (!((Aircraft) aircrafts._oIndex (
                                    _vLoopCounter_20_50))._lEqual (((Aircraft) aircrafts._oIndex (
                                    _vLoopCounter_20_22))));
                                if ((!_vQuantifierResult_20_42))
                                {
                                }
                                else
                                {
                                    _vLoopCounter_20_50 = _eSystem._oSucc (_vLoopCounter_20_50);
                                }
                            }
                        }
                        _vQuantifierResult_20_15 = _vQuantifierResult_20_42;
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
        _eSeq _vForYield_30_22 = new _eSeq ();
        {
            int _vCaptureCount_i_30_34 = aircrafts._oHash ();
            int _vLoopCounter_30_27 = 0;
            for (;;)
            {
                if ((_vCaptureCount_i_30_34 <= _vLoopCounter_30_27)) break;
                _eSeq _vForYield_30_51 = new _eSeq ();
                {
                    int _vCaptureCount_j_30_67 = aircrafts._oHash ();
                    int _vLoopCounter_30_56 = (1 + _vLoopCounter_30_27);
                    for (;;)
                    {
                        if ((_vCaptureCount_j_30_67 <= _vLoopCounter_30_56)) break;
                        _vForYield_30_51 = _vForYield_30_51.append (((_eAny) new AircraftPair (((
                            Aircraft) aircrafts._oIndex (_vLoopCounter_30_27)), ((Aircraft)
                            aircrafts._oIndex (_vLoopCounter_30_56)))));
                        _vLoopCounter_30_56 = _eSystem._oSucc (_vLoopCounter_30_56);
                    }
                }
                _vForYield_30_22 = _vForYield_30_22.append (((_eAny) _vForYield_30_51.ran ()));
                _vLoopCounter_30_27 = _eSystem._oSucc (_vLoopCounter_30_27);
            }
        }
        _eSet _vLet_s_30_17 = _vForYield_30_22.ran ();
        return Ertsys.RtsGlobals.flatten (_vLet_s_30_17, (_eSet) null, (_eTemplate_0) null);
    }

    public _eMap conflicts ()
    {
        _eSet _vLet_pairs_35_17 = getPairs ();
        _eSet _vForYield_36_53 = new _eSet ();
        {
            int _vCaptureCount_p_36_61 = _vLet_pairs_35_17._oHash ();
            int _vLoopCounter_36_58 = 0;
            for (;;)
            {
                if ((_vLoopCounter_36_58 == _vCaptureCount_p_36_61)) break;
                _vForYield_36_53 = _vForYield_36_53.append (((_eAny) new _ePair (_vLet_pairs_35_17.
                    _oIndex (_vLoopCounter_36_58), ((_eAny) new ConflictStatus (((AircraftPair)
                    _vLet_pairs_35_17._oIndex (_vLoopCounter_36_58)).getConflictStatus ())))));
                _vLoopCounter_36_58 = _eSystem._oSucc (_vLoopCounter_36_58);
            }
        }
        return new _eMap (_vForYield_36_53, (_ePair) null, (_eTemplate_0) null, (_eTemplate_1) null);
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
            _ePair _vThatAny_46_28 = null;
            {
                boolean _vSelectorCondition_46_28;
                _vSelectorCondition_46_28 = false;
                int _vCaptureCount_k_46_35 = cons._oHash ();
                int _vLoopCounter_46_32 = 0;
                for (;;)
                {
                    if (((_vLoopCounter_46_32 == _vCaptureCount_k_46_35) ||
                        _vSelectorCondition_46_28)) break;
                    _vSelectorCondition_46_28 = ((_ePair) cons._oIndex (_vLoopCounter_46_32)).
                        _lEqual (((_ePair) cons._oIndex (_vLoopCounter_46_32)));
                    if (_vSelectorCondition_46_28)
                    {
                        _vThatAny_46_28 = ((_ePair) cons._oIndex (_vLoopCounter_46_32));
                    }
                    if (_vSelectorCondition_46_28)
                    {
                    }
                    else
                    {
                        _vLoopCounter_46_32 = _eSystem._oSucc (_vLoopCounter_46_32);
                    }
                }
                if (_eSystem.enableThatOrAny && _eSystem.currentCheckNesting <= _eSystem.
                    maxCheckNesting)
                {
                    _eSystem.currentCheckNesting ++;
                    try
                    {
                        if (!(_vSelectorCondition_46_28)) throw new _xThatOrAny (
                            "AirTrafficController.pd:46,28");
                    }
                    catch (_xCannotEvaluate _lException)
                    {
                    }
                    _eSystem.currentCheckNesting --;
                }
            }
            _ePair _vLet_c_46_23 = _vThatAny_46_28;
            return _eSystem._lString ("Pair <br>")._oPlusPlus (((AircraftPair) _vLet_c_46_23.x).
                _rtoString (), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("<br> Status: "),
                (_eTemplate_0) null)._oPlusPlus (ConflictStatus._ltoString (((ConflictStatus)
                _vLet_c_46_23.y).value), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("<br>"),
                (_eTemplate_0) null)._oPlusPlus (getConflictsString (cons.remove (((_eAny)
                _vLet_c_46_23)), (_ePair) null, (AircraftPair) null, (ConflictStatus) null), (
                _eTemplate_0) null);
        }
    }

    public boolean willAllAircraftsBeInBoundaryAfterFlying ()
    {
        boolean _vQuantifierResult_50_12;
        {
            _vQuantifierResult_50_12 = true;
            int _vCaptureCount_a_50_22 = aircrafts._oHash ();
            int _vLoopCounter_50_19 = 0;
            for (;;)
            {
                if (((_vLoopCounter_50_19 == _vCaptureCount_a_50_22) || (!_vQuantifierResult_50_12)))
                    break;
                _vQuantifierResult_50_12 = willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts
                    ._oIndex (_vLoopCounter_50_19)));
                if ((!_vQuantifierResult_50_12))
                {
                }
                else
                {
                    _vLoopCounter_50_19 = _eSystem._oSucc (_vLoopCounter_50_19);
                }
            }
        }
        return _vQuantifierResult_50_12;
    }

    public boolean willAircraftBeInBoundryAfterFlying (Aircraft aircraft)
    {
        Vector _vLet_endPosition_53_17 = aircraft.positionAfterFlying (AirTrafficController.
            defaultTimeToFlyFor);
        return (((minX <= _vLet_endPosition_53_17.x) && (_vLet_endPosition_53_17.x <= maxX)) && ((
            minY <= _vLet_endPosition_53_17.y) && (_vLet_endPosition_53_17.y <= maxY)));
    }

    public int getConflictStatus (Aircraft aircraft, _eMap incconflicts, AircraftPair
        _t0incconflicts, ConflictStatus _t1incconflicts)
    {
        _eSet _vForYield_57_24 = new _eSet ();
        {
            _eSet _vCaptureBound_c_57_51 = incconflicts.pairs ();
            int _vCaptureCount_c_57_51 = _vCaptureBound_c_57_51._oHash ();
            int _vLoopCounter_57_35 = 0;
            for (;;)
            {
                if ((_vLoopCounter_57_35 == _vCaptureCount_c_57_51)) break;
                if ((aircraft._lEqual (((AircraftPair) ((_ePair) _vCaptureBound_c_57_51._oIndex (
                    _vLoopCounter_57_35)).x).craft1) || aircraft._lEqual (((AircraftPair) ((_ePair)
                    _vCaptureBound_c_57_51._oIndex (_vLoopCounter_57_35)).x).craft2)))
                {
                    _vForYield_57_24 = _vForYield_57_24.append (((_ePair) _vCaptureBound_c_57_51.
                        _oIndex (_vLoopCounter_57_35)).y);
                }
                _vLoopCounter_57_35 = _eSystem._oSucc (_vLoopCounter_57_35);
            }
        }
        _eSet _vLet_lst_57_17 = _vForYield_57_24;
        return (_vLet_lst_57_17._ovIn (((_eAny) new ConflictStatus (ConflictStatus.Conflicted))) ?
        ConflictStatus.Conflicted : _vLet_lst_57_17._ovIn (((_eAny) new ConflictStatus (
            ConflictStatus.PotentialFutureConflict))) ?
        ConflictStatus.PotentialFutureConflict : ConflictStatus.NoConflict);
    }

    public void dropIfLeavesBoundaryAfterFlying ()
    {
        {
            _eSeq _vThose_64_27 = new _eSeq ();
            {
                int _vCaptureCount_a_64_37 = aircrafts._oHash ();
                int _vLoopCounter_64_34 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_64_34 == _vCaptureCount_a_64_37)) break;
                    if (willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts._oIndex (
                        _vLoopCounter_64_34))))
                    {
                        _vThose_64_27 = _vThose_64_27.append (aircrafts._oIndex (_vLoopCounter_64_34)
                            );
                    }
                    _vLoopCounter_64_34 = _eSystem._oSucc (_vLoopCounter_64_34);
                }
            }
            aircrafts = _vThose_64_27;
        }
        _lClassInvariantCheck ("AirTrafficController.pd:64,14");
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
                boolean _vCondResult_78_13;
                if (((_vminX < _vmaxX) && (_vminY < _vmaxY)))
                {
                    boolean _vQuantifierResult_78_15;
                    {
                        _vQuantifierResult_78_15 = true;
                        int _vCaptureCount_i_78_30 = _vaircrafts._oHash ();
                        int _vLoopCounter_78_23 = 0;
                        for (;;)
                        {
                            if (((_vCaptureCount_i_78_30 <= _vLoopCounter_78_23) || (!
                                _vQuantifierResult_78_15))) break;
                            boolean _vQuantifierResult_78_43;
                            {
                                _vQuantifierResult_78_43 = true;
                                int _vCaptureCount_j_78_62 = _vaircrafts._oHash ();
                                int _vLoopCounter_78_51 = (1 + _vLoopCounter_78_23);
                                for (;;)
                                {
                                    if (((_vCaptureCount_j_78_62 <= _vLoopCounter_78_51) || (!
                                        _vQuantifierResult_78_43))) break;
                                    _vQuantifierResult_78_43 = (!((Aircraft) _vaircrafts._oIndex (
                                        _vLoopCounter_78_51))._lEqual (((Aircraft) _vaircrafts.
                                        _oIndex (_vLoopCounter_78_23))));
                                    if ((!_vQuantifierResult_78_43))
                                    {
                                    }
                                    else
                                    {
                                        _vLoopCounter_78_51 = _eSystem._oSucc (_vLoopCounter_78_51);
                                    }
                                }
                            }
                            _vQuantifierResult_78_15 = _vQuantifierResult_78_43;
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
                boolean _vCondResult_79_13;
                if (_vCondResult_78_13)
                {
                    boolean _vQuantifierResult_79_15;
                    {
                        _vQuantifierResult_79_15 = true;
                        int _vCaptureCount_a_79_26 = _vaircrafts._oHash ();
                        int _vLoopCounter_79_23 = 0;
                        for (;;)
                        {
                            if (((_vLoopCounter_79_23 == _vCaptureCount_a_79_26) || (!
                                _vQuantifierResult_79_15))) break;
                            _vQuantifierResult_79_15 = (((_vminX <= ((Aircraft) _vaircrafts._oIndex
                                (_vLoopCounter_79_23)).position.x) && (((Aircraft) _vaircrafts.
                                _oIndex (_vLoopCounter_79_23)).position.x <= _vmaxX)) && ((_vminY <=
                                ((Aircraft) _vaircrafts._oIndex (_vLoopCounter_79_23)).position.y)
                                && (((Aircraft) _vaircrafts._oIndex (_vLoopCounter_79_23)).position.
                                y <= _vmaxY)));
                            if ((!_vQuantifierResult_79_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_79_23 = _eSystem._oSucc (_vLoopCounter_79_23);
                            }
                        }
                    }
                    _vCondResult_79_13 = _vQuantifierResult_79_15;
                }
                else
                {
                    _vCondResult_79_13 = false;
                }
                if (!(_vCondResult_79_13)) throw new _xPre ("AirTrafficController.pd:79,13");
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
        _lc_AirTrafficController ("AirTrafficController.pd:76,5");
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
