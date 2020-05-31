package org.ReportIt;

import java.util.ArrayList;

public class ListOfProblems {
    static ArrayList<Problem> problems = new ArrayList<Problem>();

    public static Problem addProblem(String location, String type, String dangerDegr, String desc){
        problems.add(new Problem(location, type, dangerDegr, desc));
        System.out.println("Problem added successfully");
        int last_item_pos = problems.size() - 1;
        Problem Problem = problems.get(last_item_pos);
        return Problem;
    }

    public static void printProblems(){
        for(Problem str: problems){
            str.printObj();
        }
    }

    public static boolean checkIfMatch(Problem problem){
        int occurences = 0;
        for(Problem problem_obj: problems){
            if(problem_obj.getLocation() == problem.getLocation() &&
                    problem_obj.getStatus() == problem.getStatus() &
                    problem_obj.getType() == problem.getType()){
                occurences++;
            }
        }
        System.out.println(occurences);
        if (occurences >= 1){
            return true;
        }
        return false;
    }

    public static ArrayList<Problem> findProblemByLocation(){
        ArrayList<Problem> matchedProblems = new ArrayList<Problem>();

        return matchedProblems;
    }

    public static ArrayList<Problem> findProblemByType(){
        ArrayList<Problem> matchedProblems = new ArrayList<Problem>();

        return matchedProblems;
    }

    public static int findProblemIndex(Problem problem){
        int index = -1;
        for (int i=0; i< problems.size(); i++) {
            if(problem.equals(problems.get(i))){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void deleteProblem(Problem problem){
        int indexOfProblem = findProblemIndex(problem);
        problems.remove(indexOfProblem);
        System.out.println("Problem removed");
    }

    public static int getListSize(){
        return problems.size();
    }

    public static Problem getProblem(int index) {
        Problem Problem = problems.get(index);
        return Problem;
    }

}
