//***********************************************************************************************
//* File: 'Main.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/Main.pd'
//* by Perfect Developer version 6.10.01 at 15:08:29 UTC on Wednesday March 11th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etfEDEA.tmp
//***********************************************************************************************

package cas;

// Packages imported
import Ertsys.*;
import cas.*;


final class _jMain
{
    public static void main (Environment context, _eSeq args, _eSeq _t0args, char _t1args,
        _eWrapper_int ret)
    {
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((0 < args._oHash ()))) throw new _xPre ("Main.pd:11,15");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        _eSeq _vLet_initialCrafts_14_13 = new _eSeq ()._lAppend (((_eAny) new Aircraft (new Vector (
            5.0, 2.0, 1000.0, VectorType.Position, (VectorType) null), new Vector ((- 3.0), 1.0, 0.0,
            VectorType.Velocity, (VectorType) null), 50.0, AircraftStatus.FlyingAtLevel, (
            AircraftStatus) null, _eSystem._lString ("A"), (char) 0, AircraftModel.Boeing777200, (
            AircraftModel) null)), ((_eAny) new Aircraft (new Vector (4.0, 3.0, 1000.0, VectorType.
            Position, (VectorType) null), new Vector ((- 1.0), 2.0, 0.0, VectorType.Velocity, (
            VectorType) null), 20.0, AircraftStatus.FlyingAtLevel, (AircraftStatus) null, _eSystem.
            _lString ("B"), (char) 0, AircraftModel.Boeing777200, (AircraftModel) null)));
        AirTrafficController system = new AirTrafficController (_vLet_initialCrafts_14_13, (Aircraft)
            null, 0.0, 10000.0, 0.0, 10000.0);
        context.print (_eSystem._lString ("System booted\n"), (char) 0);
        {
            int count = 30;
            for (;;)
            {
                if ((0 == count)) break;
                _eSeq line;
                int rret;
                count -= 1;
                context.print (_jMain.printStuff (system)._oPlusPlus (_eSystem._lString (
                    "\n----------------\n"), (_eTemplate_0) null), (char) 0);
                system = ((AirTrafficController) system._lClone ());
                system.addAircraft (new Aircraft (new Vector (0.0, 0.0, 344.0, VectorType.Position,
                    (VectorType) null), new Vector (364.0, 63.0, 0.0, VectorType.Velocity, (
                    VectorType) null), 5.0, AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
                    _eSystem._lString ("G"), (char) 0, AircraftModel.Boeing777200, (AircraftModel)
                    null));
                {
                    _eWrapper__eAny _vSchemaCallTemp_30_34 = new _eWrapper__eAny ();
                    FileError _vSchemaCallTemp_30_42 = new FileError ();
                    context.readLine (_vSchemaCallTemp_30_34, (_eSeq) null, (char) 0,
                        _vSchemaCallTemp_30_42);
                    line = ((_eSeq) _vSchemaCallTemp_30_34.value);
                    rret = _vSchemaCallTemp_30_42.value;
                }
                system = ((AirTrafficController) system._lClone ());
                system.changeCraftHeight (_eSystem._lString ("A"), (char) 0, 1350.0);
                if ((_eSystem._lString ("X")._lEqual (line) || (0 == system.numberOfAirCrafts ())))
                {
                    count = 0;
                }
                else
                {
                }
            }
        }
        ret.value = 0;
    }

    public static _eSeq printStuff (AirTrafficController system)
    {
        _eSeq _vForYield_40_18 = new _eSeq ();
        {
            int _vCaptureCount_a_40_33 = system.aircrafts._oHash ();
            int _vLoopCounter_40_23 = 0;
            for (;;)
            {
                if ((_vLoopCounter_40_23 == _vCaptureCount_a_40_33)) break;
                _vForYield_40_18 = _vForYield_40_18.append (((_eAny) _eSystem._ltoString (((Aircraft)
                    system.aircrafts._oIndex (_vLoopCounter_40_23)).boundaryRadius)));
                _vLoopCounter_40_23 = _eSystem._oSucc (_vLoopCounter_40_23);
            }
        }
        _eSeq _vOver_40_12 = new _eSeq ();
        {
            int _vLoopCounter_40_12 = 0;
            for (;;)
            {
                if ((_vForYield_40_18._oHash () == _vLoopCounter_40_12)) break;
                _vOver_40_12 = ((_eSeq) _vOver_40_12._lClone ());
                _vOver_40_12._osPlusPlus (((_eSeq) _vForYield_40_18._oIndex (_vLoopCounter_40_12)),
                    (_eTemplate_0) null);
                _vLoopCounter_40_12 = _eSystem._oSucc (_vLoopCounter_40_12);
            }
        }
        return _vOver_40_12;
    }

    public static boolean undefRel (_eAny a, _eAny b)
    {
        return true;
    }

    public static boolean undefRel (_eAny a, _eAny b, _eAny c)
    {
        return true;
    }

}


// End of file.
