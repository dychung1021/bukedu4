package test;

public class test1 {
	public static void main(String[] args) {
	// for 문을 이용해서 1~10까지 순서대로 출력하시오.
		for (int i=1; i<11; i++) {
			System.out.print(i+"\t");
		}//for
		System.out.println();
		//*
		//**
		//***
		//****
		//*****
		//for문을 이용하여 출력
		int dim=5;
		String star = "*";
		for (int i=1; i<=dim;i++) {
			for (int j=1;j<=i;j++) {
			System.out.print(star);
		}//inner for
			System.out.println();
		}//outer for
		
		for (int i=0; i<5;i++) {
			System.out.print(star);
			star+="*";
			System.out.println();
		}//for 1개를 이용한 *
		
		//for문을 이용하여 구구단 2단부터 9단 종으로 출력
		
		for (int i=2;i<10;i++) {
			System.out.println("<<"+i+"단>>");
			System.out.println("<<"+i+"단>>");
			for (int j=1;j<10;j++) {
				System.out.println(i+" x "+j+"="+i*j);
			}//inner for
			System.out.println();
		}//outer for
		
		//for문을 이용하여 구구단 2단부터 9단 횡으로 출력
		System.out.println();
		for (int i=0;i<10;i++) {
			for(int j=2;j<10;j++) {
				if(i==0 ) {
					
						System.out.print("["+j+"단]\t\t");
				}//제목줄
				
				else {
						System.out.print(j+" x "+i+" = "+j*i+'\t');}
				}//inner for
			System.out.println();
		}//outer for
		
	}//main
}//class
