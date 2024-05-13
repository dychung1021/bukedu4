package exam;

import java.util.Scanner;
public class exam {
	// for문을 이용해서 1~100 까지 출력하는 프로그램을 제작
	// 변수를 2개 num과 ber만들어서 1~100까지 숫자를 저장해 두세요 num<ber
	// 위의 for문을 num~ber까지 출력하도록 변경해보세요
	// 내부에 이름이 Test인 class를 만들고 
	// 이름이 make인 String type의 메서드를 제작
	// 해당 메서드가 실행되면 console 부분에 1~100까지 출력
	// make에 매개변수를 두어 num~ber까지 출력
	public static void main(String[] args) {
		int num=25;
		int ber=27;
		//1st problem
		System.out.println("1번째 문제입니다");
		for(int i=1;i<=6;i++) {
			System.out.println(i+"\t");
			
	
		}//for 1st
		
		//2nd problem
		System.out.println("2번째 문제입니다");
		
		for(int i=num;i<=ber;i++) {
			System.out.println(i+"\t");
			
	
		}//for 2nd
		
		//3rd problem
		System.out.println("3번째 문제입니다");
		Test e;
		e=new Test();
		String aa=e.make("지금 맞게 코딩한거임?");
		System.out.println(aa);
		
		//4th problem
		System.out.println("4번째 문제입니다");
		Test f;
		f=new Test();
		f.make(num,ber);
		//System.out.println(aa);
		
		//5th problem
				System.out.println("5번째 문제입니다");
				Test g;
				g= new Test();
				int k;
				System.out.println("계산할 구구단의 단수를 입력해 주세요");
				Scanner scan = new Scanner(System.in);
				k=scan.nextInt();
				g.gugu(k);
				//System.out.println(aa);
	}//main
}//class

class Test{
	
	String make(String nn) {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}//for
		
		return nn;
	}//String make
		
	void make(int a, int b) {
		for(int i=a;i<=b;i++) {
			System.out.println(i);
			
		}//for
	}//int make
	
	void gugu(int c){
		System.out.println(c+"단");
		for (int i=1;i<=9; i++) {
			System.out.print(c+" x "+i+" ="+c*i+"\t");
		}//for
	}//gugu
		
	
}//class Test
//2~9 사이의 숫자를 받아 해당 구구단의 단수를 출력하시오