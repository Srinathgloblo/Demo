package com.sample.pro;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filepro {
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\Administrator\\Desktop\\Document.docx");
		FileWriter fw = new FileWriter(f);
		fw.write("Welcome to java");
		fw.flush();
		fw.close();
		FileReader fr = new FileReader(f);
		int i;    
        while((i = fr.read())!=-1) {
        	System.out.print((char)i);	
        }
        fr.close();    
	}
}
