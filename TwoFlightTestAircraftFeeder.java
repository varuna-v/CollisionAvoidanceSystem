package cas;
import Ertsys.*;

public class TwoFlightTestAircraftFeeder implements IAircraftFeeder
{
	public Aircraft getAircraftToInject()
	{
		return null;
	}
	
	
	public _eSeq getInitialSeqOfAircrafts() 
	{
		return new _eSeq()._lAppend(
			((_eAny) new Aircraft(new Vector(598.0,
					85.0, 20400.0, VectorType.Position,
					(VectorType) null), new Vector(57.0, -75.0, 0.0,
					VectorType.Velocity, (VectorType) null), 50.0,
					AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
					_eSystem._lString("E"), (char) 0, AircraftModel.Boeing777200, (
				            AircraftModel) null)),
			((_eAny) new Aircraft(new Vector(794.0,
					327.0, 20090.0, VectorType.Position,
					(VectorType) null), new Vector(-355.0, -630.0, 0.0,
					VectorType.Velocity, (VectorType) null), 40.0,
					AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
					_eSystem._lString("R"), (char) 0, AircraftModel.Boeing777200, (
				            AircraftModel) null))
				);
	}
}