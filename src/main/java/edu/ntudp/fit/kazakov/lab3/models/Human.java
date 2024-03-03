package edu.ntudp.fit.kazakov.lab3.models;

public class Human {
    private String lastName;
    private String firstName;
    private String patronymicName;
    private Sex sex;

    public Human(String lastName, String firstName, String patronymicName, Sex sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.sex = sex;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", sex=" + sex;
    }
}