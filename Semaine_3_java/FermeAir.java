package Semaine_3_java;

class Animal {
    protected String name;
    protected String specie;
    protected String eat;
    protected String say;

    public Animal(String name, String eat, String say, String specie) {
        this.name = name;
        this.specie = specie;
        this.eat = eat;
        this.say = say;
    }

    public void speak() {
        System.out.println(String.format("%s ! Je m'appelle %s, je suis un(e) %s. Donne-moi de(s) %s s'il te plaît.",
                this.say, this.name, this.specie, this.eat));
    }
}

class Mouton extends Animal {

    public Mouton(String name) {
        super(name, "l'herbe", "Méééé", "mouton");
    }

}

class Poule extends Animal {

    public Poule(String name) {
        super(name, "graines", "Cotcotcoooooot", "poule");
    }

}

class Chien extends Animal {

    public Chien(String name) {
        super(name, "os", "Waouf", "chien");
    }

}

class FermeAir {

    public static void main(String[] args) {
        Mouton m1 = new Mouton("Tonton");
        Mouton m2 = new Mouton("Cromagnon");
        Poule p1 = new Poule("Picoti");
        Poule p2 = new Poule("Picota");
        Chien c1 = new Chien("Médor");
        Chien c2 = new Chien("Belle");

        m1.speak();
        m2.speak();
        p1.speak();
        p2.speak();
        c1.speak();
        c2.speak();

    }
}
