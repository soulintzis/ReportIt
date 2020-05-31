package org.ReportIt;
import java.util.ArrayList;

public class ListOfEmployees{
    static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static Employee addEmployee(String password, String address, String phone, String email, String department, String role, String fullName, String username){
        employees.add(new Employee(password, address, phone, email, department, role, fullName, username));
        System.out.println("Employee added successfully");
        int last_item_pos = employees.size() - 1;
        Employee Employee = employees.get(last_item_pos);
        return Employee;
    }

    public static void printEmployees(){
        for(Employee str: employees){
            str.printEmployeeInfo();
        }
    }

    public static boolean checkIfMatch(Employee employee){
        int occurences = 0;
        for(Employee employee_obj: employees){
            if(employee_obj.equals(employee)){
                occurences++;
            }
        }
        if (occurences > 1){
            return true;
        }
        return false;
    }


    public static int getListSize(){
        return employees.size();
    }

    public static Employee getEmployee(int index) {
        Employee emp = employees.get(index);
        return emp;
    }

    public static int findEmployeeIndex(Employee employee){
        int index = -1;
        for (int i=0; i< employees.size(); i++) {
            if(employee.equals(employees.get(i))){
                index = i;
                break;
            }
        }
        return index;
    }
}
