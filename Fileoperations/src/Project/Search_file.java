package Project;

public class Search_file {
public Search_file(String file) {
	//int n;
	if(ListOfFiles.list.stream().anyMatch(file::equalsIgnoreCase)) {
		//n=Listoffiles.list.indexOf(file);
		System.out.println("The file "+file+" Found");
		new TerminateOrContinue().terminateOrContinue();
	}
	else {
		System.out.println("The file "+file+" Not found");
		new TerminateOrContinue().terminateOrContinue();
	}
}
}
