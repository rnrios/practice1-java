package application;

import entities.Student;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("How many students to insert: ");
        int n_students = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<n_students; i++) {
            System.out.print("Insert student name: ");
            String name = sc.nextLine();

            System.out.print("Insert student registration: ");
            int id = sc.nextInt();

            Map<String, Double> map = new TreeMap<>();
            System.out.print("How many grades? ");
            int n_grades = sc.nextInt();
            sc.nextLine();
            for (int j=0; j < n_grades; j++) {
                System.out.print("Insert the course's name: ");
                String courseName = sc.nextLine();
                System.out.print("Insert the corresponding grade: ");
                Double grade = sc.nextDouble();
                map.put(courseName, grade);
                sc.nextLine();
            }
        students.add(new Student(name, id, map));
        }
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("+++++++Students info++++++++++");
        System.out.println("++++++++++++++++++++++++++++++");

        students.forEach(System.out::println);
    }
}
