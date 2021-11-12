package com.atos.jdbcdemo;

import java.sql.*;

public class JdbcConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
		String password="system";
		String query="select * from mydb";
		//try {
			
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection(url,user,password);
		Statement st=con.createStatement();
		 ResultSet rs = st.executeQuery(query);
		 rs.next();
		
		 
		 String name=rs.getString(2);
		 System.out.println(name);
		 st.close();
		 con.close();
		//}
		//catch(ClassNotFoundException e) {
			
		//}

	}

}
