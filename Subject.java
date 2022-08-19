package com.unimelb.swen30006.workshops;

import java.util.*;

public class Subject {
    private String name;
    private String subjectCode;
    private ArrayList<Assignment> assignments = new ArrayList<>();

    public void createAssignment(String description, Date dueDate, int maxAttempts, String name) {
        Assignment newAssignment = new Assignment(description, dueDate, maxAttempts, name);
        assignments.add(newAssignment);
    }

    public void deleteAssignment(String assignment) {
        assignments.remove(assignment);
        assignments.trimToSize();
    }

    public String getName() {
        return name;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }
}
