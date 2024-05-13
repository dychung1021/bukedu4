package abs;

public class Sample3 {
	public static void main(String[] args) {
		ABS[] a = new ABS[3] ;
		a[0]= new Parent();
		a[1]= new Sample4();
		a[2]= new Parent();
		for(int i=0; i<a.length; i++) {
			a[i].plus();
		}
	}//main
}//Sample3
	//abstract class 이름()
	//추상클래스}
abstract class ABS{
	int number;//추상클래스도 필드 가질수 있다. 상속하지 않으면 사용불가
	void test() {
		//추상 클래스도 메서드를 가질 수 있다. 상속하지 않으면 사용 불가
		System.out.println("추상클래스가 가진 메서드");
	}//test
	ABS(){
		//추상클래스도 생성자 가질수 있다. 상속을 통해 조립하지 않으면 사용불가
		System.out.println("추상클래스의 일반 생성자");
	}//ABS
	abstract void plus();
}//abstact class ABS	abstract void plus();
	//추상메서드
	//abstract 리턴타입 이름(매개변수);
	//추상클래스가 추상메서드를 가진 경우 자식 클래스는 반드시 추상 메서드를 구체화하여야 한다. 추상메서드가{}를 가지면 구체화가 되므로 {}를 가질 수 없다.
	//상속받은 자식 클래스에서 같은 이름의 메서드가 {}를 가지고 그 안에 구체화 {} 자체가 구체화임
	//상속받은 자식 클래스가 구체화를 하지 않으면 상속이 성립하지 않고 error
	
	//class ABS
//추상클래스는 너무 추상적이라서 객체로 조립할 수 없는 "클래스" 
//필드, 메서드 생성자를 가질 수 있다.
//단독으로는 사용할 수 없지만 상속을 통해 일반 클래스에게 넘겨주기 위해 필드, 메서드를 가진다.
//자식객체를 조립하면 부모의 생성자가 실행되는 기능을 구현하기 위해 생성자를 가진다.
//부모클래스에는 자식클래스가 들어갈 수 있으므로 부모클래스에 들어가기 위해서는 반드시 부모클래스 상속을 받아야만 한다.
class Parent extends ABS{
	void plus() {
		System.out.println("추상클래스의 몸통을 구현한 일반 메서드");
		
	}//plus
	int add(int a, int b){
		return a+b;
	}//add
}//Parent

class Sample4 extends ABS{
	void plus() {
		System.out.println("Sample4에서 구현한 일반 메서드");
	}
}

