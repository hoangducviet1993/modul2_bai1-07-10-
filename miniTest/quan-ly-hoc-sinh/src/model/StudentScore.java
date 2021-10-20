package model;

public class StudentScore extends Student{
    private double scores;

    public StudentScore() {
    }

    public StudentScore(double scores) {
        this.scores = scores;
    }

    public StudentScore(String name, int age, int code, double scores) {
        super(name, age, code);
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
        return "StudentScore{" +
                super.toString()+
                "scores=" + scores +
                '}';
    }
}
