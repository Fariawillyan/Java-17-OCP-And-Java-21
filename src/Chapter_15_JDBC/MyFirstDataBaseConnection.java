package Chapter_15_JDBC;


//all database are in the package java.sql

import java.sql.*;

/**
 *
 * You need know 5 key interfaces of jdbc
 *
 * 1 Driver: Establishes a connection to the database
 * 2 Connection: Sends commands to a database
 * 3 PreparedStatement : Execute a SQL query
 * 4 callableStatment: Executes commands stored in the database
 * 5 ResultSet: Reads the result of query
 */
public class MyFirstDataBaseConnection {


    public static void main(String[] args) {

        String url = "jdbc:hsqldb:filezoo";

        try(Connection conn = DriverManager.getConnection(url)) {
            PreparedStatement ps = conn.prepareStatement(
                    "SElECT name FROM exhibits");

            ResultSet rs = ps.executeQuery();

            while(rs.next())
                System.out.println(rs.getString(1));;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
