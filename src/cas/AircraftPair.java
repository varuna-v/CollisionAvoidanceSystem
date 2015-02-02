//***********************************************************************************************
//* File: 'AircraftPair.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/AircraftPair.pd'
//* by Perfect Developer version 6.10.01 at 12:40:02 UTC on Monday February 2nd 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etf4A33.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


public class AircraftPair extends _eAny
{
    final void _lc_AircraftPair (String _lArg)
    {
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!craft1._lEqual (craft2)))) throw new _xClassInvariantItem (
                    "AircraftPair.pd:13,22", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
    }

    protected void _lClassInvariantCheck (String _lArg)
    {
        _lc_AircraftPair (_lArg);
    }

    public Aircraft craft1;
    public Aircraft craft2;
    public int getConflictStatus ()
    {
        return craft1.getConflictStatus (craft2);
    }

    public _eSeq _rtoString ()
    {
        return _eSystem._lString ("Craft 1 <br>")._oPlusPlus (craft1._rtoString (), (_eTemplate_0)
            null)._oPlusPlus (_eSystem._lString ("<br> Craft 2 <br>"), (_eTemplate_0) null).
            _oPlusPlus (craft2._rtoString (), (_eTemplate_0) null);
    }

    public AircraftPair (Aircraft _vcraft1, Aircraft _vcraft2)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!_vcraft1._lEqual (_vcraft2)))) throw new _xPre ("AircraftPair.pd:32,20");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        craft1 = _vcraft1;
        craft2 = _vcraft2;
        _lc_AircraftPair ("AircraftPair.pd:31,5");
    }

    public boolean _lEqual (AircraftPair _vArg_10_9)
    {
        if (this == _vArg_10_9)
        {
            return true;
        }
        return (_vArg_10_9.craft1._lEqual (craft1) && _vArg_10_9.craft2._lEqual (craft2));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == AircraftPair.class && _lEqual
            ((AircraftPair) _lArg));
    }

}


// End of file.
