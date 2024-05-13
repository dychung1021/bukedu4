package exam;

public class Exam01 {
	public static void main(String[] args){
//		People p;
//		p=new People(15, "김철수"); People을 추상클래스로 했으므로 불성립
//		p.age=15;
//		p.name="김철수";
//		System.out.println(p.age);
//		System.out.println(p.name);

//		p.Show();
//		Student s1=new Student(15, "김철수");
//		int[] score1= {20,30,40};	
//		s1.input(score1);;
//		s1.Show();
		People[] school = new People[4];
		school[0]=new Student(15,"홍길동");
		school[1]=new Teacher(15,"김철수");
		school[2]=new Student(15,"장길수");
		school[3]=new Student(15,"이병준");
		for (int i=0;i<school.length;i++) {
			school[i].work();
		}
		
	}//main	
	
}//Exam
//이름이 People인 클래스를 제작하시오.
//People 클래스는 나이를 저장할 수 있는 age 필드와 이름을 저장할 수 있는 name 필드를 가지고 있다.
//People 클래스의 생성자를 제작하여 객체 생성시 age와 name 값을 입력할 수 있도록 
//People 내부에 void 타입의 메서드 show를 제작하여 age와 name 값을 출력할 수 있도록 
//이름이 Student인 클래스를 만들어서 People을 상속받으시오
//Student class 내부에 kor eng, math 성적을 입력할 수 있는 필드를 제작하시오
//void타입의 메서드 input을 제작하여 숫자 3개로 이루어진 배열을 매개변수로 받아
//각각의 필드에 입력하시오
//Student show 메서드를 오버라이드 하여 점수까지 보이도록
//다음 상속이 성립하도록 Student를 수정하시오. People을 추상클래스로 바꾸고...
//이름이 Teacher인 쿨래스를 제작하여 People을 상속받으시오
//Teacher클래스는 내부에 String subject필드를 가지고 있다
abstract class People{
	int age;		// 나이 저장용 필드
	String name;	// 이름 저장용 필드
		
	void Show(){
		System.out.println("이름은 "+name+" 이고" + "  나이는  "+age+" 입니다");
	}
	People(int a, String b){
		System.out.println("나이를 입력해 주세요");
		age=a;
		System.out.println("이름를 입력해 주세요");
		name=b;
	}
	abstract void work();//부모클래스가 추상 method를 가질 때 상속받은 클래스는 구체화를 해야 한다.
}
class Student extends People{
	int kor;
	int eng;
	int math;
	
	void work() {//상위 클래스인 People의 추상메서드 work의 구체화를 수행해야 error해소
		System.out.println("공부합니다");
	}
	void input(int[] arr) {
		kor=arr[0];
		eng=arr[1];
		math=arr[2];
	}
	void Show(){//override를 위해서는 type, 매개변수 shall be same with each other.
		super.Show();//부모class의 Show
		System.out.println("Kor :"+kor+"Eng :"+eng+"Math :"+math);
	}
		
	
	Student(int a, String b){
		super(a,b);//부모의 생성자를 수행토록 함
	}
}

class Teacher extends People{
	String subject;
	void work(){
		System.out.println("수업합니다");
	};
	Teacher(int a, String b){
		super(a,b);//부모의 생성자를 수행토록 함
}
}