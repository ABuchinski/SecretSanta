import java.io.*;
import java.util.*;
public class Santa {
	public static void main(String[] args) 
		throws IOException{

		PrintWriter out = new PrintWriter(new File("Santas.txt"));
		Scanner input = new Scanner(new File("Names.txt"));
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> santas = new ArrayList<String>();	
		while (input.hasNext()) {
			String content = input.nextLine();
			names.add(content);
			santas.add(content);
		}
		while (names.size()>2) {
			String name = names.remove(0);
			int i;
			do {
				i = (int)(Math.random()*santas.size());
			}while(santas.get(i)==name);
			String santa = santas.remove(i);
			out.println(name+"'s Santa is "+santa);
		}
		// O(1)
		Collections.sort(names);
		Collections.sort(santas);
		// Special case, we are left with two unique people in both lists
		if (names.get(0)==santas.get(0) && names.get(1)==santas.get(1)) {
			out.println(names.get(0)+"'s Santa is "+santas.get(1));
			out.println(names.get(1)+"'s Santa is "+santas.get(0));
		}
		else {
			out.println(names.get(0)+"'s Santa is "+santas.get(0));
			out.println(names.get(1)+"'s Santa is "+santas.get(1));
		}
		// **Names must be unique to work**
		input.close();
		out.close();
	}
}