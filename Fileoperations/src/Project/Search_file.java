package Project;

public class Search_file {
public Search_file(String file) {
	//int n;
	if(Listoffiles.list.stream().anyMatch(file::equalsIgnoreCase)) {
		//n=Listoffiles.list.indexOf(file);
		System.out.println("The file "+file+" Found");
		new Terminate_or_continue().terminateOrContinue();
	}
	else {
		System.out.println("The file "+file+" Not found");
		new Terminate_or_continue().terminateOrContinue();
	}
}
}
