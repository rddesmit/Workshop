package com.workshop.main;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Rudie on 15-3-14.
 */
public class Database {

    private Connection connection;

    public void connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.connection = java.sql.DriverManager.getConnection("jdbc:sqlserver://145.24.222.155:8001;databaseName=Peercoach", "0863401", "Y2dBBa6");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(String table, String column, String data) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO " + table + " (" + column + ") VALUES ('" + data + "')");
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
