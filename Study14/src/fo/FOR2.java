package fo;

public class FOR2 {

	public static void main(String[] args) {
		// 중첩 for문
		int a=0;
		int b=0;
		for(a=0; a<2; a++) {
			System.out.println("a 반복문 시작");
			for(b=0; b<3 ;b++) {
			System.out.println("    b 반복문 시작");
			System.out.println("반복수행 중...a = "+a+",  b = "+b);

			System.out.println("    b 반복문 종료");
			}//for2

			System.out.println("a 반복문 종료");
		}//for1
		System.out.println("a = "+a+",  b = "+b);
	}//main
}//class
