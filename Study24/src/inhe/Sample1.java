package inhe;

public class Sample1 {
	public static void main(String[] args) {
		Parent p= new Parent();
//		p.field=15;
		p.method();
		
		Child c=new Child();
		c.field=20;
		c.method();
		c.number=25; //자식클래스의 일반 메서드이므로 자식 클래스 객체에서 수행
//		p.number=55; 부모 클래스는 자식 클래스의 내용을 가져 올 수 없으므로 p에 number 가 없음. error
		
		Student s=new Student();
//		c.study="99"; 형제간의 상속관계가 없으므로 error
//		s.filed=99;   형제간의 상속관계가 없으므로 error
		
		Student1 s1=new Student1();
		// 부모 크기의 변수에는 자식클래스로 만들어진 객체가 들어갈 수 있고 이는 더 조상에도 적용된다.
		//extends를 적지 않은 모든 클래스는 Object클래스의 상속을 받는다. (hidden word => extends Object)
		//따라서 모든 클래스의 조상은 Object이며 대부분의 데이터를 저장할 수 있는 규격
		//자식 클래스를 객체로 조립하면 부모의 생성자가 "먼저" 실행한다
		//오버라이드 : 부모에서 상속받은 메서드를 자식이 재정의하여 사용하는 기법
		//부모의 메서드를 리턴타입까지 똑같이 작성한 이후{} 내부의 내용을 변경
		//조부모로부터 물려받은 메서드를 부모가 오버라이드 한 경우 자식은 오버라이드 된 결과물을 상속받는다.
	}//main
	

}//Sample1
//상속
//부모 클래스가 가진 필드, 메서드를 이어받아 사용하는 방법
//
class Parent{
	int field;
	void method() {
//		System.out.println("필드 내부의 값은 "+field);
		System.out.println("Parent의 원본 메서드");
	}//method
	Parent(){
//		System.out.println("Parent의 생성자 실행");
	}
	
	
}//parent

class Child extends Parent{
	int number;//자식 클래스 Child의 일반  필드
	void method() {
		System.out.println("Child의 재정의 메서드");
	}
	Child(){

		System.out.println("Child의 생성자 실행");
	}
}//child

class Student extends Parent{
	String study;//자식 클래스 Student의 일반 필드 자식간 즉 형제간은 상속관계 성립하지 않음
	Student(){

		System.out.println("Student의 생성자 실행");
	};
}//child

class Student1 extends Child{
	String study;//자식 클래스 Student의 일반 필드 자식간 즉 형제간은 상속관계 성립하지 않음
	Student1(){

		System.out.println("Child의 재정의 메서드를 Stdent1이 또 재정의한 ");
		System.out.println("Student1의 생성자 실행");
	};
}//child
