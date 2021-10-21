package service;

import model.Student;

import java.util.ArrayList;

public class StudentManager implements PersonService<Student> {
    private ArrayList<Student> listStudentScore;

    public StudentManager(ArrayList<Student> listStudentScore) {
        this.listStudentScore = listStudentScore;
    }

    public StudentManager() {
        listStudentScore = new ArrayList<>();

    }

    public ArrayList<Student> getListStudent() {
        return listStudentScore;
    }

    public void setListStudent(ArrayList<Student> listStudentScore) {
        this.listStudentScore = listStudentScore;
    }

    @Override
    public int findIndexByCode(int code) {
        for (int i = 0; i < listStudentScore.size(); i++) {
            if (listStudentScore.get(i).getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Student studentScore) {
        listStudentScore.add(studentScore);

    }

    @Override
    public void update(Student studentScore, int code) {
        int index = findIndexByCode(code);
        listStudentScore.set(index, studentScore);

    }

    @Override
    public void deleteByCode(int code) {
        int index = findIndexByCode(code);
        listStudentScore.remove(index);

    }

    @Override
    public void print() {
        for (Student studentScore : listStudentScore) {
            System.out.println(studentScore);
        }
        System.out.println("---------------------------------------------");
    }

    @Override
    public void sort() {
        listStudentScore.sort(((o1, o2) -> (int) (o1.getScore() - o2.getScore())));

    }

    @Override
    public double sumScore() {
        double sum = 0;
        for (Student studentScore : listStudentScore) {
            sum += studentScore.getScore();
        }
        return sum;
    }
}
