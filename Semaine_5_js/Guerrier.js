//import {Personnage} from './Personnage.js'
const Personnage = require('./Personnage');

class Guerrier extends Personnage{
    constructor(nom, sante, force, rage) {
        super(nom, sante, force);
        this.rage = rage;
    }
}

module.exports = Guerrier;