package ro.fasttrackit.code.lab12.ex1;

import ro.fasttrackit.code.lab12.ex2.Classroom;
import ro.fasttrackit.code.lab12.ex3.ReportGenerator;

import java.io.IOException;
import java.util.List;

public class StudentGradeMain {
    public static void main(String[] args) throws IOException {
        StudentReader reader = new StudentReader("Files/grades.txt");
        List<StudentGrade> studentGrades = reader.readStudentWithFiles();
        System.out.println(studentGrades);

        Classroom classroom = new Classroom(studentGrades);
        System.out.println(classroom.getGradesForDiscipline("Computer Science"));
        System.out.println(classroom.getGradesForStudent("Gasparo Sava"));
        System.out.println(classroom.getMaxGrade("Mathematics"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("Physics"));
        System.out.println(classroom.getWorstGrade("Physics"));
        System.out.println(classroom.getMinGrade());
        System.out.println(classroom.getAverageGrade());

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(classroom.getMaxGrade(), classroom.getAverageGrade(), classroom.getMinGrade());

    }
}
