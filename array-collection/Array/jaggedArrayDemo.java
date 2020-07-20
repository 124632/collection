package com.xworkz.java.Array;

public class jaggedArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] jaggery = new int[4][];
		jaggery[0] = new int[3];
		jaggery[1] = new int[4];
		jaggery[2] = new int[1];
		jaggery[3] = new int[2];
		
		int num=0;
		for(int i=0;i<jaggery.length;i++) {
			for(int j=0;j<jaggery[i].length;j++) {
				jaggery[i][j] = num;
				
				System.out.println(" ");
				num++;
			}
			
		}
		for(int i=0;i<jaggery.length;i++) {
			for(int j=0;j<jaggery[i].length;j++) {
				System.out.print(jaggery[i][j]+" ");
				
			}
			System.out.println();
			}
	}

}
