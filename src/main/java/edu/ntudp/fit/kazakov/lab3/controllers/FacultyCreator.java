package edu.ntudp.fit.kazakov.lab3.controllers;

import edu.ntudp.fit.kazakov.lab3.models.Department;
import edu.ntudp.fit.kazakov.lab3.models.Faculty;
import edu.ntudp.fit.kazakov.lab3.models.Human;

import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(List<Department> departments, String facultyName, Human headOfFacultyName) {
        Faculty newFaculty = new Faculty();
        newFaculty.setDepartments(departments);
        newFaculty.setFacultyName(facultyName);
        newFaculty.setHeadOfFacultyName(headOfFacultyName);
        return newFaculty;
    }
}