//***********************************************************************************************
//* File: 'CASystem.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/CASystem.pd'
//* by Perfect Developer version 6.10.01 at 12:25:36 UTC on Monday March 23rd 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf3AE.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class CASystem extends _eAny
{
    protected final static double defaultTimeToFlyFor = 0.1;
    public AirTrafficController atc;
    public _eSeq getAircrafts ()
    {
        return atc.aircrafts;
    }

    public _eSeq getAircraftPairsOrderedByTimeToConflict ()
    {
        return atc.getAircraftPairsOrderedByTimeToConflict ();
    }

    public void changeHeight (_eSeq identification, char _t0identification, double targetHeight)
    {
        AirTrafficController _vUnshare_24_14 = ((AirTrafficController) atc._lClone ());
        atc = _vUnshare_24_14;
        _vUnshare_24_14.changeCraftHeight (identification, (char) 0, targetHeight);
    }

    public void fly ()
    {
        AirTrafficController _vUnshare_27_14 = ((AirTrafficController) atc._lClone ());
        atc = _vUnshare_27_14;
        _vUnshare_27_14.fly (CASystem.defaultTimeToFlyFor);
    }

    public void addAircraft (Aircraft aircraft)
    {
        AirTrafficController _vUnshare_30_14 = ((AirTrafficController) atc._lClone ());
        atc = _vUnshare_30_14;
        _vUnshare_30_14.addAircraft (aircraft);
    }

    public CASystem (AirTrafficController _vatc)
    {
        super ();
        atc = _vatc;
    }

    public boolean _lEqual (CASystem _vArg_9_11)
    {
        if (this == _vArg_9_11)
        {
            return true;
        }
        return _vArg_9_11.atc._lEqual (atc);
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == CASystem.class && _lEqual ((
            CASystem) _lArg));
    }

}


// End of file.
