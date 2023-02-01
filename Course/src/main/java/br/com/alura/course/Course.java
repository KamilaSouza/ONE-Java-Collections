package br.com.alura.course;

import java.util.*;

public class Course {

    private String name;
    private String instructor;
    private List<Class> classes = new ArrayList<>();

    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public List<Class> getClasses() {
        return Collections.unmodifiableList(classes); // read only
    }

    public int getTotalTime(){
        int totalTime = 0;
        for (Class c : classes) {
            totalTime += c.getTime();
        }
        return totalTime;
    }
    public void addClass(Class c){
        this.classes.add(c);
    }

    @Override
    public String toString() {
        return "Course: "
                + name
                + ", instructor: " + instructor
                + ", total time: " + getTotalTime()
                + " minutes. Classes: "
                + this.classes;
    }
}
