//***********************************************************************************************
//* File: 'Vector_1.hpp'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:\Users\User\Desktop\Third Year Project\CollisionAvoidanceSystem\Vector.pd'
//* by Perfect Developer version 6.10.01 at 12:39:41 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=C++ -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\builtin.pd -sr=C:\Program Files\Escher Technologies\Verification Studio 6\Bin\rubric.pd -q=0 -eM=0 -@=C:\Users\User\AppData\Local\Temp\etf8B16.tmp
//***********************************************************************************************


#if !defined(_hMain_Vector)
#define _hMain_Vector

// Full declarations


class Vector : public _eAny
{
public:
    // CONCRETE INDIRECT class ...
    _mDefineType (Vector)
    _mDefineCopy (Vector)
    _mEqualsOperator (Vector)
    _mNew (Vector)
    _mPerfectTypeInfoHdrNA (Vector)
public:
    _eReal x;
public:
    _eReal y;
public:
    _eReal z;
public:
    VectorType :: _eEnum type;
public:
    virtual _eReal magnitude () const;
public:
    virtual _eReal getDistanceFrom (const Vector *) const;
public:
    virtual _eHndl < Vector > positionAtTime (const _eReal, const Vector *) const;
public:
    virtual _eReal dotProduct (const Vector *) const;
public:
    virtual _eHndl < Vector > plus (const Vector *, const VectorType :: _eEnum) const;
public:
    virtual _eSeq < _eChar > toString () const;
public:
    virtual _eHndl < Vector > operator - (const Vector *) const;
public:
    virtual _eHndl < Vector > operator * (const _eReal) const;
public:
    Vector (const _eReal, const _eReal, const VectorType :: _eEnum);
public:
    Vector (const _eReal, const _eReal, const _eReal, const VectorType :: _eEnum);
public:
    _eBool operator == (const Vector *) const;
};

#endif

// End of file.
