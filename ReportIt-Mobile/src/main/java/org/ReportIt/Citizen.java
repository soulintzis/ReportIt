package org.ReportIt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Citizen /*extends Problem*/{
    private static int counter;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String username;

    //Citizen Constructor
    public Citizen(String firstName,String lastName,String email, String username,String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        printInfoCitizen();

        counter++;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public static int getNumOfInstances() {
        return counter;
    }

    public void printInfoCitizen(){
        System.out.println("Firstname: " +this.firstName);
        System.out.println("Lastname: " +this.lastName);
        System.out.println("Email: " +this.email);
        System.out.println("Password: " +this.password);
        System.out.println("Username: " +this.username);
    }

}


