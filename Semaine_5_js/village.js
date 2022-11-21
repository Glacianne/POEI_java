//import {Mage} from "./mage.js";
const Mage = require('./mage');
const Aventurier = require('./aventurier');
const Guerrier = require('./guerrier');
const Paladin = require('./paladin');

class Village{
    constructor(nbvillageois, nbbois, nbpierre, nbor, batiments) {
        this.nbvillageois = nbvillageois;
        this.nbbois = nbbois;
        this.nbpierre = nbpierre;
        this.nbor = nbor;
        this.batiments = [batiments];
    }
}

let village1 = new Village(1,100, 100, 0, "HDV");
let m1 = new Mage('Ombrage', 100, 300, 40);
let a1 = new Aventurier ('Indie', 300, 100, 50);
let g1 = new Guerrier('Napoléon', 500, 200, 30);
let p1 = new Paladin('Arlequin', 300, 400, 'négociation');

console.log(m1);
console.log(a1);
console.log(g1);
console.log(p1);

