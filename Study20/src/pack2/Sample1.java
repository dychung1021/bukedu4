package pack2;
import pack1.Data;
public class Sample1 {
	public static void main(String[] args) {
		Data d=new Data();
		//d.pri=10; private type은 class를 벗어나면 사용할 수 없다.
		//d.pro=20; protected type은 package를 벗어나면 사용할 수 없다.
		//d.def=30; default(아무 것도 적지 않은 것)은 package를 벗어나면 사용할 수 없다.
		d.pub=40; //public 은 package를 벗어나도 사용할 수 있다.
		System.out.println(d.pub);
		
	}

}
