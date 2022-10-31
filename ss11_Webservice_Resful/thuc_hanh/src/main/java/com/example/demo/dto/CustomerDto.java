package com.example.demo.dto;

public class CustomerDto {
    private int id;
    private String firstName;
    private String LastName;

    public CustomerDto() {
    }

    public CustomerDto(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}