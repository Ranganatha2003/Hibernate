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
        Student student = new Student();

        student.setName("Ravi");
        student.setAge(24);

        s.persist(student);
        t.commit();
        System.out.println("done");
        s.close();
        ses.close();
    }
}
