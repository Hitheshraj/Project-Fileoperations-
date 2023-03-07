package Project;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DisplayFile {
	public void sort() {
		List<String> slist=new LinkedList<>();
		slist=ListOfFiles.list;
		if(slist.isEmpty()) {
			System.out.println("[ ] The List is Empty...!");
			return;
		}
		Collections.sort(slist);
		for(String s:slist)System.out.println(s);
	}

}
