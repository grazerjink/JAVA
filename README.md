## JAVA - Mạc Khải Quân

#### **[Bài tập 1](https://github.com/grazerjink/java/tree/master/Baitap1/src/Baitap/java) — Lập trình cơ bản với yêu cầu :**

1. Kiểm tra năm nhuận

2. Kiểm tra số nguyên tố

3. Kiểm tra số chính phương

4. Kiểm tra số hoàn hảo

5. Kiểm tra số lập phương

6. Kiểm tra số đối xứng

7. ...

~~~
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
~~~

#### **[Bài tập 2](https://github.com/grazerjink/java/tree/master/Baitap2/src/Baitap2/java) — Lập trình 2 lớp hỗn số và phân số**

###### Class PHANSO bao gồm những phương thức : 

- Cộng trừ nhân chia 2 phân số.
- Chuyển đổi phân số thành hỗn số.
- Hàm rút gọn.
- Các hàm khởi tạo, get/set.

> PHANSO.java

~~~
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
~~~

###### Class HONSO bao gồm những phương thức : 

- Cộng trừ nhân chia 2 hỗn số.
- Chuyển đổi hỗn số thành phân số.
- Hàm rút gọn.
- Các hàm khởi tạo, get/set.

> HONSO.java

~~~
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
~~~

> Class Main chạy chương trình

~~~
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
~~~

#### **[Baitap_NhapXuat](https://github.com/grazerjink/java/tree/master/Baitap_NhapXuat/src/baitap/io) — Ghi / Xuất File**

**Nội dung file là thông tin của sinh viên, Thực hiện đọc file đó lên hiện lên console và thêm nội dung ghi ra 1 file chứa nội dung mới ... ( Có kèm giao diện console )**

> Class FILE

~~~
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
~~~

> Class Main chạy chương trình

  ~~~
  public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FILE f = new FILE();
		f.readFileByBuffer("C:/Users/graze/Desktop/thongtin.txt");
		f.getInfo();
	}
}
~~~

#### **[Baitap_mang](https://github.com/grazerjink/java/tree/master/Baitap_mang) — Làm việc với mảng**

** Tạo mảng cho đối tượng **

- PHANSO

~~~
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
~~~

- MATRAN — Mảng 2 chiều

~~~
public class MATRAN {
	int m[][];
	int row;
	int col;
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public MATRAN(){
		col = 1;
		row = 1;
		m = new int[1][1];
	}
	
	public MATRAN(int col,int row){
		this.col = col;
		this.row = row;
		m = new int[col][row];
	}
	
	void nhap(){
		Random rd = new Random();
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				m[i][j] = rd.nextInt(51)+1;
	}
	
	void xuat(){
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print(m[i][j]+"\t");
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	void sapXep(){
		//Bubble Sort theo dong
		   for(int k = 0; k<row ; k++)
		      for(int i = 0; i<col-1 ; i++)
		      for(int j = col-1; j>i ; j--)
		      if(m[k][j]<m[k][j-1])
		      {
		         int temp = m[k][j];
		         m[k][j] = m[k][j-1];
		         m[k][j-1] = temp;
		      }
		   
		   //Bubble Sort theo cot
		   for(int k = 0; k<col ; k++)
			      for(int i = 0; i<row-1 ; i++)
			      for(int j = row-1; j>i ; j--)
			      if(m[j][k]<m[j-1][k])
			      {
			         int temp = m[j][k];
			         m[j][k] = m[j-1][k];
			         m[j-1][k] = temp;
			      }
	}
}
~~~

** Tạo các phương thức tính toán kiểm tra cho MANGPS **

~~~
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
~~~

> Class main đề chạy chương trình 

~~~
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int m[] = new int[12];
		BAITAP c1 = new BAITAP();
		c1.nhap(m);
		c1.xuat(m);
		c1.sapXep(m);
		c1.xuat(m);
		c1.tinhTich(m);*/
		
		/*MANGPS a = new MANGPS(3);
		a.nhapMPS();
		a.xuatMPS();
		a.tinhTong();
		a.tinhTich();*/
		
		MATRAN a = new MATRAN(4,4);
		a.nhap();
		a.xuat();
		a.sapXep();
		a.xuat();
	}

}
~~~
