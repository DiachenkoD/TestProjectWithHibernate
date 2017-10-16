package com.level.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "user")

public class User {
    private long idUser;
    private String School_of;
    private String lastName;
    private String firstName;
    private long age;

    public User() {
        School_of = null;
    }


    public User(String School_of, String firstName, String lastName, long age) {
        this.School_of = School_of;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "idUser")
    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Column (name = "School_of")
    public String getSchool_of() {
        return School_of;
    }

    public void setSchool_of(String department) {
        this.School_of = department;
    }

    @Column (name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column (name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Column(name = "age")
    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "User{" +
                "idUser =" + idUser +
                ", School_of ='" + School_of + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", firstName ='" + firstName + '\'' +
                ", age = " + '\'' +
                '}';
    }
}
