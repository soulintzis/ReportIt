package org.ReportIt;
import java.util.ArrayList;

public class ListOfCitizens {
    static ArrayList<Citizen> citizens = new ArrayList<Citizen>();

    public static Citizen addCitizen(String firstName,String lastName,String email, String username,String password){
        citizens.add(new Citizen(firstName, lastName, email, username, password));
        System.out.println("Citizen added successfully");
        int last_item_pos = citizens.size() - 1;
        Citizen Citizen = citizens.get(last_item_pos);
        return Citizen;
    }

    public static void printCitizens() {
        for (Citizen str : citizens) {
            str.printInfoCitizen();
        }
    }
}