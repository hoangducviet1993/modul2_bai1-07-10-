package model;

public class Teacher extends Person{
    private String subject;

    public Teacher() {
    }


    public Teacher(String name, int age, int code, String subject) {
        super(name, age, code);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                 super.toString()+
                "subject='" + subject + '\'' +
                '}';
    }
}
