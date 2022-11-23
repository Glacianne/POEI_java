const Personnage = require('./Personnage');
const Spell = require('./Spell');

class Vampire extends Personnage{
    constructor(name) {
        super(name);
        this.name = name;
        this.hp = 300;
        this.strength = 1;
        this.stamina = 120;
        this.attaques.push(
            (new Spell("Morsure", 35, 15, ()=> console.log("Miam miam"))),
            (new Spell("Regard glaçant", 15, 5, ()=> console.log(".........."))),
            (new Spell("Prise de sang", 10, 2, ()=> console.log("Tu vas tâter de la puissance de mon bâton !")))
        );
    }
}

module.exports = Vampire;