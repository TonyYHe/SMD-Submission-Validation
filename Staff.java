package com.unimelb.swen30006.workshops;

import java.util.ArrayList;

public class Staff extends Person {
    private String roles[];
    private String staffID;
    private ArrayList<Subject> subjects = new ArrayList<>();

    public String[] getRoles() {
        return roles;
    }

    public String getStaffID() {
        return staffID;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
}
