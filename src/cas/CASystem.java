//***********************************************************************************************
//* File: 'CASystem.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/CASystem.pd'
//* by Perfect Developer version 6.10.01 at 14:22:42 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etfDC3D.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class CASystem extends _eAny
{
    final void _lc_CASystem (String _lArg)
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
                if (!(_vQuantifierResult_19_15)) throw new _xClassInvariantItem ("CASystem.pd:19,15",
                    _lArg);
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
                if (!(_vQuantifierResult_20_15)) throw new _xClassInvariantItem ("CASystem.pd:20,15",
                    _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
    }

    protected void _lClassInvariantCheck (String _lArg)
    {
        _lc_CASystem (_lArg);
    }

    protected final static double defaultTimeToFlyFor = 60.0;
    protected _eSeq aircrafts;
    protected double minX;
    protected double maxX;
    protected double minY;
    protected double maxY;
    public _eSet getPairs ()
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

    public _eMap conflicts ()
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

    public _eSeq printConflicts ()
    {
        return getConflictsString (conflicts ().pairs (), (_ePair) null, (AircraftPair) null, (
            ConflictStatus) null);
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
            _ePair _vThatAny_42_28 = null;
            {
                boolean _vSelectorCondition_42_28;
                _vSelectorCondition_42_28 = false;
                int _vCaptureCount_k_42_35 = cons._oHash ();
                int _vLoopCounter_42_32 = 0;
                for (;;)
                {
                    if (((_vLoopCounter_42_32 == _vCaptureCount_k_42_35) ||
                        _vSelectorCondition_42_28)) break;
                    _vSelectorCondition_42_28 = ((_ePair) cons._oIndex (_vLoopCounter_42_32)).
                        _lEqual (((_ePair) cons._oIndex (_vLoopCounter_42_32)));
                    if (_vSelectorCondition_42_28)
                    {
                        _vThatAny_42_28 = ((_ePair) cons._oIndex (_vLoopCounter_42_32));
                    }
                    if (_vSelectorCondition_42_28)
                    {
                    }
                    else
                    {
                        _vLoopCounter_42_32 = _eSystem._oSucc (_vLoopCounter_42_32);
                    }
                }
                if (_eSystem.enableThatOrAny && _eSystem.currentCheckNesting <= _eSystem.
                    maxCheckNesting)
                {
                    _eSystem.currentCheckNesting ++;
                    try
                    {
                        if (!(_vSelectorCondition_42_28)) throw new _xThatOrAny ("CASystem.pd:42,28")
                            ;
                    }
                    catch (_xCannotEvaluate _lException)
                    {
                    }
                    _eSystem.currentCheckNesting --;
                }
            }
            _ePair _vLet_c_42_23 = _vThatAny_42_28;
            return _eSystem._lString ("Pair \n")._oPlusPlus (((AircraftPair) _vLet_c_42_23.x).
                _rtoString (), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("\n Status: "), (
                _eTemplate_0) null)._oPlusPlus (ConflictStatus._ltoString (((ConflictStatus)
                _vLet_c_42_23.y).value), (_eTemplate_0) null)._oPlusPlus (_eSystem._lString ("\n"),
                (_eTemplate_0) null)._oPlusPlus (getConflictsString (cons.remove (((_eAny)
                _vLet_c_42_23)), (_ePair) null, (AircraftPair) null, (ConflictStatus) null), (
                _eTemplate_0) null);
        }
    }

    public boolean willAllAircraftsBeInBoundaryAfterFlying ()
    {
        boolean _vQuantifierResult_46_12;
        {
            _vQuantifierResult_46_12 = true;
            int _vCaptureCount_a_46_22 = aircrafts._oHash ();
            int _vLoopCounter_46_19 = 0;
            for (;;)
            {
                if (((_vLoopCounter_46_19 == _vCaptureCount_a_46_22) || (!_vQuantifierResult_46_12)))
                    break;
                _vQuantifierResult_46_12 = willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts
                    ._oIndex (_vLoopCounter_46_19)));
                if ((!_vQuantifierResult_46_12))
                {
                }
                else
                {
                    _vLoopCounter_46_19 = _eSystem._oSucc (_vLoopCounter_46_19);
                }
            }
        }
        return _vQuantifierResult_46_12;
    }

    public boolean willAircraftBeInBoundryAfterFlying (Aircraft aircraft)
    {
        Vector _vLet_endPosition_49_17 = aircraft.positionAfterFlying (CASystem.defaultTimeToFlyFor);
        return (((minX <= _vLet_endPosition_49_17.x) && (_vLet_endPosition_49_17.x <= maxX)) && ((
            minY <= _vLet_endPosition_49_17.y) && (_vLet_endPosition_49_17.y <= maxY)));
    }

    public void dropIfLeavesBoundaryAfterFlying ()
    {
        {
            _eSeq _vThose_54_37 = new _eSeq ();
            {
                int _vCaptureCount_a_54_47 = aircrafts._oHash ();
                int _vLoopCounter_54_44 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_54_44 == _vCaptureCount_a_54_47)) break;
                    if ((!willAircraftBeInBoundryAfterFlying (((Aircraft) aircrafts._oIndex (
                        _vLoopCounter_54_44)))))
                    {
                        _vThose_54_37 = _vThose_54_37.append (aircrafts._oIndex (_vLoopCounter_54_44)
                            );
                    }
                    _vLoopCounter_54_44 = _eSystem._oSucc (_vLoopCounter_54_44);
                }
            }
            _eSeq _vLet_craftsToRemove_54_19 = _vThose_54_37;
            _eSeq _vThose_55_28 = new _eSeq ();
            {
                int _vCaptureCount_x_55_38 = aircrafts._oHash ();
                int _vLoopCounter_55_35 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_55_35 == _vCaptureCount_x_55_38)) break;
                    if ((!_vLet_craftsToRemove_54_19._ovIn (aircrafts._oIndex (_vLoopCounter_55_35)))
                        )
                    {
                        _vThose_55_28 = _vThose_55_28.append (aircrafts._oIndex (_vLoopCounter_55_35)
                            );
                    }
                    _vLoopCounter_55_35 = _eSystem._oSucc (_vLoopCounter_55_35);
                }
            }
            aircrafts = _vThose_55_28;
        }
        _lClassInvariantCheck ("CASystem.pd:54,14");
    }

    public void fly ()
    {
        dropIfLeavesBoundaryAfterFlying ();
        {
            _eSeq _vForYield_60_27 = new _eSeq ();
            {
                int _vCaptureCount_craft_60_39 = aircrafts._oHash ();
                int _vLoopCounter_60_32 = 0;
                for (;;)
                {
                    if ((_vLoopCounter_60_32 == _vCaptureCount_craft_60_39)) break;
                    _vForYield_60_27 = _vForYield_60_27.append (((_eAny) ((Aircraft) aircrafts.
                        _oIndex (_vLoopCounter_60_32)).getCraftAfterFlying (CASystem.
                        defaultTimeToFlyFor)));
                    _vLoopCounter_60_32 = _eSystem._oSucc (_vLoopCounter_60_32);
                }
            }
            aircrafts = _vForYield_60_27;
        }
        _lClassInvariantCheck ("CASystem.pd:59,19");
    }

    public CASystem (_eSeq _vaircrafts, Aircraft _t0_vaircrafts, double _vminX, double _vmaxX,
        double _vminY, double _vmaxY)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vCondResult_65_13;
                if (((_vminX < _vmaxX) && (_vminY < _vmaxY)))
                {
                    boolean _vQuantifierResult_65_15;
                    {
                        _vQuantifierResult_65_15 = true;
                        int _vCaptureCount_a_65_26 = _vaircrafts._oHash ();
                        int _vLoopCounter_65_23 = 0;
                        for (;;)
                        {
                            if (((_vLoopCounter_65_23 == _vCaptureCount_a_65_26) || (!
                                _vQuantifierResult_65_15))) break;
                            _vQuantifierResult_65_15 = (1 == _vaircrafts._ovHash (_vaircrafts.
                                _oIndex (_vLoopCounter_65_23)));
                            if ((!_vQuantifierResult_65_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_65_23 = _eSystem._oSucc (_vLoopCounter_65_23);
                            }
                        }
                    }
                    _vCondResult_65_13 = _vQuantifierResult_65_15;
                }
                else
                {
                    _vCondResult_65_13 = false;
                }
                boolean _vCondResult_66_13;
                if (_vCondResult_65_13)
                {
                    boolean _vQuantifierResult_66_15;
                    {
                        _vQuantifierResult_66_15 = true;
                        int _vCaptureCount_a_66_26 = _vaircrafts._oHash ();
                        int _vLoopCounter_66_23 = 0;
                        for (;;)
                        {
                            if (((_vLoopCounter_66_23 == _vCaptureCount_a_66_26) || (!
                                _vQuantifierResult_66_15))) break;
                            _vQuantifierResult_66_15 = (((_vminX <= ((Aircraft) _vaircrafts._oIndex
                                (_vLoopCounter_66_23)).position.x) && (((Aircraft) _vaircrafts.
                                _oIndex (_vLoopCounter_66_23)).position.x <= _vmaxX)) && ((_vminY <=
                                ((Aircraft) _vaircrafts._oIndex (_vLoopCounter_66_23)).position.y)
                                && (((Aircraft) _vaircrafts._oIndex (_vLoopCounter_66_23)).position.
                                y <= _vmaxY)));
                            if ((!_vQuantifierResult_66_15))
                            {
                            }
                            else
                            {
                                _vLoopCounter_66_23 = _eSystem._oSucc (_vLoopCounter_66_23);
                            }
                        }
                    }
                    _vCondResult_66_13 = _vQuantifierResult_66_15;
                }
                else
                {
                    _vCondResult_66_13 = false;
                }
                if (!(_vCondResult_66_13)) throw new _xPre ("CASystem.pd:66,13");
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
        _lc_CASystem ("CASystem.pd:62,5");
    }

    public boolean _lEqual (CASystem _vArg_10_11)
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
        return _lArg == this || (_lArg != null && _lArg.getClass () == CASystem.class && _lEqual ((
            CASystem) _lArg));
    }

}


// End of file.
