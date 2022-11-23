class Animation{

    constructor(element) {
        this.element = element;
    }

    deplacer(x, y){
        this.element.style.position = "absolute";
        this.element.style.left = x;
        this.element.style.top = y;
    }

    agrandir(largeur, hauteur){
        this.element.style.width = largeur;
        this.element.style.height = hauteur;
    }

    changerCouleur(couleur){
        this.element.style.color = couleur;
    }

    pivoter(degrees) {
        this.element.style.transform = `rotate(${degrees}deg)`;
    }

    disparaitre(){
        this.element.style.display = "none";
    }

    apparaitre(){
        this.element.style.display = "block";
    }

}