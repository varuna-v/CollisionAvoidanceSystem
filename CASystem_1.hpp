//***********************************************************************************************
//* File: 'CASystem_1.hpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\CASystem.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************


#if !defined(_hMain_CASystem)
#define _hMain_CASystem

// Full declarations


class CASystem : public _eAny
{
public:
    // CONCRETE INDIRECT class ...
    _mDefineType (CASystem)
    _mDefineCopy (CASystem)
    _mEqualsOperator (CASystem)
    _mNew (CASystem)
    _mPerfectTypeInfoHdrNA (CASystem)
protected:
    static const _eReal defaultTimeToFlyFor;
protected:
    _eSeq < _eHndl < Aircraft > > aircrafts;
protected:
    _eReal minX;
protected:
    _eReal maxX;
protected:
    _eReal minY;
protected:
    _eReal maxY;
public:
    virtual _eSet < _eHndl < AircraftPair > > getPairs () const;
public:
    virtual _eMap < _eHndl < AircraftPair > _mComma ConflictStatus :: _eEnum > conflicts () const;
public:
    virtual _eSeq < _eChar > printConflicts () const;
public:
    virtual _eSeq < _eChar > getConflictsString (const _eSet < _ePair < _eHndl < AircraftPair >
        _mComma ConflictStatus :: _eEnum > >) const;
public:
    virtual _eBool willAllAircraftsBeInBoundaryAfterFlying () const;
public:
    virtual _eBool willAircraftBeInBoundryAfterFlying (const Aircraft *) const;
public:
    virtual void dropIfLeavesBoundaryAfterFlying ();
public:
    virtual void fly ();
public:
    CASystem (const _eSeq < _eHndl < Aircraft > >, const _eReal, const _eReal, const _eReal, const
        _eReal);
public:
    _eBool operator == (const CASystem *) const;
    _mDeclareClassInvariant
};

#endif

// End of file.
