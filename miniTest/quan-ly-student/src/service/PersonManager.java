package service;

import model.Person;

import java.util.ArrayList;

public class PersonManager implements PersonService<Person> {
    private ArrayList<Person> people;
    private int count = 0;

    public PersonManager() {
        this.people = new ArrayList<>();

    }

    public PersonManager(ArrayList<Person> people) {
        this.people = people;
    }

    @Override
    public void add(Person person) {
        person.setId(count);
        count++;
        people.add(person);


    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(Person person, int id) {
        if (findIndexById(id) != -1) {
            people.set(findIndexById(id), person);
        }else {
            System.out.println("ID này không tồn tại:");
        }
    }

    @Override
    public void delete(int id) {
        if (findIndexById(id)!=-1){
            people.remove(findIndexById(id));
        }else {
            System.out.println("ID này không tồn tại: ");
        }
    }

    @Override
    public void sort() {

    }
    @Override
    public void print() {
        for (Person person: people) {
            System.out.println(person);
        }
    }
}
