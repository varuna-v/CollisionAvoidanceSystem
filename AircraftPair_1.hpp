//***********************************************************************************************
//* File: 'AircraftPair_1.hpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\AircraftPair.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************


#if !defined(_hMain_AircraftPair)
#define _hMain_AircraftPair

// Full declarations


class AircraftPair : public _eAny
{
public:
    // CONCRETE INDIRECT class ...
    _mDefineType (AircraftPair)
    _mDefineCopy (AircraftPair)
    _mEqualsOperator (AircraftPair)
    _mNew (AircraftPair)
    _mPerfectTypeInfoHdrNA (AircraftPair)
public:
    _eHndl < Aircraft > craft1;
public:
    _eHndl < Aircraft > craft2;
public:
    virtual ConflictStatus :: _eEnum getConflictStatus () const;
public:
    virtual _eSeq < _eChar > toString () const;
public:
    AircraftPair (const Aircraft *, const Aircraft *);
public:
    _eBool operator == (const AircraftPair *) const;
    _mDeclareClassInvariant
};

#endif

// End of file.
