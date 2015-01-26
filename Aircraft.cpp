//***********************************************************************************************
//* File: 'Aircraft.cpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\Aircraft.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************

#include "Ertsys.hpp"

// File inclusions for forward declarations

#include "Aircraft_0.hpp"
#include "VectorType_0.hpp"

// File inclusions for full declarations

#include "AircraftStatus_1.hpp"
#include "Aircraft_1.hpp"
#include "ConflictStatus_1.hpp"
#include "VectorType_1.hpp"
#include "Vector_1.hpp"

// File inclusions for inline code

#include "AircraftStatus_2.hpp"
#include "Aircraft_2.hpp"
#include "ConflictStatus_2.hpp"
#include "VectorType_2.hpp"
#include "Vector_2.hpp"


static const _eHndl < _eModuleDescriptorData > _amoduleData (new _eModuleDescriptorData (_eSeq <
    _eHeapTableEntry > (), _eSeq < _eTypeTableEntry > (_eTypeTableEntry (_mString ("Aircraft"),
    _mInteger (0), _eSeq < _eSeparatorId :: _eEnum > ())), _eSeq < _eInstantiationTableEntry > ()));
static const _eMDH _aobjLoaderNode (_amoduleData, NULL, NULL, NULL);

_mBeginClassInvariant (Aircraft)
#if !defined(NDEBUG)
_mBeginClassInvariantItem _mCheckClassInvariantItem ((position -> type == VectorType :: Position),
    "19,29");
#endif
#if !defined(NDEBUG)
_mBeginClassInvariantItem _mCheckClassInvariantItem ((velocity -> type == VectorType :: Velocity),
    "20,29");
#endif
#if !defined(NDEBUG)
_mBeginClassInvariantItem _mCheckClassInvariantItem ((!identification.empty ()), "21,15");
#endif
_mEndClassInvariant
const _eReal Aircraft :: safteyTime = 300.0;
_eReal Aircraft :: speed () const
{
    _mFunction (speed);
    return velocity -> Vector :: magnitude ();
}

ConflictStatus :: _eEnum Aircraft :: getConflictStatus (const Aircraft * other) const
{
    _mFunction (getConflictStatus);
    return (isInConflictWith (other) ?
    ConflictStatus :: Conflicted : ((!(velocity == other -> velocity)) && potentialFutureConflict (
        other)) ?
    ConflictStatus :: PotentialFutureConflict : ConflictStatus :: NoConflict);
}

_eBool Aircraft :: isInConflictWith (const Aircraft * other) const
{
    _mFunction (isInConflictWith);
    return (position -> Vector :: getDistanceFrom (other -> position.Ptr ()) <= (boundaryRadius +
        other -> boundaryRadius));
}

_eBool Aircraft :: potentialFutureConflict (const Aircraft * other) const
{
    _mFunction (potentialFutureConflict);
    #if !defined(NDEBUG)
    _mBeginPre _mCheckPre (((!isInConflictWith (other)) && (!(velocity == other -> velocity))),
        "40,13");
    #endif
    return (timeToCollision (other) <= (Aircraft :: safteyTime + timeToHypotheticalCollisionWith (
        other)));
}

_eReal Aircraft :: timeToCollision (const Aircraft * other) const
{
    _mFunction (timeToCollision);
    #if !defined(NDEBUG)
    _mBeginPre _mCheckPre (((!isInConflictWith (other)) && (!(velocity == other -> velocity))),
        "44,13");
    #endif
    const _eHndl < Vector > _vLet_velocityDifference_45_17 (other -> velocity -> Vector :: operator
        - (velocity.Ptr ()).Ptr ());
    return _onDiv (position -> Vector :: operator - (other -> position.Ptr ()) -> Vector ::
        dotProduct (_vLet_velocityDifference_45_17.Ptr ()), _onExp (_vLet_velocityDifference_45_17
        -> Vector :: magnitude (), _mInteger (2)));
}

_eReal Aircraft :: timeToHypotheticalCollisionWith (const Aircraft * other) const
{
    _mFunction (timeToHypotheticalCollisionWith);
    #if !defined(NDEBUG)
    _mBeginPre _mCheckPre ((!isInConflictWith (other)), "51,13");
    #endif
    const _eReal _vLet_biggerRadius_52_17 = ((other -> boundaryRadius < boundaryRadius) ?
    boundaryRadius : other -> boundaryRadius);
    return _onDiv (_vLet_biggerRadius_52_17, (speed () + other -> Aircraft :: speed ()));
}

_eHndl < Vector > Aircraft :: positionAfterFlying (const _eReal time) const
{
    _mFunction (positionAfterFlying);
    return position -> Vector :: plus (velocity -> Vector :: operator * (time).Ptr (), VectorType ::
        Position);
}

_eHndl < Aircraft > Aircraft :: getCraftAfterFlying (const _eReal time) const
{
    _mFunction (getCraftAfterFlying);
    return _eHndl < Aircraft > (new Aircraft (positionAfterFlying (time).Ptr (), velocity.Ptr (),
        boundaryRadius, status, identification));
}

_eSeq < _eChar > Aircraft :: toString () const
{
    _mFunction (toString);
    return _mString ("\t Position: ")._oPlusPlus (position -> Vector :: toString ())._oPlusPlus (
        _mString ("\n\t Velocity: "))._oPlusPlus (velocity -> Vector :: toString ());
}

Aircraft :: Aircraft (const Vector * _vposition, const Vector * _vvelocity, const _eReal
    _vboundaryRadius, const AircraftStatus :: _eEnum _vstatus, const _eSeq < _eChar >
    _videntification) : _eAny ()
{
    _mBuild;
    _mConstructor;
    #if !defined(NDEBUG)
    _mBeginPre _mCheckPre ((((_vposition -> type == VectorType :: Position) && (_vvelocity -> type
        == VectorType :: Velocity)) && (!_videntification.empty ())), "69,28");
    #endif
    position = _vposition;
    velocity = _vvelocity;
    boundaryRadius = _vboundaryRadius;
    status = _vstatus;
    identification = _videntification;
    _mCheckClassInvariant ("68,5");
}

_eBool Aircraft :: operator == (const Aircraft * _vArg_11_11) const
{
    _mOperator (=);
    _mBeginEquality (_vArg_11_11)
    return (((((_vArg_11_11 -> position == position) && (_vArg_11_11 -> velocity == velocity)) && (
        _vArg_11_11 -> boundaryRadius == boundaryRadius)) && (_vArg_11_11 -> status == status)) && (
        _vArg_11_11 -> identification == identification));
}

_eHndl < _eInstblTypeInfo > Aircraft :: _aMyTypeInfo ()
{
    static _eHndl < _eInstblTypeInfo > ti;
    ti = _eHndl < _eInstblTypeInfo > (new _eInstblTypeInfo (_eModuleDescriptorAddress (&
        _aobjLoaderNode), 0));
    return ti;
}


// End of file.
