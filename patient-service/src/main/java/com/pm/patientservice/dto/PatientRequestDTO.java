package com.pm.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {

    @NotBlank (message = "Cannot Leave Name Blank")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String Name;

    @NotBlank (message="Cannot Leave Email Blank")
    @Email (message = "Please add a valid Email")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message ="Date of Birth is required")
    private String dateOfBirth;

    @NotBlank(message ="Registered Date is required")
    private String registeredDate;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
