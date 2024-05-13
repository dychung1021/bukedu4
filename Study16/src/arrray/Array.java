package arrray;

public class Array {
	public static void main(String [] args){
		//다차원 배열
		//배열 내부의 한 요소가 배열로 이루어진 경우
		//이차원 배열의 내부를 보기 위해서는 2중 for문이 필요
		
		int[] arr1= {1,2,3};//length가 3이고 0~2번까지의 index를 갖는 배열
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}//for1
		
		int[][] arr2= {{1,2,3},{1,2,3}};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"\t");
			}//inner for2
			System.out.println();
		}//outer for
		
	}//main							

}//class
