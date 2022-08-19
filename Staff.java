package com.unimelb.swen30006.workshops;

import java.util.ArrayList;

public class Staff extends Person {
    private ArrayList<String> roles = new ArrayList<>();
    private String staffID;
    private ArrayList<Subject> subjects = new ArrayList<>();

    public Staff(ArrayList<String> roles, String staffID, ArrayList<Subject> subjects) {
        this.roles = roles;
        this.staffID = staffID;
        this.subjects = subjects;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public String getStaffID() {
        return staffID;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
}
