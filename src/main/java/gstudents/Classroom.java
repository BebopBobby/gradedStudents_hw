package gstudents;

public class Classroom {
    public Student[] students;

    public Classroom(int maxNumberOfStudents) {
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents(){
        return students;
    }

    public double getAverageExamScore(){
        Student student;
        return  student.examscores / students.length;
    }

    public void addStudent(Student student){
        for (int x = 0; x < 30; x++) {
            if (students[x] == null) {
                students[x] = student;
            }
        }
    }

    public void removeStudent(String firstName, String lastName){
        Student student;
        for (int x = 0; x < 30; x++) {
            if (firstName == student.getFirstName()) && (lastName == student.getLastName()) {
                students[x] = null;
            }
        }
    }

    public Student getStudentsByScore(Student student){
        for (int x = 0; x < 30; x++)
        if (student.examscores == students[x].examscores){
            return students[x];
        }
        return null;
    }

    public void getGradeBook(){

    }
}
