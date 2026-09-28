package org.ranganatha;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_age")
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return this.name+" "+this.id+" "+this.age;
    }
}