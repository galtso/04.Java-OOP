package _01_Abstraction._01_Abstraction_lab._03_Student_System;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentMap;

    public StudentSystem() {
        this.studentMap = new HashMap<>();
    }

    public Map<String, Student> getStudentMap() {
        return this.studentMap;
    }

    public void executeCommand(String[] args) {

        if (args[0].equals("Create")) {
            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            Student student = new Student(name, age, grade);
            studentMap.putIfAbsent(name, student);

        } else if (args[0].equals("Show")) {
            String name = args[1];
            if (studentMap.containsKey(name)) {
                Student student = studentMap.get(name);
                String view = String.format("%s is %s years old.", student.getName(), student.getAge());

                if (student.getGrade() >= 5.00) {
                    view += " Excellent student.";
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    view += " Average student.";
                } else {
                    view += " Very nice person.";
                }

                System.out.println(view);
            }
        }
    }
}
