package cls;

public class Sample1 {
	public static void main(String[] args) {
		//클래스 : 객체를 조립하는 설계도
		//클래스는 필드, 메서드, 생성자를 가질 수 있다.*****
		//1. 필드 : 객체간 구별을 위한 데이터(속성)를 저장할 수 있는 공간
		//2. 메서드 : 객체가 수행할 수 있는 동작
		//3. 생성자 : 객체를 조립하는 방법
		//클래스는 객체로 조립하여 사용해서 아용한다.
		//객체조립방법 : new 클래스 이름();
		//조립된 객체는 변수에 담아야 사용하기 편하다.
		
		//클래스 하나로 객체는 여러 개 제작할 수 있고
		//제작된 객체는 서로 영향을 받지 않는다.
		
		Test t1;//Test가 들어갈 수 있는 이름이 t1인 공간을 확보하라는 명령
		Test t2;
		Test t3;
		t1=new Test();//t1을 Test type으로 새로 만들어라 Test type은 class에 이미 지정되어 있다. 
		t2=new Test();
		t3=new Test();
		
		t1.name="김철수";
		t2.name="홍길동";
		t3.name="정도영";
		
		// Test t=new Test(); 로 쓸 수 있다. // 이름이 t인 변수는 Test type 
		System.out.print(t1);
		//class 제작법
		//class 이름{}
		//클래스는 다른 클래스 내부에 만들어도 되고 외부에 만들어도 된다.
		//클래스는 다른 클래스 내부에 만들면 처음에 공부하기 어려워진다.
		//설계도가 있다면 객체는 수없이 많이 만들수 있고 객체가 동작을 한다.
		//만들어진 객체는 객체들 끼리는 상호독립적이다
		//설계도 내에 설계도(즉, 클래스 내에 다른 설계도) 클래스 내의 클래스의 결과물은 객체가 아닌 클래스일 뿐이다.
		//같은 package 내에서는 동일한 class 이름을 쓸 수 없다.
		//다른 package 에서는 package명.class명으로 쓸 수 있다.
		//
	}//main
}//Sample class
		class Test{
		//필드 : 통상적으로는 변수로 지정한다.
		//객체가 가질 수 있는 다른 객체와 구별되는 데이터(속성 ㅣAttribute)을 저장할 공간
		String name;
		int number;
	}//Test class

