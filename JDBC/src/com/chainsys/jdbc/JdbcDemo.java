package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		show();

		delete(3504);
		insertValues(3507,"venkash",80, 10,350,"A", "Sachinnathan");

	}
	
	public static Connection getConnections() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/student_management";
		String userName = "root";
		String password = "mani1952001";
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println(con);
		return con;
	}
	public static void show() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from student";
		Connection con = getConnections();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s\n", "RollNo", "Student Name", "Attendence","Student Rank","Total","Standard","Student Class","Mentor Name");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				// if (i > 1) System.out.print(", ");
				String columnValue = rs.getString(i);
				
				System.out.printf("%15s",columnValue);
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

		con.close();

	}
	// Java Program to Update contents in a table

	public static void update() throws SQLException {
		Connection con = getConnections();
		String query = "update student set studentName='SasiKala' where rollNo=3500";
		PreparedStatement p = con.prepareStatement(query);
		System.out.println("Updated");
		p.execute();
		con.close();
	}

	public static void delete(int id) throws SQLException {
		Connection connection = getConnections();
		String query = "delete from student where rollNo=?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, id);
		boolean execute = statement.execute();
		if (execute) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}

	public static void insertValues(int rollNo, String studentName, int atttendence, int studentRank, int total,
			String studentClass, String mentorName) throws SQLException {
		Connection connection = getConnections();
		String query = "insert into Student values(?,?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, rollNo);
		statement.setString(2, studentName);
		statement.setInt(3, atttendence);
		statement.setInt(4, studentRank);
		statement.setInt(5, total);
		statement.setString(6, studentClass);
		statement.setString(7, mentorName);
		statement.execute();
		System.out.println("Inserted");
		connection.close();
	}

}
