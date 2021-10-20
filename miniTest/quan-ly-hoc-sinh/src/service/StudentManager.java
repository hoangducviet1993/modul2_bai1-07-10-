package service;

import model.StudentScore;

import java.util.ArrayList;

public class StudentManager implements StudentService<StudentScore> {
    private ArrayList<StudentScore> listStudentScore;

    public StudentManager(ArrayList<StudentScore> listStudentScore) {
        this.listStudentScore = listStudentScore;
    }

    public StudentManager() {
        listStudentScore = new ArrayList<>();

    }

    public ArrayList<StudentScore> getListStudentScore() {
        return listStudentScore;
    }

    public void setListStudentScore(ArrayList<StudentScore> listStudentScore) {
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
    public void add(StudentScore studentScore) {
        listStudentScore.add(studentScore);

    }

    @Override
    public void update(StudentScore studentScore, int code) {
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
        for (StudentScore studentScore : listStudentScore) {
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
        for (StudentScore studentScore : listStudentScore) {
            sum += studentScore.getScore();
        }
        return sum;
    }
}
