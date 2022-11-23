import {Personnage} from "./Personnage.js";
import {Spell} from "./Spell.js";

class Mage extends Personnage{
    constructor(name) {
        super(name);
        this.name = name;
        this.hp = 200;
        this.strength = 2;
        this.stamina = 100;
        this.attaques.push(
            (new Spell("Boule de feu", 30, 10, ()=> console.log("Katon, boule de feu !"))),
            (new Spell("Enchantement", 15, 5, ()=> console.log("Je chante sous la pluie..."))),
            (new Spell("Coup de bâton", 5, 0, ()=> console.log("Tu vas tâter de la puissance de mon bâton !")))
            );
    }
}

export {Mage};

