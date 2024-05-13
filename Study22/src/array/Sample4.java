package array;

public class Sample4 {
	public static void main(String[] args) {
		//배열 : 여러 개의 데이터를 index로 구분하여 하나의 변수에 저장하는 기법
		//배열이 생성되면 내부 데이터의 수를 length라는 변수에 저장한다.
		Student[] arr=new Student[4];
		//객체타입의 배열을 제작하는 경우, 위 코드는 단순히 칸만 나누어 둔다.
		arr[0]=new Student("홍길동",106);//객체를 만들면서 초기값 입력
		arr[1]=new Student("강감찬",107);
		arr[2]=new Student("이순신",108);
		arr[3]=new Jungsu("이영준",109);//Jungsu를 조립하려면 부모 클래스인 Student를 먼저 수행해야 함
									  //Student에 기본 생성자와 오버로드 생성자가 있으므로 super(a.b)를 통해 2번째 방법을 선택

		for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);}
		System.out.println(arr.length);
		
		Jungsu.run();
	}//main
}//Sample4

class Student{
	String name;
	int number;
	Student(String a, int b){//생성자를 통해 입력
		name=a;
		number=b;
	}
	
	public String toString() {
		return "이름 : "+name+", 번호 : "+number;
		//모든 클래스는 Object로부터 상속을 받았으므로 별도로 sup을 지정하지 않으면 Object를 의미
	}
}//Student class

class Jungsu extends Student{
	Jungsu(String a, int b){
		super (a,b);
	
	}
	static void run() {
		
	}
}//Jungsu class