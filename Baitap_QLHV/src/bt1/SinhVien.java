package bt1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SinhVien implements Serializable {
	
	private int ma = 0;
	private String ten;
	private String date;
	private String mail;
	private String add;
	private String num;
	
	public SinhVien(){
		ma = 0;
		ten = null;
		date = null;
		mail = null;
		add = null;
		num = null;
	}
	
	public SinhVien(String ten, String date, String mail, String add, String num){
		
		this.ma++;
		this.ten = ten;
		this.date = date;
		this.mail = mail;
		this.add = add;
		this.num = num;
		
	}
	
	public void xuat(){
		System.out.println("MA: " + ma 
				+ "\nTen SV: " + ten 
				+ "\nNgay sinh: " + date
				+ "\nEmail: " + mail
				+ "\nDia Chi: " + add 
				+ "\nPhone: " + num); 
	}

	public  SinhVien xoa(){
		ma = (Integer) null;
		ten = null;
		date = null;
		mail = null;
		add = null;
		num = null;
		return this;
	}
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	
}
