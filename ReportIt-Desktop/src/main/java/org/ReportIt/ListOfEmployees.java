package org.ReportIt;

import java.util.ArrayList;

public class ListOfEmployees {
    static ArrayList<Employee> employee = new ArrayList<Employee>();
    public static void addEmployee(String password, String phone, String address, String telephone,String department,String role,String firstName,String lastName){
        employee.add(new Employee(password,phone , telephone, address,department,role,firstName,lastName));
        System.out.println("Employee added !!!");
    }

    static boolean isUnique() {

        return false;
    }

//        public static Employee printProblems(){
//            for(Employee str: employee){
////                System.out.println(str.getLocation());
//                Employee  = str;
//                return pro;
//            }
//            return null;
//        }

    static boolean checkIfMatch(){

        return false;
    }


}
