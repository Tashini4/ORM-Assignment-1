package org.example;


import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Customer;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GetData {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Student getStudent = session.get(Student.class,2);
        System.out.println("ID : " + getStudent.getId());
        System.out.println("Address : " + getStudent.getAddress());

       /* Customer getCustomer = session.get(Customer.class,1);
        System.out.println("ID :" + getCustomer.getId());
        System.out.println("Address : " + getCustomer.getAddress());*/

        transaction.commit();
        session.close();


    }
}