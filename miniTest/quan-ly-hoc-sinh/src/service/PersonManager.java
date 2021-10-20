package service;

import model.Person;

import java.util.ArrayList;

public class PersonManager implements PersonService<Person>  {
    private ArrayList<Person> people;

    public PersonManager(ArrayList<Person> people) {
        this.people = people;
    }

    public PersonManager() {
        people = new ArrayList<>();
    }


    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    @Override
    public int findIndexByCode(int code) {
        for (int i = 0; i < people.size(); i++) {
            if(people.get(i).getCode() == code){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Person person) {
            people.add(person);
    }

    @Override
    public void update(Person person, int code) {
        int index= findIndexByCode(code);
        people.set(index,person);

    }

    @Override
    public void deleteByCode(int code) {
        int index = findIndexByCode(code);
        people.remove(index);

    }

    @Override
    public void print() {
        for (Person person: people) {
            System.out.println(person);
        }
        System.out.println("_____________________________");
    }

    @Override
    public void sort() {
    people.sort(((o1, o2) ->(o1.getCode() - o2.getCode())));
    }

    @Override
    public double sumScore() {

        return 0;
    }
}
