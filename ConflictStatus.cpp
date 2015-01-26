//***********************************************************************************************
//* File: 'ConflictStatus.cpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\ConflictStatus.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************

#include "Ertsys.hpp"

// File inclusions for forward declarations

#include "ConflictStatus_0.hpp"

// File inclusions for full declarations

#include "ConflictStatus_1.hpp"

// File inclusions for inline code

#include "ConflictStatus_2.hpp"


static const _eHndl < _eModuleDescriptorData > _amoduleData (new _eModuleDescriptorData (_eSeq <
    _eHeapTableEntry > (), _eSeq < _eTypeTableEntry > (_eTypeTableEntry (_mString ("ConflictStatus"),
    _mInteger (0), _eSeq < _eSeparatorId :: _eEnum > ())), _eSeq < _eInstantiationTableEntry > ()));
static _eFrom < _eStorable > _acreateRegularObject (const _eInt _aindex)
{
    _mFunction ($createRegularObject);
    return (_mCheckLastChoice ("9,13", (_mInteger (0) == _aindex), _eFrom < _eStorable > (
        _mWrapStorableEnum (ConflictStatus :: Conflicted, ConflictStatus))));
}

static const _eMDH _aobjLoaderNode (_amoduleData, & _acreateRegularObject, NULL, NULL);

const _eMDH * _agetObjLoaderNode_ConflictStatus ()
{
    return & _aobjLoaderNode;
}

_mEnumStorableSupportBdy (ConflictStatus, ConflictStatus)
const _eNativeChar * ConflictStatus :: _lnaming [3] =
{
    _mCstr("Conflicted"), _mCstr("PotentialFutureConflict"), _mCstr("NoConflict")
};


// End of file.
