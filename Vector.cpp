//***********************************************************************************************
//* File: 'Vector.cpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\Vector.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************

#include "Ertsys.hpp"

// File inclusions for forward declarations

#include "Vector_0.hpp"

// File inclusions for full declarations

#include "VectorType_1.hpp"
#include "Vector_1.hpp"

// File inclusions for inline code

#include "VectorType_2.hpp"
#include "Vector_2.hpp"


static const _eHndl < _eModuleDescriptorData > _amoduleData (new _eModuleDescriptorData (_eSeq <
    _eHeapTableEntry > (), _eSeq < _eTypeTableEntry > (_eTypeTableEntry (_mString ("Vector"),
    _mInteger (0), _eSeq < _eSeparatorId :: _eEnum > ())), _eSeq < _eInstantiationTableEntry > ()));
static const _eMDH _aobjLoaderNode (_amoduleData, NULL, NULL, NULL);

_eReal Vector :: magnitude () const
{
    _mFunction (magnitude);
    return _onExp (((_onExp (x, _mInteger (2)) + _onExp (y, _mInteger (2))) + _onExp (z, _mInteger (
        2))), _onDiv (_mInteger (1), _mInteger (2)));
}

_eReal Vector :: getDistanceFrom (const Vector * other) const
{
    _mFunction (getDistanceFrom);
    #if !defined(NDEBUG)
    _mBeginPre _mCheckPre (((type == VectorType :: Position) && (other -> type == VectorType ::
        Position)), "29,18");
    #endif
    return _onExp (((_onExp ((x - other -> x), _mInteger (2)) + _onExp ((y - other -> y), _mInteger
        (2))) + _onExp ((z - other -> z), _mInteger (2))), _onDiv (_mInteger (1), _mInteger (2)));
}

_eHndl < Vector > Vector :: positionAtTime (const _eReal t, const Vector * velocity) const
{
    _mFunction (positionAtTime);
    #if !defined(NDEBUG)
    _mBeginPre _mCheckPre (((type == VectorType :: Position) && (velocity -> type == VectorType ::
        Velocity)), "33,18");
    #endif
    return _eHndl < Vector > (new Vector (((velocity -> x * t) + x), ((velocity -> y * t) + y), ((
        velocity -> z * t) + z), VectorType :: Position));
}

_eReal Vector :: dotProduct (const Vector * other) const
{
    _mFunction (dotProduct);
    return (((x * other -> x) + (y * other -> y)) + (z * other -> z));
}

_eHndl < Vector > Vector :: plus (const Vector * other, const VectorType :: _eEnum resultType) const
{
    _mFunction (plus);
    return _eHndl < Vector > (new Vector ((x + other -> x), (y + other -> y), (z + other -> z),
        resultType));
}

_eSeq < _eChar > Vector :: toString () const
{
    _mFunction (toString);
    return _mString ("(")._oPlusPlus (:: _ltoString (x))._oPlusPlus (_mString (")x + ("))._oPlusPlus
        (:: _ltoString (y))._oPlusPlus (_mString (")y + ("))._oPlusPlus (:: _ltoString (z)).
        _oPlusPlus (_mString (")z"));
}

_eHndl < Vector > Vector :: operator - (const Vector * other) const
{
    _mOperator (-);
    #if !defined(NDEBUG)
    _mBeginPre _mCheckPre ((type == other -> type), "46,18");
    #endif
    return _eHndl < Vector > (new Vector ((x - other -> x), (y - other -> y), (z - other -> z), type)
        );
}

_eHndl < Vector > Vector :: operator * (const _eReal scalar) const
{
    _mOperator (*);
    return _eHndl < Vector > (new Vector ((x * scalar), (y * scalar), (z * scalar), type));
}

Vector :: Vector (const _eReal _vx, const _eReal _vy, const VectorType :: _eEnum _vtype) : _eAny (),
    x (_vx), y (_vy), z (0.0), type (_vtype)
{
    _mBuild;
    _mConstructor;
}

Vector :: Vector (const _eReal _vx, const _eReal _vy, const _eReal _vz, const VectorType :: _eEnum
    _vtype) : _eAny (), x (_vx), y (_vy), z (_vz), type (_vtype)
{
    _mBuild;
    _mConstructor;
}

_eBool Vector :: operator == (const Vector * _vArg_10_9) const
{
    _mOperator (=);
    _mBeginEquality (_vArg_10_9)
    return ((((_vArg_10_9 -> x == x) && (_vArg_10_9 -> y == y)) && (_vArg_10_9 -> z == z)) && (
        _vArg_10_9 -> type == type));
}

_eHndl < _eInstblTypeInfo > Vector :: _aMyTypeInfo ()
{
    static _eHndl < _eInstblTypeInfo > ti;
    ti = _eHndl < _eInstblTypeInfo > (new _eInstblTypeInfo (_eModuleDescriptorAddress (&
        _aobjLoaderNode), 0));
    return ti;
}


// End of file.
