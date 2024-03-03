package edu.ntudp.fit.kazakov.lab3.controllers;

import edu.ntudp.fit.kazakov.lab3.models.Group;
import edu.ntudp.fit.kazakov.lab3.models.Human;
import edu.ntudp.fit.kazakov.lab3.models.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(List<Student> students, String groupName, Human headOfGroupName) {
        Group newGroup = new Group();
        newGroup.setStudents(students);
        newGroup.setGroupName(groupName);
        newGroup.setHeadOfGroup(headOfGroupName);
        return newGroup;
    }
}