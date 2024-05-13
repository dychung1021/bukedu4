package Arr;

public class Arr {
	public static void main(String[] args) {
		//args : arguments 실제로 다른 이름을 지정해도 무방
		//배열 : array, 여러개의 값을 저장할 수 있는 규격
		//타입[]이름;
		//몇칸으로 만들지 먼저 지정해 주어야 한다.
		//배열번호(index)는 0부터 시작하므로 칸수-1까지만 있다.
		//배열칸수는 배열이름.length로 확인할 수 있다.
		int[] a;
		a=new int[3];
		a[0]=12;
		a[1]=25;
		a[2]=30;
		System.out.println("a 배열칸수는 "+a.length);
		int[] b= {100,200,80,60,15,13};
		System.out.println("b 배열칸수는 "+b.length);
		System.out.println("기냥 출력한 "+a[0]);
		System.out.println("기냥 출력한 "+a[1]);
		System.out.println("기냥 출력한 "+a[2]);
		
		for (int i=0;i<a.length;i++) {
			System.out.println("for로 출력한 a배열값 a["+i+"]="+a[i]);	
		}
		for (int j=0;j<b.length;j++) {
			System.out.println("for로 출력한 b배열값 b["+j+"]="+b[j]);	
		}
		
	}//main
	
}//class
