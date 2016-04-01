package Baitap.java;
import java.math.BigInteger;
public class baitap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		/*if(NamNhuan(n)==1) System.out.println("Nam " + n + " la nam nhuan");
		else System.out.println("Nam " + n + " khong la nam nhuan");
		if(SoNT(n)==1) System.out.println("So " + n + " la 1 so nguyen to !");
		else System.out.println("So " + n + " khong la 1 so nguyen to !");
		if(SoCP(n)) System.out.println("So " + n + " la 1 so chinh phuong !");
		else System.out.println("So " + n + " khong la 1 so chinh phuong !");
		if(SoLP(n)) System.out.println("So " + n + " la 1 so lap phuong !");
		else System.out.println("So " + n + " khong la 1 so lap phuong !");
		if(SoDX(n)) System.out.println("So " + n + " la 1 so doi xung !");
		else System.out.println("So " + n + " khong la 1 so doi xung !");
		if(SoHH(n)) System.out.println("So " + n + " la 1 so hoan hao !");
		else System.out.println("So " + n + " khong la 1 so hoan hao !");
		Fib(20);*/
		tinhTong1(5);
		tinhTong2(4);
		System.out.println(n+"! bang: "+GiaiThua(n));
	}
//	Bai 1 Nam nhuan
	static int NamNhuan(int n){
		if((n%4==0 && n%100!=0) || (n%400==0)) return 1;
		return 0;
	}
//	Bai 2 So nguyen to
	static int SoNT(int n){
		if(n < 2) return 0;
		for(int i=2; i <= Math.sqrt((float)n); i++){
			if(n%i==0) return 0;
		}
		return 1;
	}
//	Bai 3 So chinh phuong
	static boolean SoCP(int n){
		return Math.sqrt(n) ==  (int)Math.sqrt(n);
	}
//	Bai 4 So lap phuong
	static boolean SoLP(int n){
		double tam = Math.pow(n,(float)1/3);
		if((int)(tam*tam*tam) == n) return true;
		return false;
	}
//	Bai 5 So doi xung
	static boolean SoDX(int n){
		int dx = 0;
		int n1 = n;
		while(n1>0){
			dx=dx*10 + n1%10;
			n1/=10;
		}
		return (dx==n);
	}
//	Bai 6 So hoan hao
	static boolean SoHH(int n){
		int s=0;
		for(int i=1; i<n ; i++)
			if(n%i==0) s+=i;
		return (s==n);
	}
//	Bai 7 Fibonacci
	static void Fib(int n){
		int s1 = 1,s2 = 1;
		while(n>0)
		{
			System.out.print(s1+" ");
			s2+=s1;
			s1=s2-s1;
			n--;
		}
	}
//	Bai 8 Tinh tong S = 1 + 2 + ... + n
	static void tinhTong1(int n){
		int s=0;
		while(n>0)
		{
			s=s+n;
			n--;
		}
		System.out.println("Tong S bang: "+s);
	}
//	Bai 9 Tinh tong S = 1/2 + 3/4 + ... + (n-1)/n
	static void tinhTong2(int n){
		float s=0;
		while(n>0){
			s = s + (float)(n-1)/n;
			n--;
		}
		System.out.println("Tong S bang: "+s);
	}
//	Bai 10 Tinh giai thua voi n > 1000
	static BigInteger GiaiThua(int n){
		BigInteger fact = BigInteger.valueOf(1);
		for(int i=1;i<=n;i++)
			fact = fact.multiply(BigInteger.valueOf(i));
		return fact;
	}
}
