package notepad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//type 1
//		FileReader fr = new FileReader("C:\\Users\\karthick\\Documents\\data\\element.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String str;
//		while((str=br.readLine())!=null) {   
//			
//			System.out.println(str);
//		}
		

		//type 2
		
		File file = new File("C:\\\\Users\\\\karthick\\\\Documents\\\\data\\\\element.txt");
		Scanner sc =new Scanner(file);
//		
//		while((sc.hasNextLine())) {
//			System.out.println(sc.next());
//		}
		
		//type 3
		sc.useDelimiter("\\Z");
		System.err.println(sc.next());
	}

}
