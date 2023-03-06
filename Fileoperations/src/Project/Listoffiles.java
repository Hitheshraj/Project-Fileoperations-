package Project;

import java.util.LinkedList;
import java.util.List;

public class Listoffiles {
	static List<String> list = new LinkedList<>();

	@Override
	public String toString() {
		return "Listoffiles =" + list + "";
	}

	public static void add(String s) {
		try {
			list.add(s);
			System.out.println("File " + s + " added Sucessfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void Remove(String s) {
		list.remove(list.indexOf(s));
	}
}
