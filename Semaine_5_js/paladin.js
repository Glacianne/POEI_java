//import {Personnage} from './personnage.js'
const Personnage = require('./personnage');

class Paladin extends Personnage{
    constructor(nom, sante, force, vertu) {
        super(nom, sante, force);
        this.vertu = vertu;
    }
}

module.exports = Paladin;