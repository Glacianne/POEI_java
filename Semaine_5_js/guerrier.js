//import {Personnage} from './personnage.js'
const Personnage = require('./personnage');

class Guerrier extends Personnage{
    constructor(nom, sante, force, rage) {
        super(nom, sante, force);
        this.rage = rage;
    }
}

module.exports = Guerrier;