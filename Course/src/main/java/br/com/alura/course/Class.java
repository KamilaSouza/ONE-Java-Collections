package br.com.alura.course;

public class Class implements Comparable<Class> {

    private String tittle;
    private  int time;

    public Class(String tittle, int time) {
        this.tittle = tittle;
        this.time = time;
    }

    public String getTittle() {
        return tittle;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Class: " + this.tittle + ", " + this.time + " minutes.";
    }

    @Override
    public int compareTo(Class anotherClass) {
        return this.tittle.compareTo(anotherClass.getTittle());
    }
}
