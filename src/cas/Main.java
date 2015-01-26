//***********************************************************************************************
//* File: 'Main.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/Main.pd'
//* by Perfect Developer version 6.10.01 at 14:22:42 UTC on Monday January 26th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gp=C:/Users/User/Desktop/Third Year Project/CollisionAvoidanceSystem/src/cas -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=0 -gdc=3 -gda=1 -gdA=0 -gdl=0 -gdr=0 -gdt=0 -gdi=1 -st=4 -sb=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -gk=cas -eM=0 -@=C:/Users/User/AppData/Local/Temp/etfDC3D.tmp
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
            10.0, 1000.0, 21353.0, VectorType.Position, (VectorType) null), new Vector (234.0, 643.0,
            0.0, VectorType.Velocity, (VectorType) null), 50.0, AircraftStatus.FlyingAtLevel, (
            AircraftStatus) null, _eSystem._lString ("A"), (char) 0)), ((_eAny) new Aircraft (new
            Vector (67.0, 5.0, 3434.0, VectorType.Position, (VectorType) null), new Vector (54.0,
            346.0, 0.0, VectorType.Velocity, (VectorType) null), 20.0, AircraftStatus.FlyingAtLevel,
            (AircraftStatus) null, _eSystem._lString ("B"), (char) 0)), ((_eAny) new Aircraft (new
            Vector (879.0, 664.0, 7834.0, VectorType.Position, (VectorType) null), new Vector (265.0,
            786.0, 0.0, VectorType.Velocity, (VectorType) null), 30.0, AircraftStatus.FlyingAtLevel,
            (AircraftStatus) null, _eSystem._lString ("C"), (char) 0)), ((_eAny) new Aircraft (new
            Vector (435.0, 234.0, 45534.0, VectorType.Position, (VectorType) null), new Vector (
            3452.0, 324.0, 0.0, VectorType.Velocity, (VectorType) null), 25.0, AircraftStatus.
            FlyingAtLevel, (AircraftStatus) null, _eSystem._lString ("D"), (char) 0)))._lAppend (((
            _eAny) new Aircraft (new Vector (7568.0, 6675.0, 34456.0, VectorType.Position, (
            VectorType) null), new Vector (657.0, 675.0, 0.0, VectorType.Velocity, (VectorType) null)
            , 35.0, AircraftStatus.FlyingAtLevel, (AircraftStatus) null, _eSystem._lString ("E"), (
            char) 0)), ((_eAny) new Aircraft (new Vector (453.0, 5753.0, 3468.0, VectorType.Position,
            (VectorType) null), new Vector (243.0, 165.0, 0.0, VectorType.Velocity, (VectorType)
            null), 10.0, AircraftStatus.FlyingAtLevel, (AircraftStatus) null, _eSystem._lString ("F")
            , (char) 0)), ((_eAny) new Aircraft (new Vector (987.0, 5342.0, 344.0, VectorType.
            Position, (VectorType) null), new Vector (364.0, 673.0, 0.0, VectorType.Velocity, (
            VectorType) null), 5.0, AircraftStatus.FlyingAtLevel, (AircraftStatus) null, _eSystem.
            _lString ("G"), (char) 0)));
        CASystem system = new CASystem (_vLet_initialCrafts_14_13, (Aircraft) null, 0.0, 10000.0,
            0.0, 10000.0);
        context.print (_eSystem._lString ("System booted\n"), (char) 0);
        {
            int count = 30;
            for (;;)
            {
                if ((0 == count)) break;
                _eSeq line;
                int rret;
                count -= 1;
                {
                    _eWrapper__eAny _vSchemaCallTemp_32_34 = new _eWrapper__eAny ();
                    FileError _vSchemaCallTemp_32_42 = new FileError ();
                    context.readLine (_vSchemaCallTemp_32_34, (_eSeq) null, (char) 0,
                        _vSchemaCallTemp_32_42);
                    line = ((_eSeq) _vSchemaCallTemp_32_34.value);
                    rret = _vSchemaCallTemp_32_42.value;
                }
                if (_eSystem._lString ("X")._lEqual (line))
                {
                    count = 0;
                }
                else
                {
                    context.print (system.printConflicts (), (char) 0);
                    system = ((CASystem) system._lClone ());
                    system.fly ();
                }
            }
        }
        ret.value = 0;
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
