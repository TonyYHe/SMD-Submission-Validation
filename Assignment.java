package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;
    private ArrayList<Submission> submissions = new ArrayList<>();

    public Submission[] invalidSubmissions() {
        Submission[] invalids = new Submission[submissions.size()];
        int nInvalid = 0;

        SampleValidator SV = new SampleValidator();
        for (Submission s : submissions) {
            if (SV.validateSubmission(s) != null) {
                invalids[nInvalid++] = s;
            }
        }
        return invalids;
    }

    public Submission[] validSubmission() {
        Submission[] valids = new Submission[submissions.size()];
        int nValid = 0;

        SampleValidator SV = new SampleValidator();
        for (Submission s : submissions) {
            if (SV.validateSubmission(s) == null) {
                valids[nValid++] = s;
            }
        }
        return valids;
    }

}
