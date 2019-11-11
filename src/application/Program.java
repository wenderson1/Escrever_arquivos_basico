package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"good morning", "good afternoon","good night"};
		
		String path = "C:\\Users\\Wenderson\\eclipse-workspace\\Escrever_Arquvios\\text.txt";
		
		//o paramentro true serve para reescrever o aruivo, sem o true ele vai apenas criars
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
	catch(IOException e) {
		e.printStackTrace();
	}
	}

}
