package com.example.java;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/University";
        String uname = "root";
        String password = "1Knickstape!";
        String query = "select * from EngineeringStudents";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            Connection con = DriverManager.getConnection(url, uname, password);
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                String UniversityData = "";
                for (int i = 1; i <= 6 ; i++) {
                    UniversityData += result.getString(i) + ":";
                }
                System.out.println(UniversityData);
            }
            
        }
        catch (SQLException e){
            e.printStackTrace();
        }



    }
}
