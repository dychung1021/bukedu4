package method;

public class Sample1 {
	public static void main(String[] args) {
		boolean b=true;
		Test a;
		a=new Test();
		// Test a=new Test(); 이름이 a인 Test 타입의 변수를 만들자(new)
		//객체 조립방법 : new 클래스명();
		a.run();
		a.run(1);
		a.run("안녕하세요");
		a.run(1,2);
		a.run(5,"안녕");
		a.run("안녕",5);
		a.run(b);
	}//main

}
//메서드 : 클래스 내부에 작성되어 객체가 수행하는 동작
//같은 이름을 가진 동작이 여러개이면 오류의 원인이 된다.
//매개변수의 이름이 같더라도 매개변수의 타입과 수를 달리하면 작동 method overload
//이 때, 매개변수의 이름은 상관없다. 타입과 매개변수의 숫자에만 영향

class Test{
	// 리턴타입(){호출시 수행할 동작;}
	void run() {
		System.out.println("첫번째 run()동작실행");			
	}// void run1
	void run(int a) {
		System.out.println("두번째 메서드 동작 실행  "+a);
	}//void run2
	void run(String a) {
		System.out.println("세번째 메서드 동작 실행   "+a);
	}//void run3

	void run(int a,int b) {
		System.out.println("네번째 메서드 동작 실행  "+a+"  "+b);
	}//void run4

	void run(int a, String b) {
		System.out.println("다섯번째 메서드 동작 실행  "+a);
	}

	void run(String b, int a) {
		System.out.println("여섯번째 메서드 동작 실행  "+a);
	}//void run6
	
	void run(boolean a) {
		System.out.println("일곱번째 메서드 동작 실행  "+a);
	}//void run5
	}

