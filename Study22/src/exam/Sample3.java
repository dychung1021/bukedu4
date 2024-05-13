package exam;

public class Sample3 {
	public static void main(String[] args) {
		int a;
//		Parent aa=new Parent();
		Parent aa=new Parent(7);
//		aa.setNumber(5);	
		Child bb=new Child(99);//부모의 생성자의 먼저 실행
		System.out.println(bb.number);
	
	}//main
}//sample
//이름이 Parent인 클래스를 제작하시오.
//내부에 int 타임의 변수 number를 Parent 내부에 제작하시오
//생성자를 제작하시오. 매개변수가 없고 "부모의 일반생성자"를 출력
//이름이 setNumber이고 int타입의 데이터를 받아 number필드에 저장하는 void타입 메서드를 제작하시오
//Parent에 생성자를 overload하여 int 타입 데이터를 받아 number에 저장하는 기능을 추가하시오.
//이름이 Child인 클래스를 제작하시오
//Child 클래스를 객체로 조립하여 콘솔에 뜨는 안내문을 확인하시오
//Child 클래스가 Parent 클래스를 상속하시오
//Child 클래스에 일반생성자를 하나 제작하시오
//Child클래스에- 생성자를 오버로드하여 부모의 생성자 중 int를 받는 생성자가 실행되도록 제작하시오
//Child 클래스에 새로 만들어지는 생성자는 int 타입의 매개변수를 가지고 있습니다.
class Parent {
	int number;
	
	Parent(){
	System.out.println("부모의 일반생성자");
	}
	void setNumber(int a) {
		number=a;
	}
	Parent(int b){
		System.out.println("number를 초기화하는 부모의 생성자, overload");
		number=b;
		}

		
	}	
class Child extends Parent{
	Child(){
		System.out.println("자식의 일반생성자");
	}
	Child(int c){
		super(c);
		System.out.println("자식의 부모생성자 특정 생성처리");
	}
	
}

