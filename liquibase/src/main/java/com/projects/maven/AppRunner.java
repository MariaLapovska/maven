package com.projects.maven;

import org.h2.Driver;

import java.sql.*;

/**
 * @author Mariia Lapovska
 */
public class AppRunner {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection c = DriverManager.getConnection("jdbc:h2:~/flowerbase");

        displayFlowers(c);
        c.close();
    }

    private static void displayFlowers(Connection c) throws SQLException {
        PreparedStatement ps = c.prepareStatement("SELECT id, flower_name, price FROM flower");
        ResultSet rs = ps.executeQuery();

        System.out.println("Flowers and colors:");

        while (rs.next()) {
            System.out.println("***");
            System.out.println("id: " + rs.getInt("id"));
            System.out.println("flower name: " + rs.getString("flower_name"));
            System.out.println("price: " + rs.getInt("price"));
            System.out.println("color: " + getFlowerColor(rs.getInt("id"), c));
        }

        System.out.println("***");
    }

    public static String getFlowerColor(int flowerId, Connection c) throws SQLException {
        PreparedStatement ps = c.prepareStatement("SELECT color_name FROM color WHERE flower_id = ?");
        ps.setInt(1, flowerId);
        ResultSet rs = ps.executeQuery();
        StringBuilder sb = new StringBuilder();

        while (rs.next()) {
            sb.append(rs.getString("color_name"));
        }

        return sb.toString();
    }
}
