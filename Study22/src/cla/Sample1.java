package cla;

public class Sample1 {
	public static void main(String[] args) {
		Test t=new Test(5);
		//t.field=1234;
		int number=50;
		int value=t.method(30, number);
//		System.out.println("결과값"+value);

//		System.out.println("필드 내부 값"+t.field);	
		//객체를 3개 만들어서 name, number,address 필드에 데이터 입력

		t.show();
		Test s1= new Test();
		s1.name="홍길동";
		s1.number=101;
		s1.address="서울시 노원구";

		s1.show();
		Test k1=new Test("홍길동", 101, "서울시 노원구");
		Test k2=new Test("이영준", 102, "서울시 강북구");
		Test k3=new Test("정도영", 103, "서울시 강남구");
		k1.show();
		k2.show();
		k3.show();
		
		}

}
//클래스(설계도)
//클래스는 필드, 메서드, 생성자를 가질 수 있다.
class Test extends Object{
	// 필드 : 변수, 생성된 객체가 다른 객체와 구별되기 위한 데이터를 저장하는 장소
	int field;
	String name;
	int number;
	String address;
	//메서드 : 생성된 객체가 수행할 수 있는 동작
	//리턴타입 이름(매개변수 제작){수행할 동작; return value;}
	//매개변수는 메서드 내부에서 변수처럼 사용잉 가능하다
	//매개변수가 있는 메서드는 반드시 해당 변수 타입에 맞는 데이터를 순서대로 주어야 실행 가능
	//if문이나 for문 같은 제어문들은 메서드 내부에 작성되어야 한다.
	int method(int a, int b) {
		int result=a+b;
		System.out.println("메서드 동작");
		if(true) {
			System.out.println("메서드 내부 if 문 실행");
		}
		return result;
		//return이 있는 메서드의 경우 return 아래로는 아무 것도 시키면 안된다.
		//void의 경우 return 문이 없으므로 무관
		//생성자 : 조립하는 동작 자체.
		//별도로 제작하지 않아도 기본적으로 들어가 있는 과정
		//개발자가 본인의 의도를 담아 객체를 만들려고 하는 경우에는 별도로 제작해야 함
		//생성자는 클래스와 동일한 이름
		
	
//	function method(let a, let b) {
//		return number;
//	}java와 달리 javascript에서는 매개변수 a,b가 정해져 있지 않으므로 매개변수가 제작된 것이 아님.
	//매개변수에 값이 지정될 때 생성됨.
}//메서드 method
	//생성자(Constructor)는 클래스 이름(){추가적으로 수행할 내용} 만약 추가적으로 수행할 내용이 없으면 생성자를 적지 않아도 됨.
	//리컨타입이 적혀져있지 않은 클래스와 이름이 똑같은 메서드처럼 생겼다.but not 메서드.
	//생성자의 용도 : 필드에 초기 데이터를 입력하거나 객체를 다른 형태로 조립할 때 사용
	//생성자는 단 한번, 객체가 생성될 때 수행된다.
	Test(){
		field=12340;
		System.out.println("의도를 잘 담았음");
	}//생성자 Test1
	Test(int a){
		field=a;
		System.out.println("매개변수를 통해 필드를 초기화하는 생성자 실행");
	}//생성자 Test2
	Test(String n, int m, String a){
		name=n;
		number=m;
		address=a;
		System.out.println("데이터를 전부 입력받아 조립하는 생성자 실행");
				
	}//생성자 Test3
	
	void show() {
		System.out.println(name+", "+number+", "+address);	
		//데이터 출력을 편하게 해주는 toString 오버라이드
		//오버라이드는 상속에서 굉장히 중요한 역할을 한다
	}
	public String toString() {
		return name+", "+number+", "+address;
	}
	
}//class Test
