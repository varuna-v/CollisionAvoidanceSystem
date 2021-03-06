//***********************************************************************************************
//* File: 'AircraftModel.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/AircraftModel.pd'
//* by Perfect Developer version 6.10.01 at 12:25:36 UTC on Monday March 23rd 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf3AE.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public final class AircraftModel extends _eEnumBase
{
    public AircraftModel ()
    {
    }

    public AircraftModel (int _lArg1)
    {
        super (_lArg1);
    }

    public static _eSeq _oRange (int _lArg1, int _lArg2)
    {
        _eSeq _lResult = new _eSeq ();
        while (_lArg1 <= _lArg2) _lResult = _lResult._lAppend (new AircraftModel (_lArg1 ++));
        return _lResult;
    }

    public final static int Boeing777200 = 0, Boeing777300 = 1, Boeing737300 = 2, Boeing737400 = 3,
        Boeing737500 = 4, Boeing717 = 5, Boeing737600 = 6, Boeing737900 = 7, BoeingMD80 = 8,
        Boeing747400 = 9, BoeingMD90 = 10, Boeing757200 = 11, Boeing767400 = 12, BoeingMD11 = 13;
    private final static String [] _lnames =
    {
        "Boeing777200", "Boeing777300", "Boeing737300", "Boeing737400", "Boeing737500", "Boeing717",
            "Boeing737600", "Boeing737900", "BoeingMD80", "Boeing747400", "BoeingMD90",
            "Boeing757200", "Boeing767400", "BoeingMD11"
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
