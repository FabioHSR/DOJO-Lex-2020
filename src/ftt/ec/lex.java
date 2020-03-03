package ftt.ec;

import java.io.BufferedReader;
// import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class lex {

	
	
	public static void main(String[] args) {
		String teste = "/*oi*/";
		
		System.out.println("oi" + teste.replaceAll("^[/*]*[*/]", ""));
		/*String file ="//home/fito/eclipse-workspace/DOJO-Lex-2020/src/ftt/ec//jquery-3.4.1.js";
		try {
			
		BufferedReader reader;
		reader = new BufferedReader(new FileReader(file));
		String line = ""
		FileWriter fw = new FileWriter("//home//fito//silas.txt");
		boolean x = false;
		String completa;
		while((line = reader.readLine()) != null) { 
			line = line.trim();
			System.out.println(line);
		
			
			line.replaceAll("\\s+", "");
			completa+=line;	

			
		}
		String regex = "^\/\*\\/$";
		line.matches(regex) ;
		reader.close();		
		fw.close();

		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("LEX Dojo...");*/
		
	}

}
