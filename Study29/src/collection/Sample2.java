package collection;

import java.util.*;

public class Sample2 {
	public static void main(String[] args){
		//<> generic이라는 문법. 매개변수의 타입을 String으로 바꿈 L.add()가 모든 값을 받을 수 있는 것은
		// object타입으로 지정되었기 때문이지만 이 값을 빼낼 때는 가공이 필요했지만 <String>을 통하여 
		// Stringdmfh wlwjdgoTdma.
 		List<String> L = new ArrayList<String>();
		L.add("가");
		L.add("나");
		L.add("다");
		L.add("라");
		System.out.println(L);
		//반복문을 이용할 경우 .size()부분에 주의
		for(int i=0;i<L.size();i++) {
			System.out.println(L.get(i));
		}
			List<String> M = new ArrayList<String>();
			M.add("A");
			M.add("B");
			M.add("C");
			M.add("D");
			System.out.println(M);
			//ArrayList.addAll(ArrayList); add()처럼 값을 넣는데 리스트 하나가 통째로 들어간다.
			//ArrayList.addAll(index, ArrayList); add()처럼 값을 넣는데 해당 위치에 리스트 하나가 통째로 들어간다.
			L.addAll(M);

			System.out.println(L);
			L.addAll(2,M);

			System.out.println(L);
		
	}
}
