package ro.fasttrackit.code.lab12.ex2;

import ro.fasttrackit.code.lab12.ex1.StudentGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Classroom {
    private List<StudentGrade> studentGrades;

    public Classroom(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesForDiscipline = new ArrayList<>();
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                gradesForDiscipline.add(studentGrade.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> gradesForStudent = new ArrayList<>();
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getName().equals(student)) {
                gradesForStudent.add(studentGrade.getGrade());
            }
        }
        return gradesForStudent;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxStudentGrade = new StudentGrade("", "", 0);
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                if (studentGrade.getGrade() > maxStudentGrade.getGrade()) {
                    maxStudentGrade = studentGrade;
                }
            }
        }
        return maxStudentGrade;
    }

    public StudentGrade getMaxGrade() {
        StudentGrade maxStudentGrade = new StudentGrade("", "", 0);
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade() > maxStudentGrade.getGrade()) {
                maxStudentGrade = studentGrade;
            }
        }
        return maxStudentGrade;
    }

    public Integer getAverageGrade(String discipline) {
        int sum = 0;
        int count = 0;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                count++;
                sum += studentGrade.getGrade();
            }
        }
        return sum / count;
    }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade worstStudentGrade = new StudentGrade("", "", 11);
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                if (studentGrade.getGrade() < worstStudentGrade.getGrade()) {
                    worstStudentGrade = studentGrade;
                }

            }
        }
        return worstStudentGrade;
    }

    public StudentGrade getMinGrade() {
        StudentGrade minStudentGrade = new StudentGrade("", "", 11);
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade() < minStudentGrade.getGrade()) {
                minStudentGrade = studentGrade;
            }
        }
        return minStudentGrade;
    }

    public Integer getAverageGrade() {
        int sum = 0;
        int count = 0;
        for (StudentGrade studentGrade : studentGrades) {
            count++;
            sum += studentGrade.getGrade();
        }
        return sum / count;
    }
}
