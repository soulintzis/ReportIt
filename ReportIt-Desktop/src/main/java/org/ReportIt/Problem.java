package org.ReportIt;

import java.time.LocalDateTime;

//type of problems = streetLight, trafficLight, pothole, garbageCan, recyclingGarbageCan, waterLeakage
//danger degrees Low, Medium, High
//problem status in_progress, completed


public class Problem {
    private String location;
    private String type;
    private String  dangerDegree;
    private String description; //optional
    private LocalDateTime time_date;
    private String status;

    public Problem(String loc, String type, String danger, String des){
        location = loc;
        this.type = type;
        dangerDegree = danger;
        description = des;
        description = des;
        status = "in_progress";
        time_date = LocalDateTime.now();
    }

    public void printObj(){
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);
        System.out.println("Danger degree: " + dangerDegree);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Date: " + time_date);
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public String getDangerDegree() {
        return dangerDegree;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTime_date() {
        return time_date;
    }

    public String getStatus() {
        return status;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDangerDegree(String dangerDegree) {
        this.dangerDegree = dangerDegree;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime_date(LocalDateTime time_date) {
        this.time_date = time_date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Citizen /*extends Problem*/{
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

    public static class CitizenSession {
    }
}
