//***********************************************************************************************
//* File: 'Aircraft_1.hpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\Aircraft.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************


#if !defined(_hMain_Aircraft)
#define _hMain_Aircraft

// Full declarations


class Aircraft : public _eAny
{
public:
    // CONCRETE INDIRECT class ...
    _mDefineType (Aircraft)
    _mDefineCopy (Aircraft)
    _mEqualsOperator (Aircraft)
    _mNew (Aircraft)
    _mPerfectTypeInfoHdrNA (Aircraft)
protected:
    static const _eReal safteyTime;
public:
    _eHndl < Vector > position;
protected:
    _eHndl < Vector > velocity;
protected:
    _eReal boundaryRadius;
protected:
    AircraftStatus :: _eEnum status;
protected:
    _eSeq < _eChar > identification;
public:
    virtual _eReal speed () const;
public:
    virtual ConflictStatus :: _eEnum getConflictStatus (const Aircraft *) const;
public:
    virtual _eBool isInConflictWith (const Aircraft *) const;
public:
    virtual _eBool potentialFutureConflict (const Aircraft *) const;
public:
    virtual _eReal timeToCollision (const Aircraft *) const;
public:
    virtual _eReal timeToHypotheticalCollisionWith (const Aircraft *) const;
public:
    virtual _eHndl < Vector > positionAfterFlying (const _eReal) const;
public:
    virtual _eHndl < Aircraft > getCraftAfterFlying (const _eReal) const;
public:
    virtual _eSeq < _eChar > toString () const;
public:
    Aircraft (const Vector *, const Vector *, const _eReal, const AircraftStatus :: _eEnum, const
        _eSeq < _eChar >);
public:
    _eBool operator == (const Aircraft *) const;
    _mDeclareClassInvariant
};

#endif

// End of file.
