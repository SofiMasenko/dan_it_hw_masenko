package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();

        students.add(new Student(121, "Maria", 29, 75.4));
        students.add(new Student(122, "valeriy", 25, 85.5));
        students.add(new Student(123, "Mykola", 23, 90.1));
        students.add(new Student(124, "Valentina", 20, 95.5));

        Student.printAllStudents(students);

        Student newStudent = new Student(125, "Larysa", 20, 99.0);
        Student.addStudent(students, newStudent);
        Student.printAllStudents(students);

        System.out.println("\n Result search by name 'Mykola'");
        Student foundStudent = Student.findStudentByName(students, "Mykola");
        System.out.println(foundStudent);

        System.out.println("\n Result search by name 'Mykyta'");
        Student notFound = Student.findStudentByName(students, "Mykyta");

        System.out.println();
        Student.removeStudentById(students, 123);

        Student.printAllStudents(students);



    }
}
