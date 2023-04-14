package org.example;

import db.equipment.EquipmentKind;
import db.equipment.Imm;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.*;

public class Main {

    private static Connection connection;

    public static void main(String[] args) throws SQLException {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
/*
        EquipmentKind equipmentK =new EquipmentKind();
        equipmentK.setKindCode("01");
        equipmentK.setKindName("Станок/Линия");

        session.save(equipmentK);
*/
        t.commit();
        System.out.println("successfully saved");
        factory.close();
        session.close();

        /*
        try {
            openDatabaseConnection();
            deleteData("%");
            readData();
            createData("Java", 10);
            createData("JavaScript", 8);
            createData("C++", 6);
            readData();
            updateData("C++", 4);
            readData();
            deleteData("C++");
        } finally {
            closeDatabaseConnection();
        }
        */
        Imm imm = new Imm();
        System.out.println("Hello world!");
    }

    private static void createData(String name, int rating) throws SQLException {
        System.out.println("Creating data ...");
        int rowsInserted;
        try (PreparedStatement statement = connection.prepareStatement("""
                INSERT INTO lang (name, rating)
                VALUES (?, ?) 
                """)) {
            statement.setString(1, name);
            statement.setInt(2, rating);
            rowsInserted = statement.executeUpdate();
        }
        System.out.println("Rows inserted: " + rowsInserted);
    }

    private static void readData() throws SQLException {
        System.out.println("Reading data...");
        try (PreparedStatement statement = connection.prepareStatement("""
                SELECT *
                FROM lang
                ORDER BY rating DESC
                """)) {
            ResultSet resultSet = statement.executeQuery();
            boolean empty = true;
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int rating = resultSet.getInt(1);
                System.out.println("\t> " + name + ": " + rating);
                empty = false;
            }
            if(empty){
                System.out.println("No data");
            }
        }

    }

    private static void updateData(String name, int newRating) throws SQLException {
        System.out.println("Updating data ...");
        int rowUpadted;
        try (PreparedStatement statement = connection.prepareStatement("""
                UPDATE lang
                SET rating = ?
                WHERE name = ?
                """)) {
            statement.setString(2, name);
            statement.setInt(1, newRating);
            rowUpadted = statement.executeUpdate();
        }
        System.out.println("Rows updated: " + rowUpadted);
    }

    private static void deleteData(String nameExpression) throws SQLException {
        System.out.println("Deleting data ...");
        int rowsDeleted;
        try (PreparedStatement statement = connection.prepareStatement("""
                DELETE FROM lang 
                WHERE name LIKE ?
                """)) {
            statement.setString(1, nameExpression);
            rowsDeleted = statement.executeUpdate();
        }
        System.out.println("Rows deleted: " + rowsDeleted);
    }

    private static void openDatabaseConnection() throws SQLException {
        System.out.println("Connecting to the database ...");
        connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/production",
                "root", "VenaJa4$"
        );
        System.out.println("Connection valid: " + connection.isValid(5));
    }

    private static void closeDatabaseConnection() throws SQLException {
        System.out.println("Closing database connection ...");
        connection.close();
        System.out.println("Connection closed: " + connection.isValid(5));
    }
}