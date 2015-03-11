package cas;
import Ertsys.*;

public interface IAircraftFeeder
{
	public Aircraft getAircraftToInject();
	
	public _eSeq getInitialSeqOfAircrafts();
}

