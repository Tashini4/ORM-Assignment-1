package org.example;


import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Customer;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Save {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        FullName fullName = new FullName("Tashini","Madubhhani");

        Student student = new Student();
        student.setId(2);
        student.setName(fullName);
        student.setAddress("Gampha");

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Pathumi");
        customer.setAddress("Badugama");


        Transaction transaction = session.beginTransaction();
        session.save(customer);
        //session.save(student);
        transaction.commit();
        session.close();

    }
}