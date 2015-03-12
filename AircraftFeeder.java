package cas;
import java.util.*;
import Ertsys.*;

public class AircraftFeeder implements IAircraftFeeder
{
	private int[] _Xboundary;
	private int[] _Yboundary;
	
	private Random random = new Random();
	
	private static final int minZ = 20000;//9144; //meters
	private static final int maxZ = 20500;//13716; //meters
	
	public AircraftFeeder(int atcMaxX, int atcMaxY)
	{
		_Xboundary = new int[] {0, atcMaxX};
		_Yboundary = new int[] {0, atcMaxY};
	}
	
	private double getRandom(int rangeMax) 
	{
		return getRandom(0, rangeMax);
	}

	private double getRandom(int rangeMin, int rangeMax) 
	{
		return rangeMin + (double) (rangeMax - rangeMin) * random.nextDouble();
	}
	
	private int getRandomInt(int rangeMin, int rangeMax)
	{
		return rangeMin + random.nextInt(rangeMax);
	}
	
	private double getRandomHeight()
	{
		return getRandom(minZ, maxZ);
	}
	
	private Vector getAPositionForInitialAircraft()
	{
		return new Vector(getRandom(_Xboundary[1]),
				getRandom(_Yboundary[1]), getRandomHeight(), VectorType.Position,
				(VectorType) null);
	}
	
	private Vector getAPositionForInjectedAircraft()
	{
		int randDecider = getRandomInt(1, 4);
		switch (randDecider)
		{
			case(1) : return new Vector(0,
					getRandom(_Yboundary[1]), getRandomHeight(), VectorType.Position,
					(VectorType) null);
			case(2) : return new Vector(_Xboundary[1],
					getRandom(_Yboundary[1]), getRandomHeight(), VectorType.Position,
					(VectorType) null);
			case(3) : return new Vector(getRandom(_Xboundary[1]),
					0, getRandomHeight(), VectorType.Position,
					(VectorType) null);
			default : return new Vector(getRandom(_Xboundary[1]),
					_Yboundary[1], getRandomHeight(), VectorType.Position,
					(VectorType) null);
		}
	}
	
	private static final int _velocityLower = 605; //X 10000 kilometers ;
	private static final int _velocityUpper = 648; //X 10000 kilometers ;
	private Vector getRandomVelocity()
	{
		return new Vector(getRandom(_velocityLower, _velocityUpper) * getRandom(-1, 1)
						 ,getRandom(_velocityLower, _velocityUpper) * getRandom(-1, 1),
						  VectorType.Velocity, (VectorType) null);
	}
	
	private static int _identifierCounter = 9;
	private String getIdentifier()
	{
		//!!Is there a limit before repetition?
		String identifier = "";
		int n = _identifierCounter / 26;
		identifier += String.valueOf((char)(65 + n));
		int k = _identifierCounter % 26;
		identifier += String.valueOf((char)(65 + k));
		_identifierCounter++;
		return identifier;
	}
	
	private int getRandomAircraftModel()
	{
		return getRandomInt(0, 13);
	}
	
	public Aircraft getAircraftToInject()
	{
		return new Aircraft(getAPositionForInjectedAircraft(),
							getRandomVelocity(), 
							getRandom(4, 50),
							AircraftStatus.FlyingAtLevel, 
							(AircraftStatus) null,
							_eSystem._lString(getIdentifier()),
							(char) 0,
							getRandomAircraftModel(), 
							(AircraftModel) null);
	}
	
	
	public _eSeq getInitialSeqOfAircrafts() {
		int maxX = _Xboundary[1];
		int maxY = _Yboundary[1];
		return new _eSeq()._lAppend(
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 20400.0, VectorType.Position,
						(VectorType) null), new Vector(234.0, -93.0, 0.0,
						VectorType.Velocity, (VectorType) null), 50.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("A"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 20400.0, VectorType.Position,
						(VectorType) null), new Vector(54.0, 146.0, 0.0,
						VectorType.Velocity, (VectorType) null), 20.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("B"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 20400.0, VectorType.Position,
						(VectorType) null), new Vector(-265.0, 86.0, 0.0,
						VectorType.Velocity, (VectorType) null), 30.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("C"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 20400.0, VectorType.Position,
						(VectorType) null), new Vector(342.0, 134.0, 0.0,
						VectorType.Velocity, (VectorType) null), 25.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("D"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 20400.0, VectorType.Position,
						(VectorType) null), new Vector(57.0, -75.0, 0.0,
						VectorType.Velocity, (VectorType) null), 35.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("E"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 20400.0, VectorType.Position,
						(VectorType) null), new Vector(23.0, 105.0, 0.0,
						VectorType.Velocity, (VectorType) null), 10.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("F"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 20400.0, VectorType.Position,
						(VectorType) null), new Vector(-364.0, 63.0, 0.0,
						VectorType.Velocity, (VectorType) null), 5.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("G"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 20400.0, VectorType.Position,
						(VectorType) null), new Vector(-12.0, 230.0, 0.0,
						VectorType.Velocity, (VectorType) null), 5.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("H"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)));
	}

}