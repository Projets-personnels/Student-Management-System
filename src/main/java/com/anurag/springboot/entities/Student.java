package com.anurag.springboot.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "roll")
    private String roll;

    public Student() {
    }

    public Student( String firstName, String lastName, String roll) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roll = roll;
    }

    public long getId() {
        return id;
    }

    public Student setId(long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getRoll() {
        return roll;
    }

    public Student setRoll(String roll) {
        this.roll = roll;
        return this;
    }
}
