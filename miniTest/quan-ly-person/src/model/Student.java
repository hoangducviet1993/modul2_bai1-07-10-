package model;

public class Student extends Person {
    private double scores;

    public Student() {
    }

    public Student(double scores) {
        this.scores = scores;
    }

    public Student(String name, int age, double scores) {
        super(name, age);
        this.scores = scores;
    }

    public double getScore() {
        return scores;
    }

    public void setScore(double score) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "scores=" + scores +
                '}';
    }
}
