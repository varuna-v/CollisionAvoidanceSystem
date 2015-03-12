//***********************************************************************************************
//* File: 'AircraftStatus.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/AircraftStatus.pd'
//* by Perfect Developer version 6.10.01 at 08:31:11 UTC on Thursday March 12th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf8E5F.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public final class AircraftStatus extends _eEnumBase
{
    public AircraftStatus ()
    {
    }

    public AircraftStatus (int _lArg1)
    {
        super (_lArg1);
    }

    public static _eSeq _oRange (int _lArg1, int _lArg2)
    {
        _eSeq _lResult = new _eSeq ();
        while (_lArg1 <= _lArg2) _lResult = _lResult._lAppend (new AircraftStatus (_lArg1 ++));
        return _lResult;
    }

    public final static int OnGround = 0, Ascending = 1, Descending = 2, FlyingAtLevel = 3;
    private final static String [] _lnames =
    {
        "OnGround", "Ascending", "Descending", "FlyingAtLevel"
    };

    public static _eSeq _ltoString (int _larg)
    {
        return _eSystem._lString (_lnames [_larg]);
    }

    public _eSeq _rtoString ()
    {
        return _eSystem._lString (_lnames [value]);
    }

}


// End of file.
