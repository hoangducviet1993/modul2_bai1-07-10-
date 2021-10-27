package model;

public class Student extends Person {
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;

    public Student() {

    }

    public Student(String name, int age, double mathScore, double physicsScore, double chemistryScore) {
        super(name, age);
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getMediumScore() {
        return (this.mathScore + this.chemistryScore + this.physicsScore) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "mathScore=" + mathScore +
                ", physicsScore=" + physicsScore +
                ", chemistryScore=" + chemistryScore +
                '}';
    }
}
