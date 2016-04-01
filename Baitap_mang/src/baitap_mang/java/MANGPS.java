package baitap_mang.java;

import java.util.Random;

public class MANGPS {
	PHANSO []m;
	public MANGPS(){
		m = new PHANSO[0];
	}
	public MANGPS(int n){
		m = new PHANSO[n];
	}
	
	void nhapMPS(){
		Random r = new Random();
		for(int i=0; i<m.length; i++)
		{
			int ts = r.nextInt(101);
			int ms = r.nextInt(101)+1;
			m[i] = new PHANSO(ts,ms);
			m[i].RutGon();
		}
	}
	
	void xuatMPS(){
		for(int i=0; i<m.length; i++)
			System.out.print(m[i].getTu()+"/"+m[i].getMau()+"\t");
		System.out.print("\n");
	}
	
	void tinhTong(){
		PHANSO s = new PHANSO();
		for(int i=0; i<m.length; i++)
		{
			s.CongPS(m[i]);
			s.RutGon();
		}
		System.out.println("Tong mang phan so: "+s.getTu()+"/"+s.getMau());
	}
	
	void tinhTich(){
		PHANSO s = new PHANSO(1,1);
		for(int i=0; i<m.length; i++)
		{
			s.NhanPS(m[i]);
			s.RutGon();
		}
		System.out.println("Tich mang phan so: "+s.getTu()+"/"+s.getMau());
	}
}
