package org.ranganatha;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration conf=new Configuration();
        conf.configure();
        conf.addAnnotatedClass(Student.class);
        SessionFactory ses=conf.buildSessionFactory();
        Session s=ses.openSession();
        Transaction t=s.beginTransaction();
        Student s1=new Student();
        s1.setId(1);
        s1.setAge(20);
        s1.setName("Ranga");
        s.persist(s1);
        t.commit();
        s.close();
        ses.close();
    }
}
