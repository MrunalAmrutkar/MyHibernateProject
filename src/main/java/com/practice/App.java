package com.practice;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.practice.Entity.Student;
import com.practice.Utility.HibernateUtility;
import org.hibernate.Transaction;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s = new Student();
        s.setId(2);
        s.setFname("Sakshi");
        s.setLname("Patil");
        s.setGender("male");
        s.setMobileno(904136549);
        s.setCity("Pune");
        
//        Student s1 = new Student();
//        s1.setId(3);
//        s1.setFname("Atharva");
//        s1.setLname("Amrutkar");
//        s1.setGender("male");
//        s1.setMobileno(784246549);
//        s1.setCity("amalner");
        
//        Student s2 = new Student();
//        s2.setId(4);
//        s2.setFname("Deva");
//        s2.setLname("Dhongada");
//        s2.setGender("male");
//        s2.setMobileno(78446549);
//        s2.setCity("Nashik");
//        
//        List<Student> studentlist = Arrays.asList(s,s1,s2);
        
        //1.session factory
       SessionFactory factory =  HibernateUtility.getSessionFactory();
       
       //2.session from session
        Session session = factory.openSession();
        
        //3.Transaction from session
        Transaction transaction = session.beginTransaction();
        //PART 1
        //to save single object
        //4.save process
        session.persist(s);
        //5.pass to database
        transaction.commit();
        
        //PART 2
        //to save list of student
//        for(Student stu :studentlist) {
//        	Transaction transaction = session.beginTransaction();
//        	session.persist(stu);
//        	transaction.commit();
//        }
        //6.session close
        session.close();
    }
}
