package Project;

public class Deletefile {
	String file;
		public Deletefile(String file) {
		if(!Listoffiles.list.isEmpty()) {
			if(Listoffiles.list.contains(file)) {
			Listoffiles.Remove(file);
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
