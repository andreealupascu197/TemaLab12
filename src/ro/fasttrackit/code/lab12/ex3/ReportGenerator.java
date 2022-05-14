package ro.fasttrackit.code.lab12.ex3;

import ro.fasttrackit.code.lab12.ex1.StudentGrade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReportGenerator {
    public void generateReport(StudentGrade largestStudentGrade, Integer averageStudentGrade, StudentGrade smallestStudentGrade) throws IOException {
        Path path = Path.of("Files", "grade-reports.out");
        String reportString = "Largest Grade: " + largestStudentGrade.getName() + " " + largestStudentGrade.getGrade() + "\n";
        reportString += "Average Grade: " + averageStudentGrade + "\n";
        reportString += "Smallest Grade: " + smallestStudentGrade.getName() + " " + smallestStudentGrade.getGrade();

        Files.write(path, reportString.getBytes());
    }
}
