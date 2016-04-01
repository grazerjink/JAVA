package XuLiFile;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOUtils {
	
	static FileReader file;
	static BufferedReader bf;
	
	public static String readFileUTF(String path){
		
		String str = "";
		int len;
		char[] c = new char[256];
		try {
			//Mo Luong
			file = new FileReader(path);
			bf = new BufferedReader(file);
			
			//Doc File
			while((len = bf.read(c)) != -1)
			{
				str += new String(c,0,len);
			}
			//Dong Luong
			bf.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Khong tim thay file !!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	public static void writeFileUTF(String path, String str) {
		FileWriter out;
		BufferedWriter btf;
		try {
			out = new FileWriter(path);
			btf = new BufferedWriter(out);
			
			
			
			out.close();
			btf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
