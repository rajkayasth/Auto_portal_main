package com.example.raj2.Adopter;

public class cars {

    String Car_name;
    String model;
    String price;
    String Last_Name;
    String Date_of_Register;
    String Gender;

    public String getCar_name() {
        return Car_name;
    }

    public void setCar_name(String car_name) {
        Car_name = car_name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getDate_of_Register() {
        return Date_of_Register;
    }

    public void setDate_of_Register(String date_of_Register) {
        Date_of_Register = date_of_Register;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public cars(String car_name, String model, String price, String last_Name, String date_of_Register, String gender) {
        Car_name = car_name;
        this.model = model;
        this.price = price;
        Last_Name = last_Name;
        Date_of_Register = date_of_Register;
        Gender = gender;
    }



}