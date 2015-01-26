//***********************************************************************************************
//* File: 'AircraftPair.cpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\AircraftPair.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************

#include "Ertsys.hpp"

// File inclusions for forward declarations

#include "AircraftPair_0.hpp"

// File inclusions for full declarations

#include "AircraftPair_1.hpp"
#include "Aircraft_1.hpp"
#include "ConflictStatus_1.hpp"

// File inclusions for inline code

#include "AircraftPair_2.hpp"
#include "Aircraft_2.hpp"
#include "ConflictStatus_2.hpp"


static const _eHndl < _eModuleDescriptorData > _amoduleData (new _eModuleDescriptorData (_eSeq <
    _eHeapTableEntry > (), _eSeq < _eTypeTableEntry > (_eTypeTableEntry (_mString ("AircraftPair"),
    _mInteger (0), _eSeq < _eSeparatorId :: _eEnum > ())), _eSeq < _eInstantiationTableEntry > ()));
static const _eMDH _aobjLoaderNode (_amoduleData, NULL, NULL, NULL);

_mBeginClassInvariant (AircraftPair)
#if !defined(NDEBUG)
_mBeginClassInvariantItem _mCheckClassInvariantItem ((!(craft1 == craft2)), "13,22");
#endif
_mEndClassInvariant
ConflictStatus :: _eEnum AircraftPair :: getConflictStatus () const
{
    _mFunction (getConflictStatus);
    return craft1 -> Aircraft :: getConflictStatus (craft2.Ptr ());
}

_eSeq < _eChar > AircraftPair :: toString () const
{
    _mFunction (toString);
    return _mString ("Craft 1 \n")._oPlusPlus (craft1 -> Aircraft :: toString ())._oPlusPlus (
        _mString ("\n Craft 2 \n"))._oPlusPlus (craft2 -> Aircraft :: toString ());
}

AircraftPair :: AircraftPair (const Aircraft * _vcraft1, const Aircraft * _vcraft2) : _eAny ()
{
    _mBuild;
    _mConstructor;
    #if !defined(NDEBUG)
    _mBeginPre _mCheckPre ((!(_eHndl < Aircraft > (_vcraft1) == _eHndl < Aircraft > (_vcraft2))),
        "32,20");
    #endif
    craft1 = _vcraft1;
    craft2 = _vcraft2;
    _mCheckClassInvariant ("31,5");
}

_eBool AircraftPair :: operator == (const AircraftPair * _vArg_10_9) const
{
    _mOperator (=);
    _mBeginEquality (_vArg_10_9)
    return ((_vArg_10_9 -> craft1 == craft1) && (_vArg_10_9 -> craft2 == craft2));
}

_eHndl < _eInstblTypeInfo > AircraftPair :: _aMyTypeInfo ()
{
    static _eHndl < _eInstblTypeInfo > ti;
    ti = _eHndl < _eInstblTypeInfo > (new _eInstblTypeInfo (_eModuleDescriptorAddress (&
        _aobjLoaderNode), 0));
    return ti;
}


// End of file.
