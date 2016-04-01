package baitap_mang.java;

import java.util.Random;

public class BAITAP {
	
	void nhap(int []m){
		Random rd = new Random();
		for(int i=0; i< m.length; i++)
			m[i] = rd.nextInt(100)-50;
	}
	
	void xuat(int []m){
		for(int i=0; i< m.length; i++)
			System.out.print(m[i]+"\t");
		System.out.println("\n");
	}
	
	void sapXep(int[]m){
		for(int i=0; i< m.length - 1 ; i++)
			for(int j=i+1; j<m.length;j++)
				if(m[i]>m[j]) doiViTri(m,i,j);
	}
	
	void sapXepChanLe(int []m){
		for(int i=0; i< m.length - 1 ; i++)
			for(int j=i+1; j<m.length;j++)
				if((m[i]%2==0 && m[j]%2==0) && (m[i]>m[j])) doiViTri(m,i,j);
				else if((m[i]%2!=0 && m[j]%2!=0) && (m[i]>m[j])) doiViTri(m, i, j);
	}
	
	void sapXepNgTo(int []m){
		for(int i=0; i< m.length - 1 ; i++)
			for(int j=i+1; j<m.length;j++)
				if((kiemTraNgTo(m[i])==1 && kiemTraNgTo(m[j])==1) && (m[i]>m[j])) doiViTri(m,i,j);
	}
	
	void sapXepCP(int []m){
		for(int i=0; i< m.length - 1 ; i++)
			for(int j=i+1; j<m.length;j++)
				if((kiemTraCP(m[i]) && kiemTraCP(m[j])) && (m[i]>m[j])) doiViTri(m,i,j);
	}
	
	void tinhTong(int []m){
		int s=0;
		for(int i=0; i< m.length ; i++)
			s+=m[i];
		System.out.println("Tong day so nguyen n: "+s);
	}
	
	void tinhTich(int []m){
		int s=1;
		for(int i=0; i< m.length ; i++)
			s=s*m[i];
		System.out.println("Tich day so nguyen n: "+s);
	}
	
	int kiemTraNgTo(int n){
		if(n<2) return 0;
		for(int i=2; i<= Math.sqrt((float)n);i++)
				if(n%i==0) return 0;
		return 1;
	}
	
	boolean kiemTraCP(int n){
		return Math.sqrt(n) == (int)(Math.sqrt(n));
	}
	
	void doiViTri(int []m,int i,int j){
		int tmp = m[i];
		m[i] = m[j];
		m[j] = tmp;
	}
}
