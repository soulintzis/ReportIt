package org.ReportIt;


import java.time.LocalDate;

import static org.ReportIt.GeneratePassword.generateRandomPassword;

public class Employee {
    private String password;
    private String phone;
    private String address;
    private String email;
    private String department;
    private String role;
    private String fullName;
    private String username;
    private LocalDate employeeSince;

    public Employee(String address, String phone, String email, String department, String role, String fullName, String username) {
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.department = department;
        this.role = role;
        this.fullName = fullName;
        this.username = username;
        this.employeeSince = LocalDate.now();
        this.password=generateRandomPassword();
    }


    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getEmployeeSince() {
        return employeeSince;
    }

    public boolean comparePasswords(String password){
        if (this.password == password){
            return true;
        }
        return false;
    }
    static void addFields(String name , String surName){

    }

    public void printEmployeeInfo(){
        System.out.println("----------------<<Employee>>---------------");
        System.out.println("Address: " + this.address);
        System.out.println("Phone: " + this.phone);
        System.out.println("Email: " + this.email);
        System.out.println("Department: "+ this.department);
        System.out.println("Role: " + this.role);
        System.out.println("Full name: " + this.fullName);
        System.out.println("Username:" + this.username);
        System.out.println("Password:" + this.password);
        System.out.println("---------------<Employee End>--------------");
    }
}
