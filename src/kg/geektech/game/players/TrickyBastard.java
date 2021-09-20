package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class TrickyBastard extends  Hero{
    private int hpTD;
    public TrickyBastard(int health, int damage ) {
        super(health, damage, SuperAbility.INVISIBILITY);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        switch (RPG_Game.random.nextInt(3)+1){
           case 1 :
               hpTD =this.getHealth();
               this.setHealth(0);
               System.out.println("Tricky Bastard used his super power");
       }
    }


    public int getHpTD() {
        return hpTD;
    }

    public void setHpTD(int hpTD) {
        this.hpTD = hpTD;
    }
}
