package pack1;
	public class Sample2 {
		public static void main(String[] args) { 
			Data d=new Data();
			//d.pri=10;private은 같은 클래스 내부에서만 사용가능한 데 Sample2는 다른 클래스임
			d.pro=20; //Data클래스와 Sample2클래스가 같은 패키지 내부에 있기 때문에 사용가능
			d.def=30; //Data클래스와 Sample2클래스가 같은 패키지 내부에 있기 때문에 사용가능
			d.pub=40; // public
			System.out.println(d.pro +"  "+ d.def+"  "+d.pub);
		}
	}
