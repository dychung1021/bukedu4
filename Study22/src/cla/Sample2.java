package cla;

public class Sample2 {
	public static void main(String [] args) {
//		Parents p=new Parents();
//		Parents p=new Child();//부모 공간에 자식 클래스는 들어갈 수 있다.(포괄적인 공간에 구체화된 것이 들어갈 수 있다)
//		Child c=new Parents();  자식클래스 공간에 부모클래스는 못들어간다.(구체적인 공간에 포괄적인 것이 들어갈 수 없다)
//		System.out.println(p.money);
//		
//		Child c=new Child();
//
//		System.out.println(c.money);
//		p.work();
//		c.work();

//		System.out.println(p.hobby);
		Child c=new Child();//상속 관계가 성립하면 부모 클래스의 생성자가 먼저 실행됨.
		c.work();
		
	}
}
//상속 : 클래스 간에 부모클래스로부터 내용들을 자식클래스가 이어받는 문법
//java는 다중상속을 엄격히 금지한다. 자식 class는 하나의 부모 class만 가질 수 있다. 부모 class는 여러 개의 자식 class를 가질 수 있다. 
//문법 : 자식 class 이름 extends 부모 class 이름 => 상속이 성립
//상속이 성립하면 자식 class는 부모 class의 모든 필드와 메서드를 이어 받음.
//자식 class의 필드 메서드는 부모 class에서 사용할 수 없다.
//자식객체는 부모가 들어갈 수 있는 변수에 들어갈 수 없지만
//부모객체는 자식이 들어갈 수 있는 변수에 들어갈 수 없다.

class Parents{
	int money=5000000;
	void work() {
		System.out.println("열심히 일합니다");
	}
	Parents(){
		System.out.println("부모의 생성자 실행");
	}//생성자
	Parents(int a){
		System.out.println("부모의 다른 생성자 실행");
	}//생성자
}

class Child extends Parents{
	String hobby="게임";
	//오버라이드 : 부모로부터 물려받은 메서드를 자식이 재정의 하여 사용하는 방법
	//부모의 메서드와 똑같은 걸 적은 뒤에 내용만 바꾼다.
	void work() {
		super.work();//super는 부모를 의미 while this가 자신을 의미
					 //오버로드 시 부모의 기능을 유지하고 싶다면 super.메서드
	System.out.println("No i won't");
	}
	//자식의 객체가 되기 위해서는 부모의 조립된 모양이 필요하니
	//자식의 생성자를 호출하면 부모의 생성자가 먼저 실행된다. 
	Child(){
		super(1000000000); //부모의 생성자 먼저 시행
		System.out.println("자식의 생성자 실행");
		//부모의 생성자가 여려 개라면 그 중 하나를 골라야 하는 경우 super()를 이용한다.
		//부모의 생성자는 자깃생성자보다 늘 먼저 실행되어야 하므로
		//자식 생성자의 가장 위에서 생성자를 골라야 한다
				
		
	}
}

class Child2 extends Parents{
	
}
