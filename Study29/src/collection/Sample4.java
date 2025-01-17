package collection;

import java.util.*;

public class Sample4 {
	public static void main(String[] args) {
		List<String> L= new ArrayList<String>();
		L.add("IOT");
		L.add("JAVA");
		L.add("HTML");
		L.add("CSS");
		L.add("SQL");
		L.add("JSP");
		System.out.println(L);
		
		L.add(4, "JavaScript");
		System.out.println(L);
		//List.subList(start, end); 해당 index 범위 내의 내용물을 별도의 리스트로 추출 start에서 end-1까지, 데이터의 직전에 cursor위치를 얘기함.
		
		List<String> sub = new ArrayList<String>();
		sub=L.subList(2,5);
		System.out.println(sub);
		
		//데이터 삭제
		//List.remove(index)l 해당 위치의 자료제거
		L.add(0,"CSS");
		L.remove(1);
		System.out.println(L);//해당위치 뒤의 자료가 앞으로 땅겨져 온다

		L.remove("CSS");
		System.out.println(L);//해당자료 값을 지정하여 삭제, 중복된 자료는 첫번째 자료만 삭제
		
		Collections.sort(L);//오름차순, 문자는 알파벳순
		System.out.println(L);

		Collections.sort(L, Collections.reverseOrder());//내림차순
		System.out.println(L);
	}

}
