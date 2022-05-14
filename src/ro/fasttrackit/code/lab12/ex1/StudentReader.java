package ro.fasttrackit.code.lab12.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StudentReader {
    private final String path;

    public StudentReader(String path) {
        this.path = path;
    }

    public List<StudentGrade> readStudentWithFiles() throws IOException {
        List<String> lines = Files.readAllLines(Path.of(path));
        List<StudentGrade> result = new ArrayList<>();
        for (String line : lines) {
            result.add(readStudentFromLine(line));
        }
        return result;
    }

    private static StudentGrade readStudentFromLine(String line) {
        String[] tokens = line.split(Pattern.quote("|"));

        return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }
}
