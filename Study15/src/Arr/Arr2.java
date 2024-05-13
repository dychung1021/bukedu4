package Arr;

public class Arr2 {
	public static void main(String[] args) {
		//배열은 사실 데이터가 저장되어 있는 다른 위치의 주소를 저장하고 있다.
		//B=A;는 B의 주소에 A의 주소를 넣는 것이므로 A의 데이터를 바꾸면 B도 바뀐다.
		// 이를 처리하는 방법은 B를 새로 만들어 값을 다시 입력하는 것으로 해결 가능, 즉 주소가 다른 배렬이 만들어진다.
		//즉 배열복사 자체를 하지 않는 것이 좋다.
		int[] A;
		A=new int[3];
		A[0]=10;A[1]=20;A[2]=30;
		int[] B;
		B=new int[3];
		for(int i=0;i<A.length;i++) {
			B[i]=A[i];
		}
		A[1]=999;
		for(int i=0; i<A.length; i++) {
			System.out.print("A["+i+"]="+A[i]+"  \t");
		}
		System.out.println();
		for(int i=0; i<B.length; i++) {
			System.out.print("B["+i+"]="+B[i]+"  \t");
		}
		System.out.println();
		System.out.println("A의 주소 = "+A);
		System.out.println("B의 주소 = "+B);
		
		//2차원배열
		int[][] C;
		C=new int [2][5];
		C[0][0]=100;
		C[1][4]=200;
		// C.length 2, C[0].length 5가 됨 
	}//main

}//class
