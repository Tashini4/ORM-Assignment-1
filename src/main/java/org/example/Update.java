package org.example;


import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Tashini","Madubhani");

        Student student = new Student();
        student.setId(2);
        student.setName(fullName);
        student.setAddress("Mathugama");

        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
        session.close();

    }
}