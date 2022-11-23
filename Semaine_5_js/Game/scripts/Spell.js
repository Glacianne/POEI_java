class Spell{
    constructor(name, damage, staminaCost, castCallBack) {
        this.name = name;
        this.damage = damage;
        this.staminaCost = staminaCost;
        this.castCallBack = castCallBack;
    }

    cast(caster, target) {
        if (caster.endurance < this.staminaCost){
            console.log("Tu n'as pas de mana");
        } else {
            caster.endurance -= this.staminaCost;
            target.hp -= this.damage;
            this.castCallBack();
        }
    }
}

export {Spell};