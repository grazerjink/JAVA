package baitap_mang.java;

import java.util.Random;

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
