package com.unimelb.swen30006.workshops;

import java.util.ArrayList;

public class Student extends Person {
    private String email;
    private String studentID;
    private ArrayList<Submission> submissions = new ArrayList<>() ;

    public void sendEmailMsgString(String msg) {
        System.out.println(msg);
    }

    public float totalGrade() {
        float total = 0;
        for (Submission sbm: submissions) {
            total += sbm.getGrade();
        }
        return total;
    }

    public String getEmail() {
        return email;
    }

    public String getStudentID() {
        return studentID;
    }

    public ArrayList<Submission> getSubmissions() {
        return submissions;
    }
}
