package edu.ntudp.fit.kazakov.lab3.controllers;

import edu.ntudp.fit.kazakov.lab3.models.Department;
import edu.ntudp.fit.kazakov.lab3.models.Group;
import edu.ntudp.fit.kazakov.lab3.models.Human;

import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(List<Group> groups, String departmentName, Human headOfDepartmentName) {
        Department newDepartment = new Department();
        newDepartment.setGroups(groups);
        newDepartment.setDepartmentName(departmentName);
        newDepartment.setHeadOfDepartmentName(headOfDepartmentName);
        return newDepartment;
    }
}