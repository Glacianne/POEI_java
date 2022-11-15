package Semaine_3_java;
// Ecole / personnes qui font partie de l'école / individu / salarié / bénévole à la cantine / élève / niveau / classe / cours

// directeur supérieur à salarié
// Faire un diagramme
// Faire les classes et les fonctions
// Quand on tape le nom de qqun : savoir qui c'est (quel travail, salaire, quelle classe, moyenne générale, notes par matière), pouvoir faire des modifs sur sa fiche
// Pouvoir changer la note d'un élève
// On sonne l'ouverture de l'école et tout le monde fait ce qu'il a à faire : regarder les menus, allumer les fours, faire l'appel, sortir les cahiers etc.

import java.util.ArrayList;

class School {
    protected String name;
    ArrayList<Person> persons = new ArrayList<>();

    static Integer schoolsCount = 0;

    // constructeur
    public School(String name) {
        this.name = name;
        schoolsCount++;
    }

    public void ringBell() {
        System.out.println("****************************************************");
        System.out.println(String.format("L'école s'appelle %s", this.name));
        for (Person person : persons) {
            person.whoAmI();
        }
        System.out.println("****************************************************");
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public Person getPersonByName(String name) {
        for (Person person : persons) {
            if (person.name == name) {
                return person;
            }
        }
        return null;
    }

}

class Person {
    protected String name;

    static Integer personsCount = 0;

    // constructeur
    public Person(String name) {
        this.name = name;
        personsCount++;
    }

    public void whoAmI() {
        System.out.print(String.format("Je m'appelle %s, ", this.name));
    }
}

class Employee extends Person {
    Double salary;
    static Integer employeesCount = 0;

    // constructeur
    public Employee(String name, Double salary) {
        super(name);
        this.salary = salary;
        employeesCount++;
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.print("je travaille dans l'école, ");
    }
}

class Principal extends Employee {
    static Integer principalsCount = 0;

    // constructeur
    public Principal(String name, Double salary) {
        super(name, salary);
        principalsCount++;
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.println(String.format("je suis directeur et mon salaire est de %.2f euros", this.salary));
    }
}

class Teacher extends Employee {
    private String lesson;
    static Integer teachersCount = 0;

    // constructeur
    public Teacher(String name, Double salary, String lesson) {
        super(name, salary);
        this.lesson = lesson;
        teachersCount++;
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.println(
                String.format("je suis professeur de %s et mon salaire est de %.2f euros", this.lesson, this.salary));
    }
}

class Volunteer extends Person {
    static Integer volunteersCount = 0;

    // constructeur
    public Volunteer(String name) {
        super(name);
        volunteersCount++;
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.print("je suis bénévole ");
    }
}

class Cleaning extends Volunteer {
    static Integer cleaningsCount = 0;

    // constructeur
    public Cleaning(String name) {
        super(name);
        cleaningsCount++;
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.println("pour le ménage");
    }
}

class Kitchen extends Volunteer {
    static Integer kitchensCount = 0;

    // constructeur
    public Kitchen(String name) {
        super(name);
        kitchensCount++;
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.println("à la cantine");
    }
}

class Student extends Person {
    private String grad;
    private Double marksAverage;
    static Integer studentsCount = 0;

    // constructeur
    public Student(String name, String grad, Double marksAverage) {
        super(name);
        this.grad = grad;
        this.marksAverage = marksAverage;
        studentsCount++;
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.println(String.format("je suis élève en classe de %s, ma moyenne est de %.2f / 20", this.grad,
                this.marksAverage));
    }

    public String toString() {
        return (String) this.name;
    }
}

class Grad {
    public ArrayList<Person> grad = new ArrayList<>();
    public String name;

    public Grad(String name) {
        this.name = name;
    }

    public void addInGrad(Person person) {
        grad.add(person);
    }

    public void getStudents() {
        ArrayList<Person> students = new ArrayList<>();
        for (Person person : grad) {
            if (person.getClass().getSimpleName() == "Student") {
                students.add(person);
            }
        }
        for (Person person : students) {
            System.out.println(String.format("Je m'appelle %s, je suis en classe de %s.", person.name, this.name));
        }
    }

    public void getTeachers() {
        ArrayList<Person> teachers = new ArrayList<>();
        for (Person person : grad) {
            if (person.getClass().getSimpleName() == "Student") {
                teachers.add(person);
            }
        }
        for (Person person : teachers) {
            System.out.println(
                    String.format("Je m'appelle %s, je suis professeur en classe de %s.", person.name, this.name));
        }
    }

}

class POOSchoolS2 {
    public static void main(String[] args) {

        School school1 = new School("Collège Sainte-Marie");

        school1.addPerson(new Student("Louis", "quatrieme", 15.20));

        Grad quatrieme = new Grad("quatrième");
        quatrieme.addInGrad(school1.getPersonByName("Louis"));
        quatrieme.getStudents();

        school1.addPerson(new Student("Elsa", "quatrieme", 16.13));
        quatrieme.addInGrad(school1.getPersonByName("Elsa"));
        quatrieme.getStudents();

        /*
         * school1.addPerson(new Principal("Gérard", 1600.00));
         * school1.addPerson(new Teacher("Mme Lecoq", 1600.00, "SVT"));
         * school1.addPerson(new Kitchen("Roger"));
         * school1.addPerson(new Cleaning("Jacques"));
         * 
         * school1.addPerson(new Student("Caroline", "quatrième", 13.65));
         * 
         * school1.ringBell();
         * 
         * Person person = school1.getPersonByName("Louis");
         * person.whoAmI();
         */
    }
}