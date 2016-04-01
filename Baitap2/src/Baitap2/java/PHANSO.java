package Baitap2.java;

public class PHANSO {
	private int tu;
	private int mau;
	public PHANSO(){
		setTu(0);
		setMau(1);
	}
	public PHANSO(int tu,int mau){
		this.tu=tu;
		this.mau=mau;
		try{
			if(mau == 0) throw new Exception();
		} catch(Exception e){
			System.out.println("Tu so da duoc gan - nhung mau so khong duoc bang 0");
			System.out.println("Do do, mau so da duoc gan mac dinh bang 1");
			this.setTu(tu);
			this.setMau(1);
		} finally {
			System.out.println("Ban da khoi tao mot phan so !");
		}
	}
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
		this.mau = mau;
		try{
			if(mau == 0) throw new Exception();
		} catch(Exception e){
			System.out.println("Mau so khong duoc bang 0");
			System.out.println("Do do, mau so da duoc gan mac dinh bang 1");
			this.mau = 1;
		}
	}
	int usc(int a,int b){
		a= Math.abs(a);
		b= Math.abs(b);
		if(a==0 || b==0) return 1;
		while(a!=b)
		{
			if(a>b) a=a-b;
			else b=b-a;
		}
		return a;
	}
	public void RutGon(){
		int t= usc(tu,mau);
		tu/=t;
		mau/=t;
	}
	public PHANSO Cong(PHANSO ps){
		PHANSO kq = new PHANSO();
		kq.tu = this.tu*ps.mau + this.mau*ps.tu;
		kq.mau = this.mau * ps.mau;
		kq.RutGon();
		return kq;
	}
	public PHANSO Tru(PHANSO ps){
		PHANSO kq = new PHANSO();
		kq.tu = this.tu*ps.mau - this.mau*ps.tu;
		kq.mau = this.mau * ps.mau;
		kq.RutGon();
		return kq;
	}
	public PHANSO Nhan(PHANSO ps){
		PHANSO kq = new PHANSO();
		kq.tu = this.tu * ps.tu;
		kq.mau = this.mau * ps.mau;
		return kq;
	}
	public PHANSO Chia(PHANSO ps){
		PHANSO kq = new PHANSO();
		kq.tu = this.tu * ps.mau;
		kq.mau = this.mau * ps.tu;
		return kq;
	}
	public void PSsHON(){
		HONSO nguyen = new HONSO();
		if(tu < mau) System.out.println("La 1 phan so chuan tac, khong chuyen duoc");
		else
		{
			 nguyen.setNg(tu/mau);
			 nguyen.ps.setTu(tu%mau);
			 nguyen.ps.setMau(mau);
			 System.out.println("Dang hon so la: "+nguyen.getNg()+"/"+nguyen.ps.getTu()+"/"+nguyen.ps.getMau());
		}
	}
}
