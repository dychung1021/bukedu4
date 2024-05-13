package inhe2;

public class Sample2 {
	public static void main(String[] args) {
		Child c=new Child();
		c.money=1000000;
		c.house="우리집";
		c.computer=true;
		//클래스간 상속하더라도 만들어진 객체간에는 무관, 즉 값이 따라가지는 않는다.	
//		GrandParent gp =new GrandParent(); error 정의가 되지 않는다
		//객체는 생성할 수 없지만 변수는 만들 수 있다.
		GrandParent gp;
		GrandParent p =new Parent();
		p.run();
		GrandParent d =new Child();// 추상클래스는 자신이 객체가 될 수 없지만 상속받은 자식 클래스는 가능 
		d.abs();
	}

}
//추상클래스는 객체로 조립할 수 없다.
//필드, 메서드, 생생자를 가질 수 있지만 자기가 직접 객체를 만들 수 없어 직접 사용은 불가능
//추상메서드는 추상 메서드를 가질 수 있다
//abstract 리턴타입 이름();
//추상클래스가 추상메서드를 가진 경우, 추상클래스를 상속받은 자식 클래스는 반드시 추상메서드의 몸통을 구현해야 한다.
//상속받은 클래스도 추상클래스이면 몸통구현울 하지 않아도 된다.
//상속받는 클래스가 일반 클래스이면 반드시 몸통구현
abstract class GrandParent{
	int money;
	void run() {
		System.out.println("할아버지의 메서드");
		
	}
	abstract void abs();
}//GrandParent

class Parent extends GrandParent{
	String house;
	void run() {

		System.out.println("아버지가 오버라이드한 메서드");
	
	
	}//
	void abs() {
		System.out.println("할아버지의 추상메서드를 아버지가 구현함");
	}
}


class Child extends Parent{
	boolean computer;
}
