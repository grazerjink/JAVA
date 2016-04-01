package bt1;

import java.util.Scanner;

public class giaodien {

	MyDBengine ghi = new MyDBengine();
	public void getMenu(){
		System.out.println(" -- DANH SÁCH SINH VIÊN -- "+"\n");
		System.out.println("===========================");
		System.out.println("1 - Xem danh sách sinh viên");
		System.out.println("2 - Thêm sinh viên");
		System.out.println("3 - Xóa sinh viên");
		System.out.println("4 - Xem Menu");
		System.out.println("5 - Thoát ứng dụng");
		System.out.println("--> Vui lòng chọn chức năng <--" + "\n");
		getChucNangChung();
	}
	
	void getChucNangChung(){
		Scanner in = new Scanner(System.in);
		int choose = in.nextInt();
		switch (choose) 
		{
			case 1:
				System.out.println("1 - Xem danh sách sinh viên");
				System.out.println("\r\n");
				//Doc File Sinh Vien
				//lựa chọn ChucNang1;
				ChucNang1();
				break;
				
			case 2: 
				System.out.println("2 - Thêm sinh viên");
				System.out.println("\r\n");
				//lựa chọn ChucNang2;
				ChucNang2();
				
			case 3:
				System.out.println("3 - Xoá sinh viên");
				System.out.println("\r\n");
				//lua chon ChucNang3;
				
				ChucNang3();
				
			case 4:
				getMenu();
				//lua chon ChucNang4;
				ChucNang4();
			
			case 5:
				System.out.println(" -- Đã thoát ứng dụng -- ");
				System.out.println("\r\n");
				System.exit(0);
				
			default:
				getMenu();
				break;
		}
	}
	
	void ChucNang1(){
		ghi.docFile("E:/thongtin.txt");
		System.out.println("Quay về Menu --> Chọn Y");
		System.out.println("\r\n");
		Scanner in = new Scanner(System.in);
		String choose = in.nextLine();
		switch (choose) 
		{
			case "Y":
				getMenu();
				break;
				
			default:
				getMenu();
				break;
		}
	}
	
	void ChucNang2(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập tên sinh viên: ");
		String ten = nhap.nextLine();
		System.out.print("Nhập ngày sinh sinh viên: ");
		String ngsinh = nhap.nextLine();
		System.out.print("Nhập email sinh viên: ");
		String mail = nhap.nextLine();
		System.out.print("Nhập địa chỉ  sinh viên: ");
		String add = nhap.nextLine();
		System.out.print("Nhập số điện thoại sinh viên: ");
		String num = nhap.nextLine();
		//chuc nang them SV;
		SinhVien sv = new SinhVien(ten,ngsinh,mail,add,num);
		MyDBengine ghi2 = new MyDBengine();
		ghi2.ghiFile("E:/thongtin.txt", sv);
		System.out.println("Đã thêm vào file thành công !");
		System.out.print("Quay về Menu --> Chọn Y");
		Scanner in = new Scanner(System.in);
		String choose = in.nextLine();
		switch (choose) 
		{
			case "Y":
				getMenu();
				break;
				
			default:
				getMenu();
				break;
		}
	}
	
	void ChucNang3(){
		//chuc nang xoa SV;
		System.out.print("Quay về Menu --> Chọn Y");
		Scanner in = new Scanner(System.in);
		String choose = in.nextLine();
		switch (choose) 
		{
			case "Y":
				getMenu();
				break;
				
			default:
				getMenu();
				break;
		}
	}
	
	void ChucNang4(){
		System.out.print("Quay về Menu --> Chọn Y");
		Scanner in = new Scanner(System.in);
		String choose = in.nextLine();
		switch (choose) 
		{
			case "Y":
				getMenu();
				break;
				
			default:
				getMenu();
				break;
		}
	}
}

