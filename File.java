package com.unimelb.swen30006.workshops;

import java.util.Date;

// Sample private file class to be replaced by your implementation
public class File {
    private Date createdDate;
    private String fileData;
    private String fileName;
    private static final int pdfNameLength = 4;

    public File(Date createdDate, String fileData, String fileName) {
        this.createdDate = createdDate;
        this.fileData = fileData;
        this.fileName = fileName;
    }

    public String fileType(){
        // double num = Math.random();
        // if(num<0.5){
        //     return "pdf";
        // } else {
        //     return "docx";
        // }

        int nameLength = fileName.length();

        if (fileName.indexOf(".") == nameLength - pdfNameLength) {
            return "pdf";
        } else {
            return "docx";
        }
    }

    public String content() {return this.fileData;}
    public int fileSize() {return this.fileData.length();}
}