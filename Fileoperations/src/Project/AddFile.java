package Project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AddFile {
public AddFile(String file) {
	try {
	ListOfFiles.add(file);
	new TerminateOrContinue().terminateOrContinue();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
