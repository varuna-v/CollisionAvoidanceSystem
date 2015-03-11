package cas;
import java.awt.Dimension;
import Ertsys.*;

public class AircraftFeederFactory
{
	
	public static IAircraftFeeder getAircraftFeeder(String identificationCode, Dimension screenSize)
	{
		switch (identificationCode)
		{
			case ("TestEqualAltitudes") : return new TestAircraftFeederEqualAltitudes();
			case ("TestVaryingAltitudes") : return new TestAircraftFeederVaryingAltitudes();
			case ("TwoFlightTest") : return new TwoFlightTestAircraftFeeder();
			default : return new AircraftFeeder(screenSize.width, screenSize.height);
		}
	}
	
}