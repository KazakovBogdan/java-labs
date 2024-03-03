package edu.ntudp.fit.kazakov.lab3.models;


import java.util.List;

public class Faculty {
    private String facultyName;
    private Human headOfFacultyName;
    private List<Department> departments;

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setHeadOfFacultyName(Human headOfFacultyName) {
        this.headOfFacultyName = headOfFacultyName;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public Human getHeadOfFacultyName() {
        return headOfFacultyName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "facultyName = '" + facultyName + '\'' + "\n" +
                "headOfFacultyName = " + headOfFacultyName + "\n" +
                "departments = " + departments;
    }
}
