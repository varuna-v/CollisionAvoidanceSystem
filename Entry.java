// *******************************************************************************
// * File:    Entry.java                                                         *
// * Target:  Consumer Perfect-Developer-generated Java projects that need a     *
// *          program entry point.                                               *
// * Author:  Escher Technologies Ltd.                                           *
// * Desc:    This file contains the Java stub that calls the Perfect Developer  *
// *          generated program entry point, handling any exceptions etc. that   *
// *          may result.                                                        *
// * Notes:   Change the package name (see immediately below this header) to     *
// *          reflect the target package name specified in the Perfect Developer *
// *          project (i.e. the user-chosen target package name).                *
// *******************************************************************************

// Change this package name to match the one you have specified
// in the Code Generation options of the Perfect Developer project
package cas;

import java.io.IOException;
import java.io.File;
import Ertsys.*;

public final class Entry
{
	public static void main(String jargs[])
	{
		//-----------------------------------------------------------------------------------
		// Parse arguments - note that the path to the 'running' class file is not available,
		// so the best we can do is provide the directory where the JVM was started
		//-----------------------------------------------------------------------------------
		String pathToClass = System.getProperty("user.dir");
		if (pathToClass.length() != 0 && pathToClass.charAt(pathToClass.length() - 1) != File.separatorChar)
		{
			pathToClass = pathToClass + File.separatorChar;
		}

		Environment context = new Environment(pathToClass);
		_eSeq pargs = new _eSeq(_eSystem._lString(pathToClass));
		for (int i=0; i<jargs.length; i++)
		{
			pargs = pargs.append(_eSystem._lString(jargs[i]));
		}

		// Create an object to hold the return code
		_eWrapper_int wrappedRetval = new _eWrapper_int(0);

		// Execute the Perfect-generated user main ...
		_jMain.main(context, pargs, (_eSeq) null, (char) 0, wrappedRetval);

		// Terminate JVM with specified error level
		System.exit(wrappedRetval.value);

		//***************
		//* End of MAIN *
		//***************
	}
}

// End
