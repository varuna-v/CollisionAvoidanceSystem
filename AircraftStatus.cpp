//***********************************************************************************************
//* File: 'AircraftStatus.cpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\AircraftStatus.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************

#include "Ertsys.hpp"

// File inclusions for forward declarations

#include "AircraftStatus_0.hpp"

// File inclusions for full declarations

#include "AircraftStatus_1.hpp"

// File inclusions for inline code

#include "AircraftStatus_2.hpp"


static const _eHndl < _eModuleDescriptorData > _amoduleData (new _eModuleDescriptorData (_eSeq <
    _eHeapTableEntry > (), _eSeq < _eTypeTableEntry > (_eTypeTableEntry (_mString ("AircraftStatus"),
    _mInteger (0), _eSeq < _eSeparatorId :: _eEnum > ())), _eSeq < _eInstantiationTableEntry > ()));
static _eFrom < _eStorable > _acreateRegularObject (const _eInt _aindex)
{
    _mFunction ($createRegularObject);
    return (_mCheckLastChoice ("9,9", (_mInteger (0) == _aindex), _eFrom < _eStorable > (
        _mWrapStorableEnum (AircraftStatus :: OnGround, AircraftStatus))));
}

static const _eMDH _aobjLoaderNode (_amoduleData, & _acreateRegularObject, NULL, NULL);

const _eMDH * _agetObjLoaderNode_AircraftStatus ()
{
    return & _aobjLoaderNode;
}

_mEnumStorableSupportBdy (AircraftStatus, AircraftStatus)
const _eNativeChar * AircraftStatus :: _lnaming [4] =
{
    _mCstr("OnGround"), _mCstr("Ascending"), _mCstr("Descending"), _mCstr("FlyingAtLevel")
};


// End of file.
