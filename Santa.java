import java.io.*;
import java.util.ArrayList;
public class Santa {
	public static void main(String[] args) 
		throws IOException{
		FileReader fr = null;
		ArrayList<String> names = new ArrayList<String>();
		try
		{
			fr = new FileReader("text");
		}
		catch(FileNotFoundException fe){
			System.out.println("File not found");
		}
		
		
		
		fr.close();
		
		
	}
}
 