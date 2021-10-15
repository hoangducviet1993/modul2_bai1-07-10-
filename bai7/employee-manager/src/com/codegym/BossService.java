package com.codegym;

public class BossService implements ManagerService<Boss> {
    private Boss[] bossList = new Boss[2];
    private int size = 0;

    @Override
    public void add(Boss boss) {
        bossList[size] = boss;
        size++;
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(bossList[i]);
        }

    }

    @Override
    public Boss findById(int id) {
        return null;
    }

    @Override
    public void update(Boss boss, int id) {

    }

    @Override
    public void deleteById(Boss boss) {

    }
}
