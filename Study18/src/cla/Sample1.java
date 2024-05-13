package cla;

public class Sample1 {
	public static void main(String[] args) {
		//클래스를 이용하려면 먼저 객체를 만들어야 한다.
		//
		Student s;
		s=new Student();
		//위의 2개행의 문장은 Student s = new Student; 와 동일
		s.name="이영준";
		//System.out.println(s.name);
		
		Student t;
		t=new Student();
		//위의 2개행의 문장은 Student s = new Student; 와 동일
		t.name="정도영";
		System.out.println("첫번째 객체의 이름은 "+s.name);
		System.out.println("두번째 객체의 이름은 "+t.name);
		String b;
		b=s.check(); //출석체크기능
		//String b=s.check();
		System.out.println(b+"님 성공하였습니다.");
		
		String c;
		c=t.check(); //출석체크기능
		//String c=t.check();
		System.out.println(c+"님 성공하였습니다.");
		
		t.study();
	}
}
//클래스 : 클래스는 필드 , 메서드, 생성자를 가질 수 있다
//메서드 : 클래스 내부에 작성되어 객체(object)가 수행하는 동작

class Student{
	String name;   		// 학생의 이름을 저장할 공간
	int number;			// 학생의 학번을 저장할 공간
	int kor;			// 학생의 국어성적을 저장할 공간
	int eng;			// 학생의 영어성적을 저장할 공간
	int math;			// 학생의 수학성적을 저장할 공간
	// 메서드는 동작(지정된 시간에 조건에 따라 실행되는)
	// 리턴타입 이름(){동작이 실행되면 수행할 문장;}
	String check() {
		System.out.println("지문을 체크합니다.");
		return name;
		// return type method
	
	
	}// String Check method 한번 리턴이 이루어지면 이후로는 다른 명령을 시킬 수 없다. 다른 return 명령도 안된다.
	
	void study() {

		System.out.println("공부를 열심히 합니다.");
	}//return 이 없는 void 메서드
	

}   // class Student