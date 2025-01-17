package close;

import java.sql.*;//Connection, sStatement, Resultset
public class Sample2 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;//오류 방지를 위해 기본값 넣어주기, close 처리를 위해 초기 오류방지
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String db_id="root";
		String db_pw="iotiot";
//		String sql="select * from student";
		String sql="insert into student (name, kor, math, eng,sum)";
		sql+="values('이영준', 50, 50,50,150);";
		//회선 연결 과정
		try {
			conn=DriverManager.getConnection(url, db_id, db_pw);
			stmt=conn.createStatement();
//			rs=stmt.executeQuery(sql);//statement를 통해 sql에 string sql값을 전송
			stmt.execute(sql);//insert문은 resultset이 없다
			// Statement의 Query 전송 메서드들
			// stmt.execute(sql) ; return boolean, resultset의 존재여부에 따라 true, false
			// stmt.executeQuery(sql) ; return resultset ;결과화면을 반환
			// stmt.executeUpdate(sql); return int; 변화한 수를 반환
			System.out.println("num"+" \t"+"name"+"\t "+"kor"+"\t "+"math"+"\t "+"eng"+"\t "+"sum");
			/*while(rs.next()) {
				String num=rs.getString("num");//num 변수 "num" 필드명
				String name=rs.getString("name");
				String kor=rs.getString("kor");
				String math=rs.getString("math");
				String eng=rs.getString("eng");
				String sum=rs.getString("sum");
				

				System.out.println(num+" \t"+name+"\t "+kor+"\t "+math+"\t "+eng+"\t "+sum);
			}*/
			System.out.println("<h1>접속을 환영합니다. </h1>");
			
		}catch(Exception e){
			System.out.println("접속 중 오류 발생 : "+e);
		}finally {//무조건 실행되는 사항, 회선 종료처리, 이것도 try - catch 처리해야 함.
			//여는 순서는 Connection->Statement->Resultset 닫는 순서는 Resultset->Statement->Connection
			
			try {
				if (rs!=null)rs.close();   // 닫는 순서 여는 순서 지킬 것.connection 통로의 찌꺼기 자료 제거
				if (stmt!=null)stmt.close();
				if (conn!=null)conn.close();
				
			}catch(Exception ex){
				System.out.println("접속 해제 중 오류발생"+ex);
			}//catch
		}//finally
	}//main
}//Sample
