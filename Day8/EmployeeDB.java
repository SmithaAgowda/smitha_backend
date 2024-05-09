package com.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDB {

	private static Connection connection;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";

			 connection = DriverManager.getConnection(url, user, pass);

			System.out.println("press 1 for Insert record");
			System.out.println("press 2 for select employee by id");
			System.out.println("press 3 for select all employee");
			System.out.println("press 4 for delete employee");
			System.out.println("press 5 for update employee fields");

			System.out.println("enter choice");

			int choice = Integer.parseInt(scanner.nextLine());

			switch (choice) {
			case 1: {
				insertRecord();
				break;
			}
			case 2: {
						
				selectAll();
				break;
			}
			case 3: {

				select();
				break;
			}
			case 4: {
				
				deleteRecord();
				break;
			}
            case 5: {
				
            	update();
				break;
			}
			default:

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	private static void insertRecord() throws SQLException {

		String query = "insert into employee(name,sal,dept) values(?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		while (true) {
			System.out.println("enter emp name");
			preparedStatement.setString(1, scanner.next());

			System.out.println("enter salary");
			preparedStatement.setDouble(2, scanner.nextDouble());

			System.out.println("enter emp department");
			preparedStatement.setString(3, scanner.next());

			System.out.println("data inserted");
			preparedStatement.execute();

			System.out.println("to more data enter y");
			char ch = scanner.next().charAt(0);
			if (ch != 'y') {
				break;
			}
		}
	}

	private static void selectAll() throws SQLException {
		System.out.println("enter the id");

		int eid = Integer.parseInt(scanner.nextLine());

		String query = "select * from employee where id = " + eid;

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(query);

		if (resultset.next()) {
			int id = resultset.getInt("id");
			String name = resultset.getString("name");
			double sal = resultset.getDouble("sal");
			
			System.out.println("employee id:" +id);
			System.out.println("employee name:" +name);
			System.out.println("employee salary:" +sal);
		}
		else {
			System.out.println("no record found");
		}

	}
	
	
	private static void select() throws SQLException
	{
		
		String query = "select * from employee";

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(query);

		while(resultset.next())
		{
			int id = resultset.getInt("id");
			String name = resultset.getString("name");
			double sal = resultset.getDouble("sal");
			
			System.out.println("employee id:" +id);
			System.out.println("employee name:" +name);
			System.out.println("employee salary:" +sal);
		}
		

	}
	
	private static void deleteRecord() throws SQLException
	{
		System.out.println("enter the id to delete");
		int eid = Integer.parseInt(scanner.nextLine());
		
		String sql ="delete from employee where id =" +eid;
		
		Statement statement = connection.createStatement();
		int row =statement.executeUpdate(sql);
		if(row!=0)
		{
			System.out.println("record deleted");
		}
	}
	
	
      private static void update() throws SQLException 
      {
		
		System.out.println("Enter 1 to update Name");
		System.out.println("Enter 2 to update Salary");
		System.out.println("Enter 3 to update department");
		
		int choice = scanner.nextInt();
		
		System.out.println("enter id to update");
		int id = scanner.nextInt();
		
		Statement statement = connection.createStatement();
		
		switch (choice) {
		case 1: {
			
			String query = "update employee set name = ? where id = " + id;
	
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			System.out.println("Enter new name");
			preparedStatement.setString(1, scanner.next());
			
			preparedStatement.execute();
			
			System.out.println("Employee name updated...");
			
			break;
		}
		
		case 2: {
	
			String query = "update employee set sal = ? where id = " + id;
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			System.out.println("enter new salary");
			preparedStatement.setDouble(1, scanner.nextDouble());
			
			preparedStatement.execute();
			
			System.out.println("Salary updated...");
			
			break;
		}
		
		case 3: {
	
			String query = "update employee set dept = ? where id = " + id;

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			System.out.println("enter new department");
			preparedStatement.setString(1, scanner.next());
			
			preparedStatement.execute();
			
			System.out.println("Department updated...");
			
			break;
		}
		
		default:
			System.out.println("invalid choice !!");
		}
		
	}
}


