package notepad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritterTxt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw=new FileWriter("C:\\Users\\karthick\\Documents\\data\\element.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("welcome to orgfarm");
		bw.close();
	}

}
