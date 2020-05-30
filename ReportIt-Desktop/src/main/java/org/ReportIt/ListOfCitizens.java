package org.ReportIt;
import java.util.ArrayList;

public class ListOfCitizens extends Problem.Citizen {
    public ListOfCitizens(String firstName, String lastName, String email, String username, String password) {
        super(firstName, lastName, email, username, password);
    }

    public static void main(String[] args) {
        ArrayList<Problem.Citizen> citizens = new ArrayList<Problem.Citizen>();
        for(int i=0; i<=getNumOfInstances(); i++) {
            //citizens.add(Citizen c);
            System.out.println(citizens);
        }
    }
}