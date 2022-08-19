package com.unimelb.swen30006.workshops;

import java.util.Date;

// Sample private submission class to be replaced by your implementation
class Submission {
    // Return two fake files
    private int attemptNum;
    private File[] file;
    private int numFiles;
    private int grade;

    public Submission(int attemptNum, File[] file, int numFiles, int grade) {
        this.attemptNum = attemptNum;
        this.file = file;
        this.numFiles = numFiles;
        this.grade = grade;
    }

    public int getAttemptNum() {
        return attemptNum;
    }

    public int getNumFiles() {
        return numFiles;
    }

    public File[] getFile() {
        return file;
    }

    public int getGrade() {
        return grade;
    }

    public File[] includedFiles() {
        // ideally there should be a separate method to add file in this class, but we are just testing here
        File[] files = new File[2];
        files[0] = new File(new Date(), "Hello", "test1.txt");
        files[1] = new File(new Date(), "World", "test2.pdf");
        return files;
    }
}
