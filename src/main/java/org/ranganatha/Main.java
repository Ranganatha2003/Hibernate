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


        Student f=s.find(Student.class,1);
        s.remove(f);
        t.commit();
        System.out.println(f);
        s.close();
        ses.close();
    }
}
