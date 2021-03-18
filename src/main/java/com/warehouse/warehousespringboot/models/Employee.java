package com.warehouse.warehousespringboot.models;




public class Employee {

    private int id;


    private String name;


    private String surname;


    private String password;


    private int phoneNumber;

    private int position;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Employee(int id, String name, String surname, String password, int phoneNumber, int position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", position=" + position +
                '}';
    }
}
