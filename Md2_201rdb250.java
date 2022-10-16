package dip107;

import java.util.Random;
import java.util.Scanner;


public class Md2_201rdb250 {

	public static void main(String[] args) {
	

		int A[] = new int[40];
		int K, i;
		float C ;
Scanner sc = new Scanner (System.in);
		
		System.out.println("K=");
		if(sc.hasNextInt())
			K=sc.nextInt();
		else {
			System.out.println("Input-output error");
			sc.close();
			return;
		}
		sc.close();
		System.out.println("Ŗesult:");
		
		if(K>1 || K<19) {
			A[1]=1;
			for(i=1;i<20;i++)
				A[i]=(A[i-1]+K);
		}
		else {
			
			Random r = new Random();
			for(i=0;i<20;i++)
			A[i]=r.nextInt()*20-10;
		}
	System.out.println("A:");
	
			for(i=0; i<20; i++) {
				System.out.printf("%d\t",A[i]);
				if(i==9) System.out.println();
			}
			i=0;
			while(i<20) {
				C=A[i];
				if(K==A[i]) {
					A[i] = A[i+1];
					A[i+1]=  (int) C;
					A[19]=0;
				}
				i=i+1;
			}
		
			}
	}


		



		


	

	

	

		
		
	


