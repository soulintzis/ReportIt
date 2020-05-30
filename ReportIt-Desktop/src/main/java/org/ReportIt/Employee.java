package org.ReportIt;


import static org.ReportIt.GeneratePassword.generateRandomPassword;

public class Employee {
    private String password;
    private  String phone;
    private String address;
    private  String telephone;
    private String department;
    private String role;
    private String firstName;
    private String lastName;

    public Employee(String address, String phone, String telephone, String department, String role, String firstName, String lastName) {
        this.address = address;
        this.phone = phone;
        this.telephone = telephone;
        this.department = department;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password= generateRandomPassword();
        printInfoEmployee();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean comparePasswords(String password){
        if (this.password == password){
            return true;
        }
        return false;
    }
    static void addFields(String name , String surName){

    }
    public void printInfoEmployee(){
        System.out.println("Address: " + this.address);
        System.out.println("Phone: " + this.phone);
        System.out.println("Telephone: " + this.telephone);
        System.out.println("Department: "+ this.department);
        System.out.println("Role: " + this.role);
        System.out.println("FirstName: " + this.firstName);
        System.out.println("LastName:" + this.lastName);
        System.out.println("Password:" + this.password);
    }

}
