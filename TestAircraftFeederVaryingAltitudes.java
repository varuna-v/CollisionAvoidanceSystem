package cas;
import Ertsys.*;

public class TestAircraftFeederVaryingAltitudes implements IAircraftFeeder
{
	public Aircraft getAircraftToInject()
	{
		return null;
	}
	
	
	public _eSeq getInitialSeqOfAircrafts() 
	{
		return new _eSeq()._lAppend(
			((_eAny) new Aircraft(new Vector(150.0,
					150.0, 12800.0, VectorType.Position,
					(VectorType) null), new Vector(60.0, 0.0, 0.0,
					VectorType.Velocity, (VectorType) null), 50.0,
					_eSystem._lString("A"), (char) 0, AircraftModel.Boeing777200, (
				            AircraftModel) null)),
			((_eAny) new Aircraft(new Vector(350.0,
					150.0, 12100.0, VectorType.Position,
					(VectorType) null), new Vector(-20.0, 0.0, 0.0,
					VectorType.Velocity, (VectorType) null), 40.0,
					_eSystem._lString("B"), (char) 0, AircraftModel.Boeing777200, (
				            AircraftModel) null)),
			((_eAny) new Aircraft(new Vector(550.0,
					180.0, 12800.0, VectorType.Position,
					(VectorType) null), new Vector(60.0, 0.0, 0.0,
					VectorType.Velocity, (VectorType) null), 50.0,
					_eSystem._lString("C"), (char) 0, AircraftModel.Boeing777200, (
				            AircraftModel) null)),
		    ((_eAny) new Aircraft(new Vector(700.0,
					150.0, 12100.0, VectorType.Position,
					(VectorType) null), new Vector(-20.0, 0.0, 0.0,
					VectorType.Velocity, (VectorType) null), 20.0,
					_eSystem._lString("D"), (char) 0, AircraftModel.Boeing777200, (
					AircraftModel) null)),
			((_eAny) new Aircraft(new Vector(460.0,
					460.0, 12800.0, VectorType.Position,
					(VectorType) null), new Vector(60.0, 60.0, 0.0,
					VectorType.Velocity, (VectorType) null), 50.0,
					_eSystem._lString("E"), (char) 0, AircraftModel.Boeing777200, (
			           AircraftModel) null)),
			((_eAny) new Aircraft(new Vector(512.0,
					512.0, 12100.0, VectorType.Position,
					(VectorType) null), new Vector(-60.0, -60.0, 0.0,
					VectorType.Velocity, (VectorType) null), 40.0,
					_eSystem._lString("F"), (char) 0, AircraftModel.Boeing777200, (
					AircraftModel) null)),
			((_eAny) new Aircraft(new Vector(150.0,
					500.0, 13000.0, VectorType.Position,
					(VectorType) null), new Vector(60.0, -60.0, 0.0,
					VectorType.Velocity, (VectorType) null), 50.0,
					_eSystem._lString("G"), (char) 0, AircraftModel.Boeing777200, (
			           AircraftModel) null)),
			((_eAny) new Aircraft(new Vector(350.0,
					300.0, 12100.0, VectorType.Position,
					(VectorType) null), new Vector(-60.0, 60.0, 0.0,
					VectorType.Velocity, (VectorType) null), 40.0,
					_eSystem._lString("H"), (char) 0, AircraftModel.Boeing777200, (
					AircraftModel) null))
				);
	}
}