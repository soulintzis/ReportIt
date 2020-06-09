package org.ReportIt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        System.out.println(App.class);
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
//        Citizen citizen1 = new Citizen("Soulintzss Evaggelos", "soulintzhs@gmail.com", "vagos", "1234");
//        CitizenSession session = new CitizenSession(citizen1);
//        session.printCitizenSession();
//        Problem problem1 = ListOfProblems.addProblem("Swmerset 103", "streetLight", "Medium", "Just another problem", citizen1);
//
//        Employee employee1 = ListOfEmployees.addEmployee("Maizonos 102", "2610323832", "ioannou@gmail.com", "random", "manager", "Ioannou Dimitris", "dIoannou");
//        EmployeeSession empSession = new EmployeeSession(employee1);
//        empSession.printEmployeeSession();
//        ListOfEmployees.printEmployees();
//        launch();

//        ListOfProblems.deleteProblem(problem1)
//
        int selection = -1;
        System.out.println("1- Add Employee");
        System.out.println("2- Add Citizen");
        System.out.println("3- Login Employee");
        System.out.println("4- Login Citizen");
        System.out.println("5- Logout");
        System.out.println("6- Exit");

        Scanner scanner = new Scanner(System.in);
        while (selection != 6) {
            System.out.println("Enter Selection: ");
            String num = scanner.nextLine();
            selection = Integer.parseInt(num);
            switch (selection) {
                case 1:
                    System.out.println("Fullname: ");
                    String fullname = scanner.nextLine();
                    System.out.println("Username: ");
                    String username = scanner.nextLine();
                    System.out.println("E-mail: ");
                    String email = scanner.nextLine();
                    System.out.println("Address: ");
                    String address = scanner.nextLine();
                    System.out.println("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.println("Departmentt: ");
                    String dep = scanner.nextLine();
                    System.out.println("Role: ");
                    String role = scanner.nextLine();
                    Employee employee = ListOfEmployees.addEmployee(address, phone, email, dep, role, fullname, username);
                    System.out.println("Do you want to print Employees's info?[y/n]");
                    String print = scanner.nextLine();
                    if (print.equals("y") || print.equals("Y")) {
                        employee.printEmployeeInfo();
                    }
                    break;
                case 2:
                    System.out.println("Fullname: ");
                    String fullname_cit = scanner.nextLine();
                    System.out.println("Username: ");
                    String username_cit = scanner.nextLine();
                    System.out.println("E-mail: ");
                    String email_cit = scanner.nextLine();
                    System.out.println("Password: ");
                    String password = scanner.nextLine();
                    Citizen citizen = ListOfCitizens.addCitizen(fullname_cit, email_cit, username_cit, password);
                    System.out.println("Do you want to print Citizen's info?[y/n]");
                    String print_cit = scanner.nextLine();
                    if (print_cit.equals("y") || print_cit.equals("Y")) {
                        citizen.printInfoCitizen();
                    }
                    break;
                case 3:
                    boolean correct = true;
                    Employee loged_in_emp = null;
                    EmployeeSession employeeSession = null;
                    while (correct) {
                        System.out.println("Username: ");
                        String usr = scanner.nextLine();
                        System.out.println("Password: ");
                        String pass = scanner.nextLine();
                        loged_in_emp = ListOfEmployees.login(usr, pass);
                        if (loged_in_emp != null) {
                            employeeSession = new EmployeeSession(loged_in_emp);
                            employeeSession.printEmployeeSession();
                            correct = false;
                        } else {
                            System.out.println("Please enter the correct credentials");
                        }
                    }
                    boolean menu_on_emp = true;
                    while (menu_on_emp) {
                        Problem problem = null;
                        System.out.println("1- View all problems ");
                        System.out.println("2- View Profile ");
                        System.out.println("3- Logout");
                        String inner_selection = scanner.nextLine();
                        switch (Integer.parseInt(inner_selection)) {
                            case 1:
                                ListOfProblems.printProblems();
                                System.out.println("Select a problem: (Exit with -1");
                                String selected_problem = scanner.nextLine();
                                if (selected_problem.equals("-1")){
                                    break;
                                }
                                problem = ListOfProblems.getProblem(Integer.parseInt(selected_problem));
                                boolean sub_menu_on_emp = true;
                                while (sub_menu_on_emp != false) {
                                    System.out.println("1- Add comment");
                                    System.out.println("2- Print comments");
                                    System.out.println("3- Delete Problem");
                                    System.out.println("4- Exit Submenu");
                                    String action = scanner.nextLine();
                                    switch (Integer.parseInt(action)) {
                                        case 1:
                                            System.out.println("Comment Text: ");
                                            String text = scanner.nextLine();
                                            problem.addComment(text, loged_in_emp.getUsername());
                                            break;
                                        case 2:
                                            problem.printComments();
                                            break;
                                        case 3:
                                            ListOfProblems.deleteProblem(problem);
                                            sub_menu_on_emp = false;
                                            break;
                                        default:
                                            loged_in_emp = null;
                                            employeeSession = null;
                                            sub_menu_on_emp = false;
                                    }
                                }
                                break;
                            case 2:
                                loged_in_emp.printEmployeeInfo();
                                System.out.println("Do you want to change password? [y/n]");
                                String pass_change = scanner.nextLine();
                                if (pass_change.equals("y") || pass_change.equals("Y")){
//                                    TODO: Add functionality
                                    break;
                                }
                                break;
                            default:
                                loged_in_emp = null;
                                employeeSession = null;
                                menu_on_emp = false;
                        }
                    }
                    break;
                case 4:
                    boolean correct_cred = true;
                    CitizenSession citizenSession = null;
                    Citizen loged_in_cit = null;

                    while (correct_cred) {
                        System.out.println("Username: ");
                        String usr = scanner.nextLine();
                        System.out.println("Password: ");
                        String pass = scanner.nextLine();
                        loged_in_cit = ListOfCitizens.login(usr, pass);
                        if (loged_in_cit != null) {
                            citizenSession = new CitizenSession(loged_in_cit);
                            citizenSession.printCitizenSession();
                            correct_cred = false;
                        } else {
                            System.out.println("Please enter the correct credentials");
                        }
                    }
                    boolean menu_on = true;
                    while (menu_on) {
                        System.out.println("1- Add Problem");
                        System.out.println("2- View all problems ");
                        System.out.println("3- Logout");
                        String inner_selection = scanner.nextLine();
                        switch (Integer.parseInt(inner_selection)) {
                            case 1:
                                Problem problem = null;
                                System.out.println("Location: ");
                                String location = scanner.nextLine();
                                System.out.println("1- Street Light out of order");
                                System.out.println("2- Problem on the road / sidewalk");
                                System.out.println("3- Water supply pipe leak");
                                System.out.println("4- Other");
                                String type_s = scanner.nextLine();
                                int type = Integer.parseInt(type_s);
                                switch (type) {
                                    case 1:
                                        type_s = "Street Light out of order";
                                        break;
                                    case 2:
                                        type_s = "Problem on the road / sidewalk";
                                        break;
                                    case 3:
                                        type_s = "Water supply pipe leak";
                                        break;
                                    default:
                                        System.out.println("Write the type of problem: ");
                                        type_s = scanner.nextLine();
                                }
                                System.out.println("1- Low");
                                System.out.println("2- Medium");
                                System.out.println("3- High");
                                String danger_s = scanner.nextLine();
                                int danger = Integer.parseInt(danger_s);
                                switch (danger) {
                                    case 1:
                                        danger_s = "Low";
                                        break;
                                    case 2:
                                        danger_s = "Medium";
                                        break;
                                    case 3:
                                        danger_s = "High";
                                        break;
                                    default:
                                        System.out.println("Please select a valid number");
                                }
                                System.out.println("Description: ");
                                String desc = scanner.nextLine();
                                if (citizenSession.checkForTimeout()) {
                                    problem = ListOfProblems.addProblem(location, type_s, danger_s, desc, loged_in_cit);
                                }
                                break;
                            case 2:
                                ListOfProblems.printProblems();
                                System.out.println("Select a problem: (Exit with -1");
                                String selected_problem = scanner.nextLine();
                                if (selected_problem.equals("-1")){
                                    break;
                                }
                                problem = ListOfProblems.getProblem(Integer.parseInt(selected_problem));
                                boolean sub_menu_on = true;
                                while (sub_menu_on != false) {
                                    System.out.println("1- Add comment");
                                    System.out.println("2- Print comments");
                                    System.out.println("3- Delete Problem");
                                    System.out.println("4- Exit Submenu");
                                    String action = scanner.nextLine();
                                    switch (Integer.parseInt(action)) {
                                        case 1:
                                            System.out.println("Comment Text: ");
                                            String text = scanner.nextLine();
                                            problem.addComment(text, loged_in_cit.getUsername());
                                            break;
                                        case 2:
                                            problem.printComments();
                                            break;
                                        case 3:
                                            ListOfProblems.deleteProblem(problem);
                                            sub_menu_on = false;
                                            break;
                                        default:
                                            loged_in_cit = null;
                                            citizenSession = null;
                                            sub_menu_on = false;
                                    }
                                }
                                break;
                            default:
                                menu_on = false;
                        }
                    }
                    break;

                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Select a number between 1 to 12");
            }
        }
        ListOfProblems.printProblems();
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("views/PreLoginPage"));
        stage.setScene(scene);
        stage.show();
    }


}
