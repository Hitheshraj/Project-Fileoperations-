package Project;

public class Addfile {
public Addfile(String file) {
	try {
	Listoffiles.add(file);
	new Terminate_or_continue().terminateOrContinue();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
