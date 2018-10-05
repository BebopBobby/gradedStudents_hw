package gstudents;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    public ArrayList<Double> examscores;

    public Student(String firstName, String lastName, ArrayList<Double> testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examscores = testScores;
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

    public double getNumberOfExamsTaken(){
        return examscores.size();
    }

    public String getExamScores(){
        for (double x:examscores) {
            System.out.println("exam " + x + " -> " + examscores[x]);
        }
        return null;
    }

    public double addExamScore(double examScore){
        
    }
}
