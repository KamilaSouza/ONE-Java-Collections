package br.com.alura.course;

import java.util.*;

public class Course {

    private String name;
    private String instructor;
    private List<Class> classes = new ArrayList<>();

    private Set<Student> students = new HashSet<>();

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

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
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

    public void registerStudent(Student student) {
        this.students.add(student);
    }

    public boolean isRegistered(Student student){
        return this.students.contains(student);
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
