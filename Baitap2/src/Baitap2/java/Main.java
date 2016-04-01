package Baitap2.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PHANSO a = new PHANSO(3,6);
		PHANSO b = new PHANSO(4,5);
		PHANSO kq;
		System.out.println("Phan so a la: "+a.getTu() + "/" + a.getMau());
		System.out.println("Phan so b la: "+b.getTu() + "/" + b.getMau());
		kq = a.Cong(b);
		System.out.println("Ket qua cong 2 ps la: "+kq.getTu()+ "/" +kq.getMau());
		a.PSsHON();*/
		HONSO a1 = new HONSO(1,1,2);
		HONSO a2 = new HONSO(1,1,5);
		System.out.println(a1.getNg()+"/"+a1.ps.getTu()+"/"+ a1.ps.getMau());
		System.out.println(a2.getNg()+"/"+a2.ps.getTu()+"/"+ a2.ps.getMau());
		PHANSO kq2 = a1.Cong(a2);
		System.out.println("Ket qua cong 2 hon so la: " + kq2.getTu()+"/"+kq2.getMau());
		kq2.PSsHON();
	}
}