//import {Personnage} from './Personnage.js'
const Personnage = require('./scripts/Personnage.js');

class Paladin extends Personnage{
    constructor(nom, sante, force, vertu) {
        super(nom, sante, force);
        this.vertu = vertu;
    }
}

module.exports = Paladin;