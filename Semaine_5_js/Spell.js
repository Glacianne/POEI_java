class Spell{

    constructor(name, damage, staminaCost, castCallBack) {
        this.name = name;
        this.damage = damage;
        this.staminaCost = staminaCost;
        this.castCallBack = castCallBack;
    }

    cast(caster, target){
        caster.endurance -= this.staminaCost;
        target.subirDommage(this.damage);
        this.castCallBack();
    }
}

module.exports = Spell;