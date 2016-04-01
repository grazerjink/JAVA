package bt1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDBengine {
	
	public SinhVien docFile(String path){
		SinhVien sv = null;
		try {
			FileInputStream in = new FileInputStream(path);
			BufferedInputStream bfi = new BufferedInputStream(in);
			ObjectInputStream oin = new ObjectInputStream(bfi);
			
			sv = (SinhVien)oin.readObject();
			sv.xuat();
			oin.close();
			bfi.close();
			in.close();			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sv;
	}
	
	
	public void ghiFile(String path, SinhVien sv){
		
		try {
			FileOutputStream out = new FileOutputStream(path);
			BufferedOutputStream bfo = new BufferedOutputStream(out);
			ObjectOutputStream oout = new ObjectOutputStream(bfo);
			
			//ghi file
			
			oout.writeObject(sv);
			
			
			//dong luong
			oout.close();
			bfo.close();
			out.close();
			
			System.out.println("Ghi file đã thành công !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
