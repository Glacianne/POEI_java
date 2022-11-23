class Personnage{
    attaques = [];
    constructor(name) {
        this.name = name;
        this.hp = 0;
        this.strength = 0;
        this.stamina = 0;
        this.opponent = null;
    }

    subirDommage(montant_dommage){
        this.hp -= montant_dommage;
    }

    attaquer(target){
        target.subirDommage(this.strength);
        this.stamina -= 2;
    }

    annonce(){
        console.log(`Je m'appelle ${this._name}, mes stats sont :\n
        hp : ${this.hp}\n
        strength : ${this.strength}\n
        endurance: ${this.stamina}`);
    }

    jouerTour(){
        console.log(this.attaque);
    }

    changeValueWithId(id, value) {
        document.getElementById(id).innerHTML = value;
    }

    get getHp(){
        return this.hp;
    }

    get getEndurance(){
        return this.stamina;
    }

    set setHp([id, newHp]) {
        this.hp = newHp;
        this.changeValueWithId(id, newHp);
    }

    set setEndurance([id, newStamina]) {
        this.stamina = newStamina;
        this.changeValueWithId(id, newStamina);
    }
}

module.exports = Personnage;