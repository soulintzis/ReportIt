package org.ReportIt;

import java.time.LocalDate;

public class Citizen {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String username;
    private LocalDate memberSince;

    //Citizen Constructor
    public Citizen(String firstName,String lastName,String email, String username,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        printInfoCitizen();
        this.memberSince = LocalDate.now();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    // put them in userface
//    public static boolean isEmailValid(String email)
//    {
//        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
//                "[a-zA-Z0-9_+&*-]+)*@" +
//                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//                "A-Z]{2,7}$";
//
//        Pattern pat = Pattern.compile(emailRegex);
//        if (email == null)
//            return false;
//        return pat.matcher(email).matches();
//    }
//
//    public static boolean isPasswordValid(String email)
//    {
//        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$";
//
//        Pattern pat = Pattern.compile(passwordRegex);
//        if (password == null)
//            return false;
//        return pat.matcher(password).matches();
//    }
    public boolean comparePasswords(String password){
        if (this.password == password){
            return true;
        }
        return false;
    }

    public boolean checkIfOwner(/*Problem m*/){
        return true;
    }


    private boolean checkOldPassword(String password){

    }

    public void printInfoCitizen(){
        System.out.println("Firstname: " +this.firstName);
        System.out.println("Lastname: " +this.lastName);
        System.out.println("Email: " +this.email);
        System.out.println("Password: " +this.password);
        System.out.println("Username: " +this.username);
    }

}
