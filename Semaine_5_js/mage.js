//import {Personnage} from './personnage.js'
const Personnage = require('./personnage');

class Mage extends Personnage{
    constructor(nom, sante, force, mana) {
        super(nom, sante, force);
        this.mana =mana;
    }
}

module.exports = Mage;

