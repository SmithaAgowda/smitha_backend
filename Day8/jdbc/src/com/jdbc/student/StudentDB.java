package com.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDB {

	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				String url ="jdbc:mysql://localhost:3306/jdbc";
				String user = "root";
				String pass = "Sa123";
				
				Connection connection = DriverManager.getConnection(url,user,pass);
//				
//				String Query = "insert into student(name,percentage,address) values('Yatharth',99.9,'Mysore')";
//				Statement statement = connection.createStatement();
//				
//				int executeUpdate =statement.executeUpdate(Query);
			//	System.out.println(executeUpdate);
				
				String Query = "insert into student(name,percentage,address) values(?,?,?)";
				
				PreparedStatement preparedStatement =connection.prepareStatement(Query);
				
				System.out.println("please enter the name:");
				preparedStatement.setString(1, scanner.next());
				
				System.out.println("Please enter the percentage:");
				preparedStatement.setDouble(2, scanner.nextDouble());
				
				System.out.println("Please enter the address:");
				preparedStatement.setString(3, scanner.next());
				
				boolean execute =preparedStatement.execute();
				System.out.println(execute);
				
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
		
		
		
	}
}
