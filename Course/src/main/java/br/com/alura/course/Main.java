package br.com.alura.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Course javaCollections = new Course("Java", "Kam");

        javaCollections.addClass(new Class("DEF Java", 20));
        javaCollections.addClass(new Class("ABC Java", 15));
        javaCollections.addClass(new Class("GHI Java", 25));

        List<Class> immutableClasses = javaCollections.getClasses();
        System.out.println(immutableClasses);

        List<Class> classes = new ArrayList<>(immutableClasses);

        Collections.sort(classes);
        System.out.println(classes);
        System.out.println(javaCollections.getTotalTime());
        System.out.println(javaCollections);

    }
}
