package Semaine_3_java;

import java.util.ArrayList;

class Person extends SchoolAir {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void whoAmI() {
    }

}

class Employee extends Person {
    protected String function;
    protected int salary;

    public Employee(String name, String function, int salary) {
        super(name);
        this.function = function;
        this.salary = salary;
    }

    public void whoAmI() {
        System.out.print(String.format("Je m'appelle %s, je gagne %d euros, je suis %s", name, salary, function));
    }

}

class Principal extends Employee {

    public Principal(String name) {
        super(name, "principal", 3000);

    }

}

class Teacher extends Employee {
    protected String lesson;

    public Teacher(String name, String lesson) {
        super(name, "professeur", 2000);
        this.lesson = lesson;
    }

    @Override
    public void whoAmI() {
        super.whoAmI();
        System.out.print(String.format(" de %s.", lesson));
    }
}

class Volunteer extends Person {
    protected String job;

    public Volunteer(String name, String job) {
        super(name);
        this.job = job;
    }

    public void whoAmI() {
        System.out.print(String.format("Je m'appelle %s, je suis bénévole, je suis %s.", name, job));
    }
}

class Kitchen extends Volunteer {
    public Kitchen(String name) {
        super(name, "cuisinier");
    }
}

class Cleaning extends Volunteer {
    public Cleaning(String name) {
        super(name, "agent de nettoyage");
    }
}

class Student extends Person {
    protected String grad;

    public Student(String name, String grad) {
        super(name);
        this.grad = grad;
    }

    public void whoAmI() {
        System.out.print(String.format("Je m'appelle %s, je suis étudiant en classe de %s.", name, grad));
    }

}

public class SchoolAir {
    ArrayList<Person> persons = new ArrayList<>();

    public Person getPersonByName(String name) {
        for (Person person : persons) {
            if (person.name.equals(name))
                return person;
        }
        return null;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void ringBell() {
        for (Person person : persons) {
            person.whoAmI();
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        SchoolAir school1 = new SchoolAir();

        school1.addPerson(new Principal("Jacques"));
        school1.addPerson(new Teacher("ALbert", "mathématiques"));
        school1.addPerson(new Kitchen("Bernard"));
        school1.addPerson(new Cleaning("Laura"));
        school1.addPerson(new Teacher("Emeline", "physique"));
        school1.addPerson(new Student("Rose", "4e"));
        school1.ringBell();
    }

}
