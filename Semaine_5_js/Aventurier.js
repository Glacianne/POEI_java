//import {Personnage} from './Personnage.js'
const Personnage = require('./Personnage');

class Aventurier extends Personnage{
    constructor(nom, sante, force, xp) {
        super(nom, sante, force);
        this.xp = xp;
    }
}

module.exports = Aventurier;