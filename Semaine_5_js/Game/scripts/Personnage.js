class Personnage {
    attaques = [];
    constructor(id, name) {
        this.id = id;
        this.name = name;
        this.hp = 100;
        this.strength = 10;
        this.endurance = 25;
        this.opponent = null;
    }

    subirDommage(montant_dommage) {
        this.hp -= montant_dommage;
    }

    attaquer(target) {
        const degats = this.strength;
        target.subirDommage(degats);
        this.endurance -= 2;
    }

    jouerTour(choix) {
        console.log(this.attaques[choix]);
    }

    annonce() {
        let perso = document.getElementById(`personnage-p${this.id}`);
        let p = document.createElement('p');
        p.innerText = `Je m'appelle ${this.name}, mes stats sont :
             🧡 hp : ${this.hp}
             🔷 strength : ${this.strength}
             🔴 endurance: ${this.endurance}`;
        p.className = `paragraphe-p${this.id}`;
        perso.prepend(p);
        setTimeout(() => {
            p.remove(`personnage-p${this.id}`);
        }, 5000);
    }

    pv() {
        let perso = document.getElementById(`personnage-p${this.id}`);
        let p = document.createElement('p');
        p.innerText = `Aie il me reste :
             🧡 hp : ${this.hp}
             🔷 strength : ${this.strength}
             🔴 endurance: ${this.endurance}`;
        p.className = `paragraphe-p${this.id}`;
        perso.prepend(p);
        setTimeout(() => {
            p.remove(`personnage-p${this.id}`);
        }, 5000);
    }

    get getHp() {
        return this.hp;
    }

    get getEndurance() {
        return this.endurance;
    }

    set setHp([id, newHp]) {
        this.hp = newHp;
        this.changeValueWithId(id, newHp);
    }

    set setEndurance([id, endurance]) {
        this.endurance = endurance;
        this.changeValueWithId(id, endurance);
    }

    changeValueWithId(id, value) {
        document.getElementById(id).value = value;
    }
}

export {Personnage};