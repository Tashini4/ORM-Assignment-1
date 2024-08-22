package org.example;


import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Customer;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Nipun","Prabushitha");

        Student student = new Student();
        student.setId(4);
        student.setName(fullName);
        student.setAddress("Gampha");

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Pathumi");
        customer.setAddress("Badugama");

        Transaction transaction = session.beginTransaction();
       // session.delete(student);
        session.delete(customer);
        transaction.commit();
        session.close();

    }
}