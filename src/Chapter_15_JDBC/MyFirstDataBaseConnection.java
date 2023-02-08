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
 *
 * --------------------------------------------------------------------------
 *      EXECUTING A PREPARESTATMENT - methods down
 *
 * SQL runnab;e by the execute methods          DELETE  INSERT  SELECT  UPDATE
 *
 *       ps.execute() = processing data           yes     yes     yes     yes
 *       ps.executeQuery() = reading Data         no      no      yes     no
 *      ps.executeUpdating() = modyfing Data      yes     yes     no      yes
 *
 * Returns types of execute methods      Return type  |  What is returned for SELECT |... DELETE / INSERT / UPDATE
 *      ps.execute()                        boolean          true                                   false
 *      ps.executeQuery()                ResultSet         Rows and columns returned            n/a
 *      ps.executeUpdating()                int               n/a                            Number of rows added/changed/removed
 * --------------------------------------------------------------------------
 */
public class MyFirstDataBaseConnection {


    public static void main(String[] args) {

        String url = "jdbc:hsqldb:filezoo";

        try(Connection conn = DriverManager.getConnection(url)) {
            PreparedStatement ps = conn.prepareStatement(
                    "SElECT name FROM exhibits");

            ResultSet rs = ps.executeQuery();

            while(rs.next())
                System.out.println(rs.getString(1));


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
