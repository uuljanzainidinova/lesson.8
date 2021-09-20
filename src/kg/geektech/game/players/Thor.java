package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        boolean superOfThorIsTrue = RPG_Game.random.nextBoolean();
        if (superOfThorIsTrue) {
            boss.setDamage(0);
            System.out.println("Бос оглушен");
        } else if (!(superOfThorIsTrue)) {
            boss.setDamage(boss.getDamage());
        }
    }

}
