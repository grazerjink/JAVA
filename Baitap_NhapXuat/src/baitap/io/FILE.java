package baitap.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FILE {

	private String s = "";
	private BufferedReader bfi;
	private BufferedWriter bfo;
	private FileReader in;
	private FileWriter out;
	
	public void readFileByBuffer(String path) {
		try {
			
			//Mo luong
			in = new FileReader(path);
			bfi = new BufferedReader(in);
			
			//Doc File
			char[] c = new char[10];
			int len = -1;
			while((len = bfi.read(c)) != -1)
			{
				s+= new String(c,0,len);
			}
			
			//Dong luong
			in.close();
			bfi.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Khong tim thay tap tin !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getInfo()
	{
		Scanner sc = new Scanner(s);
		while(sc.hasNextLine())
		{	
			String ss = sc.nextLine();
			StringTokenizer tk = new StringTokenizer(ss, ",");
			System.out.println("Ho va ten: " + tk.nextToken().trim()
					+ "\r\n" + "Ngay sinh: " + tk.nextToken().trim()
					+ "\r\n" + "Que quan: " + tk.nextToken().trim()
					+ "\r\n" + "SDT: " + tk.nextToken().trim()
					+"\r\n");
		}
	}
	
	public void writeFileByBuffer(String path, String content) {
		try {
			out = new FileWriter(path);
			bfo = new BufferedWriter(out);
			
			//Ghi File
			bfo.write(content);
			
			//dong luong
			out.close();
			bfo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getMenu(){
		Scanner in = new Scanner(System.in);
			System.out.println("------ Danh sach chuc nang -------");
			System.out.println("1. Xem danh sach thanh vien");
			System.out.println("2. Chinh sua danh sach");
			System.out.println("3. Thoat chuong trinh");
			System.out.println("Cho biet yeu cau cua ban (nhap so): ");
			int choose = in.nextInt();
		switch (choose) 
		{
			case 1:
				System.out.println("Danh sach thanh vien" + "\n");
				readFileByBuffer("C:/Users/graze/Desktop/thongtin.txt");
				System.out.println("-------------  MENU  -------------");
				System.out.println("1. Chinh sua danh sach");
				System.out.println("2. Quay ve danh sach chuc nang");
				System.out.println("Cho biet yeu cau cua ban (nhap so): " + "\r\n");		
				int choose1 = in.nextInt();
				switch (choose1) 
				{
					case 1:
						System.out.println("Chuc nang chinh sua dang cap nhap");
						System.out.println("Ban co muon quay ve? Yes or No ?" + "\r\n");
						String choose2 = in.next();
						switch (choose2) 
						{
							case "YES":
								getMenu();
								break;
						}
						getMenu();
						break;
					case 2:
					getMenu();
					break;
			default:
				break;
				}
			break;
		case 2: 
			System.out.println("Chuc nang chinh sua dang cap nhap");
			System.out.println("Ban co muon quay ve -  Yes !???" + "\r\n");
			String choose2 = in.next();
			switch (choose2) {
				case "Yes":
					getMenu();
					break;		
			}
			break;
		case 3:
			System.out.println("Da thoat chuong trinh !!!");
			System.exit(0);
			break;
		default:
			getMenu();
			break;
		}
	}
}
