package Project;

public class DeleteFile {
	String file;
		public DeleteFile(String file) {
		if(!ListOfFiles.list.isEmpty()) {
			if(ListOfFiles.list.contains(file)) {
			ListOfFiles.Remove(file);
			System.out.println("The File "+file+" Removed");
			}
			else {
				System.out.println("The File "+"|"+file+"|"+" cannot be found in the list");
			}
		}
		else {
			System.out.println("The File "+"|"+file+"|"+" cannot be found in the list");
		}
	}
}
