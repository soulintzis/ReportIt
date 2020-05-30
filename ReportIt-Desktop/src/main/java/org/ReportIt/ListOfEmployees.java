package org.ReportIt;

import java.util.ArrayList;

public class ListOfEmployees extends Employee {


    public ListOfEmployees(String address, String phone, String telephone, String department, String role, String firstName, String lastName) {
        super(address, phone, telephone, department, role, firstName, lastName);
    }

    public static void main(String[] args) {
        ArrayList<Employee> citizens = new ArrayList<Employee>();
        for(int i=0; i<=getNumOfInstances(); i++) {
            Employee.add(Employee_e);
            System.out.println(citizens);
        }
    }
}
