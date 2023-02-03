package br.com.alura.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course("Java", "Kami");

        course1.addClass(new Class("DEF Java", 20));
        course1.addClass(new Class("ABC Java", 15));
        course1.addClass(new Class("GHI Java", 25));

        Student s1 = new Student("Noah" , 1);
        Student s2 = new Student("Kevin" , 2);
        Student s3 = new Student("Thor" , 3);
        Student s4 = new Student("Noah", 1);

        course1.registerStudent(s1);
        course1.registerStudent(s2);
        course1.registerStudent(s3);

        System.out.println("All students registered in this course: ");
        course1.getStudents().forEach(student -> {
            System.out.println(student);
        });

        System.out.println(course1.getStudents().size());
        System.out.println(course1.isRegistered(2));
        System.out.println(s1.equals(s4));


        List<Class> immutableClasses = course1.getClasses();
        System.out.println(immutableClasses);

        List<Class> classes = new ArrayList<>(immutableClasses);

        Collections.sort(classes);
        System.out.println(classes);
        System.out.println("Course total time: " + course1.getTotalTime());
        System.out.println("Description - " + course1);

    }
}
