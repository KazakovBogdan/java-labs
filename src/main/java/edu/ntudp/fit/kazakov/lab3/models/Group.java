package edu.ntudp.fit.kazakov.lab3.models;

import java.util.List;

public class Group {
    private String groupName;
    private Human headOfGroup;
    private List<Student> students;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setHeadOfGroup(Human headOfGroup) {
        this.headOfGroup = headOfGroup;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public Human getHeadOfGroup() {
        return headOfGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "groupName = '" + groupName + "\n" +
                "headOfGroup = " + headOfGroup + "\n" +
                "students = " + students + "\n";
    }
}