package kg.geektech.game.players;

public class Berserk extends Hero{
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        if (boss.getDamage()>0){
            setDamage(getDamage()+ 30);
            System.out.println("Berserk used his super power");

        }
    }
}
