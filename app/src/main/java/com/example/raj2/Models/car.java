package com.example.raj2.Models;

public class car {

    int company_id;

    String company ;

    public car(int company_id, String company) {
        this.company_id = company_id;
        this.company = company;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
