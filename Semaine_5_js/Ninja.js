const Personnage = require('./Personnage');
const Spell = require('./Spell');

class Ninja extends Personnage{
    constructor(name) {
        super(name);
        this.name = name;
        this.hp = 400;
        this.strength = 1;
        this.stamina = 80;
        this.attaques.push(
            (new Spell("Lancer de shuriken", 40, 20, ()=> console.log("Shuuuuriken !"))),
            (new Spell("Coup de katana", 16, 10, ()=> console.log("Je vais te découper !"))),
            (new Spell("Kick sauté", 5, 5, ()=> console.log("Prends ça dans ta face !")))
        );
    }
}

module.exports = Ninja;