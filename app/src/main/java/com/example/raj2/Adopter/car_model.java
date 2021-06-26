package com.example.raj2.Adopter;


public class car_model {

    public String getCourse_model() {
        return course_model;
    }

    public void setCourse_model(String course_model) {
        this.course_model = course_model;
    }

    public int getModel_image() {
        return model_image;
    }

    public void setModel_image(int model_image) {
        this.model_image = model_image;
    }

    public int getCom_image() {
        return com_image;
    }

    public void setCom_image(int com_image) {
        this.com_image = com_image;
    }

    public car_model(String course_model, int model_image, int com_image) {
        this.course_model = course_model;
        this.model_image = model_image;
        this.com_image = com_image;
    }

    private String course_model;
    private int model_image;
    private int com_image;
}


