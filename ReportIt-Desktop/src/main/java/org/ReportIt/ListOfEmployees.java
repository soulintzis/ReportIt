package org.ReportIt;
import java.util.ArrayList;

public class ListOfEmployees{
    static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static Employee addEmployee(String password, String address, String phone, String telephone, String department, String role, String firstName, String lastName){
        employees.add(new Employee(password, address, phone, telephone, department, role, firstName, lastName));
        System.out.println("Employee added successfully");
        int last_item_pos = employees.size() - 1;
        Employee Employee = employees.get(last_item_pos);
        return Employee;
    }

    public static void printCitizens(){
        for(Employee str: employees){
            str.printInfoEmployee();
        }
    }

}
