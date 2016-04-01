package Baitap2.java;

public class HONSO {
	private int ng;
	PHANSO ps = new PHANSO();
	public HONSO(){
		setNg(0);
		ps.setTu(0);
		ps.setMau(1);
	}
	public HONSO(int ng,int tu, int mau)
	{
		this.ng = ng;
		this.ps.setTu(tu);
		this.ps.setMau(mau);
	}
	public int getNg() {
		return ng;
	}
	public void setNg(int ng) {
		this.ng = ng;
	}
	public PHANSO HONsPS(){
		PHANSO temp = new PHANSO();
		temp.setTu((ng*ps.getMau())+ps.getTu());
		temp.setMau(ps.getMau());
		temp.RutGon();
		return temp;
	}
	public PHANSO Cong(HONSO hs){
		PHANSO tam1,tam2;
		tam1 = this.HONsPS();
		tam2 = hs.HONsPS();
		PHANSO kq = tam1.Cong(tam2);
		kq.RutGon();
		return kq;
	}
	public PHANSO Tru(HONSO hs){
		PHANSO tam1,tam2;
		tam1 = this.HONsPS();
		tam2 = hs.HONsPS();
		PHANSO kq = tam1.Tru(tam2);
		kq.RutGon();
		return kq;
	}
	public PHANSO Nhan(HONSO hs){
		PHANSO tam1,tam2;
		tam1 = this.HONsPS();
		tam2 = hs.HONsPS();
		PHANSO kq = tam1.Nhan(tam2);
		kq.RutGon();
		return kq;
	}
	public PHANSO Chia(HONSO hs){
		PHANSO tam1,tam2;
		tam1 = this.HONsPS();
		tam2 = hs.HONsPS();
		PHANSO kq = tam1.Chia(tam2);
		kq.RutGon();
		return kq;
	}
}
