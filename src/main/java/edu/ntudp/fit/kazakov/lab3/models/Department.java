package edu.ntudp.fit.kazakov.lab3.models;

import java.util.List;

public class Department {
    private String departmentName;
    private Human headOfDepartmentName;
    private List<Group> groups;


    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setHeadOfDepartmentName(Human headOfDepartmentName) {
        this.headOfDepartmentName = headOfDepartmentName;
    }


    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Human getHeadOfDepartmentName() {
        return headOfDepartmentName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "departmentName = '" + departmentName + '\'' + "\n" +
                "headOfDepartmentName = " + headOfDepartmentName + "\n" +
                "groups = " + groups;
    }
}