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

    public void getExamScores(){
        for (double x:examscores) {
            System.out.println("exam " + x + " -> " + examscores.toArray());
        }
    }

    public void addExamScore(double examScore){
        examscores.add(0, examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        examscores.set(examNumber, newScore);
    }

    public double getAverageExamScore(){
        double sum = 0;
        for (double i :examscores) {
            sum += i;
        }
        return sum / examscores.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examscores=" + examscores +
                '}';
    }
}