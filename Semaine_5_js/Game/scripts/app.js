import {Mage} from "./Mage.js";
import {Vampire} from "./Vampire.js";
import {Ninja} from "./Ninja.js";

const form = document.getElementById("formulaire");
const startGame = (e) => {
    e.preventDefault();
    /* Choix du joueur 1 */
    let selectJ1 = document.getElementById("select-j1");
    let choiceJ1 = selectJ1.selectedIndex;
    let persoJ1 = selectJ1.options[choiceJ1].value;
    let nameJ1 = document.getElementById("name-j1").value;

    /* Choix du joueur 2 */
    let selectJ2 = document.getElementById("select-j2");
    let choiceJ2 = selectJ2.selectedIndex;
    let persoJ2 = selectJ2.options[choiceJ2].value;
    let nameJ2 = document.getElementById("name-j2").value;

    startPlay(persoJ1, nameJ1, persoJ2, nameJ2);
}
const startPlay = (persoJ1, nameJ1, persoJ2, nameJ2) => {
    let player1;
    let player2;
    switch (persoJ1) {
        case "ninja":
            player1 = new Ninja(1, nameJ1);
            break;
        case "mage":
            player1 = new Mage(1, nameJ1);
            break;
        case "vampire":
            player1 = new Vampire(1, nameJ1);
            break;
    }
    switch (persoJ2) {
        case "ninja":
            player2 = new Ninja(2, nameJ2);
            break;
        case "mage":
            player2 = new Mage(2, nameJ2);
            break;
        case "vampire":
            player2 = new Vampire(2, nameJ2);
            break;
    }

    showGame(persoJ1, player1, persoJ2, player2);
}

const showGame = (persoJ1, player1, persoJ2, player2) => {
    console.log(persoJ2);
    const game = document.getElementById("game");
    game.innerHTML = `
                    <div id="personnage-p${player1.id}">
                        <img id="perso${player1.id}" class="${persoJ1}" src="assets/images/personnages/${persoJ1}.png" alt="personnage ${persoJ1}" />
                    </div>
                    <div id="personnage-p${player2.id}">
                        <img id="perso${player2.id}" class="${persoJ2}" src="assets/images/personnages/${persoJ2}.png" alt="personnage ${persoJ2}" />
                    </div>
                    <div class="box personnage-b${player1.id}">
                        <div class="sorts">
                            <img id="button1" src="./assets/images/sorts/show.png" alt="se présenter " />
                            <img id="s1-p1" src="./assets/images/sorts/${persoJ1}-1.png" alt="sort 1" />
                            <img id="s2-p1" src="./assets/images/sorts/${persoJ1}-2.png" alt="sort 2" />
                            <img id="s3-p1" src="./assets/images/sorts/${persoJ1}-3.png" alt="sort 3" />
                        </div>
                    </div>
                    <div class="box personnage-b2">
                        <div class="sorts">
                            <img id="button2" src="./assets/images/sorts/show.png" alt="se présenter " />
                            <img id="s1-p2" src="./assets/images/sorts/${persoJ2}-1.png" alt="sort 1" />
                            <img id="s2-p2" src="./assets/images/sorts/${persoJ2}-2.png" alt="sort 2" />
                            <img id="s3-p2" src="./assets/images/sorts/${persoJ2}-3.png" alt="sort 3" />
                        </div>
                    </div>
                    `
    const form = document.getElementById("formulaire");
    form.style.display = "none";
    game.style.display = "block";
    document.getElementById("button1").addEventListener("click", () => player1.annonce());
    document.getElementById("button2").addEventListener("click", () => player2.annonce());
    document.getElementById("s1-p1").addEventListener("click", () => player1.attaquer(player2))
    document.getElementById("s1-p1").addEventListener("click", () => player2.pv());
    document.getElementById("s1-p2").addEventListener("click", () => player2.attaquer(player1))
    document.getElementById("s1-p2").addEventListener("click", () => player1.pv());
}
form.addEventListener('submit', startGame);