//***********************************************************************************************
//* File: 'CASystem.cpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\CASystem.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************

#include "Ertsys.hpp"

// File inclusions for forward declarations

#include "CASystem_0.hpp"
#include "Vector_0.hpp"

// File inclusions for full declarations

#include "AircraftPair_1.hpp"
#include "Aircraft_1.hpp"
#include "CASystem_1.hpp"
#include "ConflictStatus_1.hpp"
#include "Vector_1.hpp"

// File inclusions for inline code

#include "AircraftPair_2.hpp"
#include "Aircraft_2.hpp"
#include "CASystem_2.hpp"
#include "ConflictStatus_2.hpp"
#include "Vector_2.hpp"


static const _eHndl < _eModuleDescriptorData > _amoduleData (new _eModuleDescriptorData (_eSeq <
    _eHeapTableEntry > (), _eSeq < _eTypeTableEntry > (_eTypeTableEntry (_mString ("CASystem"),
    _mInteger (0), _eSeq < _eSeparatorId :: _eEnum > ())), _eSeq < _eInstantiationTableEntry > ()));
static const _eMDH _aobjLoaderNode (_amoduleData, NULL, NULL, NULL);

_mBeginClassInvariant (CASystem)
#if !defined(NDEBUG)
_mBeginClassInvariantItem _eBool _vQuantifierResult_19_15;
{
    _vQuantifierResult_19_15 = true;
    const _eInt _vCaptureCount_a_19_25 = aircrafts._oHash ();
    _eInt _vLoopCounter_19_22 = _mInteger (0);
    for (;;)
    {
        if (((_vLoopCounter_19_22 == _vCaptureCount_a_19_25) || (!_vQuantifierResult_19_15))) break;
        _vQuantifierResult_19_15 = (_mInteger (1) == aircrafts._ovHash (static_cast < const _eSeq <
            _eHndl < Aircraft > > & > (aircrafts) [_vLoopCounter_19_22]));
        if ((!_vQuantifierResult_19_15))
        {
        }
        else
        {
            _vLoopCounter_19_22 = _onSucc (_vLoopCounter_19_22);
        }
    }
}

_mCheckClassInvariantItem (_vQuantifierResult_19_15, "19,15");
#endif
#if !defined(NDEBUG)
_mBeginClassInvariantItem _eBool _vQuantifierResult_20_15;
{
    _vQuantifierResult_20_15 = true;
    const _eInt _vCaptureCount_a_20_25 = aircrafts._oHash ();
    _eInt _vLoopCounter_20_22 = _mInteger (0);
    for (;;)
    {
        if (((_vLoopCounter_20_22 == _vCaptureCount_a_20_25) || (!_vQuantifierResult_20_15))) break;
        _vQuantifierResult_20_15 = (((minX <= static_cast < const _eSeq < _eHndl < Aircraft > > & >
            (aircrafts) [_vLoopCounter_20_22] -> position -> x) && (static_cast < const _eSeq <
            _eHndl < Aircraft > > & > (aircrafts) [_vLoopCounter_20_22] -> position -> x <= maxX))
            && ((minY <= static_cast < const _eSeq < _eHndl < Aircraft > > & > (aircrafts) [
            _vLoopCounter_20_22] -> position -> y) && (static_cast < const _eSeq < _eHndl < Aircraft
            > > & > (aircrafts) [_vLoopCounter_20_22] -> position -> y <= maxY)));
        if ((!_vQuantifierResult_20_15))
        {
        }
        else
        {
            _vLoopCounter_20_22 = _onSucc (_vLoopCounter_20_22);
        }
    }
}

_mCheckClassInvariantItem (_vQuantifierResult_20_15, "20,15");
#endif
#if !defined(NDEBUG)
_mBeginClassInvariantItem _eBool _vQuantifierResult_21_15;
{
    _vQuantifierResult_21_15 = true;
    const _eInt _vCaptureCount_i_21_29 = aircrafts._oHash ();
    _eInt _vLoopCounter_21_22 = _mInteger (0);
    for (;;)
    {
        if (((_vCaptureCount_i_21_29 <= _vLoopCounter_21_22) || (!_vQuantifierResult_21_15))) break;
        _eBool _vQuantifierResult_21_42;
        {
            _vQuantifierResult_21_42 = true;
            const _eInt _vCaptureCount_j_21_57 = aircrafts._oHash ();
            _eInt _vLoopCounter_21_50 = _vLoopCounter_21_22;
            for (;;)
            {
                if (((_vCaptureCount_j_21_57 <= _vLoopCounter_21_50) || (!_vQuantifierResult_21_42)))
                    break;
                _vQuantifierResult_21_42 = (!(static_cast < const _eSeq < _eHndl < Aircraft > > & >
                    (aircrafts) [_vLoopCounter_21_50] == static_cast < const _eSeq < _eHndl <
                    Aircraft > > & > (aircrafts) [_vLoopCounter_21_22]));
                if ((!_vQuantifierResult_21_42))
                {
                }
                else
                {
                    _vLoopCounter_21_50 = _onSucc (_vLoopCounter_21_50);
                }
            }
        }
        _vQuantifierResult_21_15 = _vQuantifierResult_21_42;
        if ((!_vQuantifierResult_21_15))
        {
        }
        else
        {
            _vLoopCounter_21_22 = _onSucc (_vLoopCounter_21_22);
        }
    }
}

_mCheckClassInvariantItem (_vQuantifierResult_21_15, "21,15");
#endif
_mEndClassInvariant
const _eReal CASystem :: defaultTimeToFlyFor = 60.0;
_eSet < _eHndl < AircraftPair > > CASystem :: getPairs () const
{
    _mFunction (getPairs);
    _eSeq < _eSet < _eHndl < AircraftPair > > > _vForYield_26_22 = _eSeq < _eSet < _eHndl <
        AircraftPair > > > ();
    {
        const _eInt _vCaptureCount_i_26_34 = aircrafts._oHash ();
        _eInt _vLoopCounter_26_27 = _mInteger (0);
        for (;;)
        {
            if ((_vCaptureCount_i_26_34 <= _vLoopCounter_26_27)) break;
            _eSeq < _eHndl < AircraftPair > > _vForYield_26_51 = _eSeq < _eHndl < AircraftPair > > ()
                ;
            {
                const _eInt _vCaptureCount_j_26_63 = aircrafts._oHash ();
                _eInt _vLoopCounter_26_56 = _vLoopCounter_26_27;
                for (;;)
                {
                    if ((_vCaptureCount_j_26_63 <= _vLoopCounter_26_56)) break;
                    _vForYield_26_51 = _vForYield_26_51.append (_eHndl < AircraftPair > (new
                        AircraftPair (aircrafts [_vLoopCounter_26_27].Ptr (), aircrafts [
                        _vLoopCounter_26_56].Ptr ())));
                    _vLoopCounter_26_56 = _onSucc (_vLoopCounter_26_56);
                }
            }
            _vForYield_26_22 = _vForYield_26_22.append (_vForYield_26_51.ran ());
            _vLoopCounter_26_27 = _onSucc (_vLoopCounter_26_27);
        }
    }
    const _eSet < _eSet < _eHndl < AircraftPair > > > _vLet_s_26_17 = _vForYield_26_22.ran ();
    return flatten (_vLet_s_26_17);
}

_eMap < _eHndl < AircraftPair > _mComma ConflictStatus :: _eEnum > CASystem :: conflicts () const
{
    _mFunction (conflicts);
    const _eSet < _eHndl < AircraftPair > > _vLet_pairs_31_17 = getPairs ();
    _eSet < _ePair < _eHndl < AircraftPair > _mComma ConflictStatus :: _eEnum > > _vForYield_32_65 =
        _eSet < _ePair < _eHndl < AircraftPair > _mComma ConflictStatus :: _eEnum > > ();
    {
        const _eInt _vCaptureCount_p_32_73 = _vLet_pairs_31_17._oHash ();
        _eInt _vLoopCounter_32_70 = _mInteger (0);
        for (;;)
        {
            if ((_vLoopCounter_32_70 == _vCaptureCount_p_32_73)) break;
            _vForYield_32_65 = _vForYield_32_65.append (_ePair < _eHndl < AircraftPair > _mComma
                ConflictStatus :: _eEnum > (_vLet_pairs_31_17 [_vLoopCounter_32_70],
                _vLet_pairs_31_17 [_vLoopCounter_32_70] -> AircraftPair :: getConflictStatus ()));
            _vLoopCounter_32_70 = _onSucc (_vLoopCounter_32_70);
        }
    }
    const _eMap < _eHndl < AircraftPair > _mComma ConflictStatus :: _eEnum > _vLet_cmap_32_17 =
        _eMap < _eHndl < AircraftPair > _mComma ConflictStatus :: _eEnum > (_vForYield_32_65);
    return _vLet_cmap_32_17;
}

_eSeq < _eChar > CASystem :: printConflicts () const
{
    _mFunction (printConflicts);
    return getConflictsString (conflicts ().pairs ());
}

_eSeq < _eChar > CASystem :: getConflictsString (const _eSet < _ePair < _eHndl < AircraftPair >
    _mComma ConflictStatus :: _eEnum > > cons) const
{
    _mFunction (getConflictsString);
    if ((_mInteger (0) == cons._oHash ()))
    {
        return _mString ("");
    }
    else
    {
        _ePair < _eHndl < AircraftPair > _mComma ConflictStatus :: _eEnum > _vThatAny_43_28;
        {
            _eBool _vSelectorCondition_43_28;
            _vSelectorCondition_43_28 = false;
            const _eInt _vCaptureCount_k_43_35 = cons._oHash ();
            _eInt _vLoopCounter_43_32 = _mInteger (0);
            for (;;)
            {
                if (((_vLoopCounter_43_32 == _vCaptureCount_k_43_35) || _vSelectorCondition_43_28))
                    break;
                _vSelectorCondition_43_28 = (cons [_vLoopCounter_43_32] == cons [_vLoopCounter_43_32]
                    );
                if (_vSelectorCondition_43_28)
                {
                    _vThatAny_43_28 = cons [_vLoopCounter_43_32];
                }
                if (_vSelectorCondition_43_28)
                {
                }
                else
                {
                    _vLoopCounter_43_32 = _onSucc (_vLoopCounter_43_32);
                }
            }
            #if !defined(NDEBUG)
            _mBeginThatOrAny _mCheckThatOrAny (_vSelectorCondition_43_28, "43,28");
            #endif
        }
        const _ePair < _eHndl < AircraftPair > _mComma ConflictStatus :: _eEnum > _vLet_c_43_23 =
            _vThatAny_43_28;
        return _mString ("Pair \n")._oPlusPlus (_vLet_c_43_23.x -> AircraftPair :: toString ()).
            _oPlusPlus (_mString ("\n Status: "))._oPlusPlus (ConflictStatus :: _ltoString (
            _vLet_c_43_23.y))._oPlusPlus (_mString ("\n"))._oPlusPlus (getConflictsString (cons.
            remove (_vLet_c_43_23)));
    }
}

_eBool CASystem :: willAllAircraftsBeInBoundaryAfterFlying () const
{
    _mFunction (willAllAircraftsBeInBoundaryAfterFlying);
    _eBool _vQuantifierResult_47_12;
    {
        _vQuantifierResult_47_12 = true;
        const _eInt _vCaptureCount_a_47_22 = aircrafts._oHash ();
        _eInt _vLoopCounter_47_19 = _mInteger (0);
        for (;;)
        {
            if (((_vLoopCounter_47_19 == _vCaptureCount_a_47_22) || (!_vQuantifierResult_47_12)))
                break;
            _vQuantifierResult_47_12 = willAircraftBeInBoundryAfterFlying (aircrafts [
                _vLoopCounter_47_19].Ptr ());
            if ((!_vQuantifierResult_47_12))
            {
            }
            else
            {
                _vLoopCounter_47_19 = _onSucc (_vLoopCounter_47_19);
            }
        }
    }
    return _vQuantifierResult_47_12;
}

_eBool CASystem :: willAircraftBeInBoundryAfterFlying (const Aircraft * aircraft) const
{
    _mFunction (willAircraftBeInBoundryAfterFlying);
    const _eHndl < Vector > _vLet_endPosition_50_17 (aircraft -> Aircraft :: positionAfterFlying (
        CASystem :: defaultTimeToFlyFor).Ptr ());
    return (((minX <= _vLet_endPosition_50_17 -> x) && (_vLet_endPosition_50_17 -> x <= maxX)) && ((
        minY <= _vLet_endPosition_50_17 -> y) && (_vLet_endPosition_50_17 -> y <= maxY)));
}

void CASystem :: dropIfLeavesBoundaryAfterFlying ()
{
    _mSchema (dropIfLeavesBoundaryAfterFlying);
    _mDontShare (this);
    {
        _eSeq < _eHndl < Aircraft > > _vThose_55_37 = _eSeq < _eHndl < Aircraft > > ();
        {
            const _eInt _vCaptureCount_a_55_47 = aircrafts._oHash ();
            _eInt _vLoopCounter_55_44 = _mInteger (0);
            for (;;)
            {
                if ((_vLoopCounter_55_44 == _vCaptureCount_a_55_47)) break;
                if ((!willAircraftBeInBoundryAfterFlying (static_cast < const _eSeq < _eHndl <
                    Aircraft > > & > (aircrafts) [_vLoopCounter_55_44].Ptr ())))
                {
                    _vThose_55_37 = _vThose_55_37.append (static_cast < const _eSeq < _eHndl <
                        Aircraft > > & > (aircrafts) [_vLoopCounter_55_44]);
                }
                _vLoopCounter_55_44 = _onSucc (_vLoopCounter_55_44);
            }
        }
        const _eSeq < _eHndl < Aircraft > > _vLet_craftsToRemove_55_19 = _vThose_55_37;
        _eSeq < _eHndl < Aircraft > > _vThose_56_28 = _eSeq < _eHndl < Aircraft > > ();
        {
            const _eInt _vCaptureCount_x_56_38 = aircrafts._oHash ();
            _eInt _vLoopCounter_56_35 = _mInteger (0);
            for (;;)
            {
                if ((_vLoopCounter_56_35 == _vCaptureCount_x_56_38)) break;
                if ((!_vLet_craftsToRemove_55_19._ovIn (static_cast < const _eSeq < _eHndl <
                    Aircraft > > & > (aircrafts) [_vLoopCounter_56_35])))
                {
                    _vThose_56_28 = _vThose_56_28.append (static_cast < const _eSeq < _eHndl <
                        Aircraft > > & > (aircrafts) [_vLoopCounter_56_35]);
                }
                _vLoopCounter_56_35 = _onSucc (_vLoopCounter_56_35);
            }
        }
        aircrafts = _vThose_56_28;
    }
    _mCheckClassInvariant ("55,14");
}

void CASystem :: fly ()
{
    _mSchema (fly);
    _mDontShare (this);
    dropIfLeavesBoundaryAfterFlying ();
    {
        _eSeq < _eHndl < Aircraft > > _vForYield_61_27 = _eSeq < _eHndl < Aircraft > > ();
        {
            const _eInt _vCaptureCount_craft_61_39 = aircrafts._oHash ();
            _eInt _vLoopCounter_61_32 = _mInteger (0);
            for (;;)
            {
                if ((_vLoopCounter_61_32 == _vCaptureCount_craft_61_39)) break;
                _vForYield_61_27 = _vForYield_61_27.append (static_cast < const _eSeq < _eHndl <
                    Aircraft > > & > (aircrafts) [_vLoopCounter_61_32] -> Aircraft ::
                    getCraftAfterFlying (CASystem :: defaultTimeToFlyFor));
                _vLoopCounter_61_32 = _onSucc (_vLoopCounter_61_32);
            }
        }
        aircrafts = _vForYield_61_27;
    }
    _mCheckClassInvariant ("60,19");
}

CASystem :: CASystem (const _eSeq < _eHndl < Aircraft > > _vaircrafts, const _eReal _vminX, const
    _eReal _vmaxX, const _eReal _vminY, const _eReal _vmaxY) : _eAny ()
{
    _mBuild;
    _mConstructor;
    #if !defined(NDEBUG)
    _mBeginPre _eBool _vCondResult_65_13;
    if (((_vminX < _vmaxX) && (_vminY < _vmaxY)))
    {
        _eBool _vQuantifierResult_65_15;
        {
            _vQuantifierResult_65_15 = true;
            const _eInt _vCaptureCount_i_65_30 = _vaircrafts._oHash ();
            _eInt _vLoopCounter_65_23 = _mInteger (0);
            for (;;)
            {
                if (((_vCaptureCount_i_65_30 <= _vLoopCounter_65_23) || (!_vQuantifierResult_65_15)))
                    break;
                _eBool _vQuantifierResult_65_43;
                {
                    _vQuantifierResult_65_43 = true;
                    const _eInt _vCaptureCount_j_65_58 = _vaircrafts._oHash ();
                    _eInt _vLoopCounter_65_51 = _vLoopCounter_65_23;
                    for (;;)
                    {
                        if (((_vCaptureCount_j_65_58 <= _vLoopCounter_65_51) || (!
                            _vQuantifierResult_65_43))) break;
                        _vQuantifierResult_65_43 = (!(_vaircrafts [_vLoopCounter_65_51] ==
                            _vaircrafts [_vLoopCounter_65_23]));
                        if ((!_vQuantifierResult_65_43))
                        {
                        }
                        else
                        {
                            _vLoopCounter_65_51 = _onSucc (_vLoopCounter_65_51);
                        }
                    }
                }
                _vQuantifierResult_65_15 = _vQuantifierResult_65_43;
                if ((!_vQuantifierResult_65_15))
                {
                }
                else
                {
                    _vLoopCounter_65_23 = _onSucc (_vLoopCounter_65_23);
                }
            }
        }
        _vCondResult_65_13 = _vQuantifierResult_65_15;
    }
    else
    {
        _vCondResult_65_13 = false;
    }
    _eBool _vCondResult_66_13;
    if (_vCondResult_65_13)
    {
        _eBool _vQuantifierResult_66_15;
        {
            _vQuantifierResult_66_15 = true;
            const _eInt _vCaptureCount_a_66_26 = _vaircrafts._oHash ();
            _eInt _vLoopCounter_66_23 = _mInteger (0);
            for (;;)
            {
                if (((_vLoopCounter_66_23 == _vCaptureCount_a_66_26) || (!_vQuantifierResult_66_15)))
                    break;
                _vQuantifierResult_66_15 = (((_vminX <= _vaircrafts [_vLoopCounter_66_23] ->
                    position -> x) && (_vaircrafts [_vLoopCounter_66_23] -> position -> x <= _vmaxX))
                    && ((_vminY <= _vaircrafts [_vLoopCounter_66_23] -> position -> y) && (
                    _vaircrafts [_vLoopCounter_66_23] -> position -> y <= _vmaxY)));
                if ((!_vQuantifierResult_66_15))
                {
                }
                else
                {
                    _vLoopCounter_66_23 = _onSucc (_vLoopCounter_66_23);
                }
            }
        }
        _vCondResult_66_13 = _vQuantifierResult_66_15;
    }
    else
    {
        _vCondResult_66_13 = false;
    }
    _mCheckPre (_vCondResult_66_13, "66,13");
    #endif
    aircrafts = _vaircrafts;
    minX = _vminX;
    maxX = _vmaxX;
    minY = _vminY;
    maxY = _vmaxY;
    _mCheckClassInvariant ("63,5");
}

_eBool CASystem :: operator == (const CASystem * _vArg_10_11) const
{
    _mOperator (=);
    _mBeginEquality (_vArg_10_11)
    return (((((_vArg_10_11 -> aircrafts == aircrafts) && (_vArg_10_11 -> minX == minX)) && (
        _vArg_10_11 -> maxX == maxX)) && (_vArg_10_11 -> minY == minY)) && (_vArg_10_11 -> maxY ==
        maxY));
}

_eHndl < _eInstblTypeInfo > CASystem :: _aMyTypeInfo ()
{
    static _eHndl < _eInstblTypeInfo > ti;
    ti = _eHndl < _eInstblTypeInfo > (new _eInstblTypeInfo (_eModuleDescriptorAddress (&
        _aobjLoaderNode), 0));
    return ti;
}


// End of file.
