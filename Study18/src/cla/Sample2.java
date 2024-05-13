package cla;
import java.util.*;
public class Sample2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요");
		int num=sc.nextInt();// 사용자가 입력한 숫자를 num에 저장
		System.out.println("두번째 숫자를 입력해 주세요");
		int num2=sc.nextInt();// 사용자가 입력한 숫자를 num2에 저장
		
		Cal c;
		c=new Cal();
		c.add(num,22);
		int f=c.mul(num,num2);
		System.out.println("5 곱하기 8은 "+f);
	}//main
}//Sample2

class Cal{
	// 매개변수 :메서드를 실행할 때 데이터를 주고 시켜야 하는 경우
	// 		   해당데이터를 메서드 내부의 변수를 통해 전달해 주어야 한다.
	// 메서드 외부에서 데이터를 내부로 전달할 경우 매개변수를 사용한다
	// 매개변수의 타입과 일치하는 데이터를 주지 않으면 동작시킬수 없다.
	//매개변수는 메서드 내부에서 변수처럼 이용 가능하다.
	// 리턴타입 이름(매개변수){실행시 수행할 문장;}
	int result;
	void add(int a,int b) {
		System.out.println("매개변수 2개를 받아 더하는 add");
		System.out.println(a+b);
	}//add
	//리턴타입이 int이고 숫자 두개를 방아 동작하여 받아온 두개의 수를 곱하여 반환하는 메서드 제작
	// 메서드를 통하여 return된 값은 변수에 담아 콘솔에 출력할 것
	
	int mul(int c, int d){
		result=c*d;
		return result;
	}//mul
	
	//리턴타입과 이름이 똑같은 메서드를 매개변수의 수와 종류를 다르게 해서
	//다른 메서드처럼 사용하는 방법
	//"메서드 오버로드"	
	void add(int a,int b,int c) {
		System.out.println("매개변수 개를 받아 더하는 add");
		System.out.println(a+b+c);
	}//add
}//Cal


