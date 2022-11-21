//import {Personnage} from './personnage.js'
const Personnage = require('./personnage');

class Aventurier extends Personnage{
    constructor(nom, sante, force, xp) {
        super(nom, sante, force);
        this.xp = xp;
    }
}

module.exports = Aventurier;