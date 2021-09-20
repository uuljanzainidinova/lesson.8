package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Antman extends Hero{
    private int anthpup;
    private int anthpdown;
    private boolean isAntmanUsed = false;
    public Antman(int health, int damage) {
        super(health, damage, SuperAbility.ANTMAN);
    }

    public int getAnthpup() {
        return anthpup;
    }

    public void setAnthpup(int anthpup) {
        this.anthpup = anthpup;
    }

    public int getAnthpdown() {
        return anthpdown;
    }

    public void setAnthpdown(int anthpdown) {
        this.anthpdown = anthpdown;
    }

    public boolean isAntmanUsed() {
        return isAntmanUsed;
    }

    public void setAntmanUsed(boolean antmanUsed) {
        isAntmanUsed = antmanUsed;
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
      switch (RPG_Game.random.nextInt(2)+1){
          case 1 :
              isAntmanUsed = true;
              anthpup= this.getHealth();
              this.setHealth(getHealth()+40);
              this.setDamage(getDamage()+ 6);
              System.out.println("Antman увеличелся на 40 метров");
              break;
          case 2 :
              isAntmanUsed = true;
              anthpup= this.getHealth();
              this.setHealth(getHealth()-40);
              this.setDamage(getDamage()- 6);
              System.out.println("Antman уменьшился на 40 метров");
      }
    }
}
