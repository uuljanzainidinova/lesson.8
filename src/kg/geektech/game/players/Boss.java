package kg.geektech.game.players;

public class Boss extends GameEntity {
    boolean Deafen;
    public Boss(int health, int damage) {
        super(health, damage);
    }

    public boolean isDeafen() {
        return Deafen;
    }

    public void setDeafen(boolean deafen) {
        Deafen = deafen;
    }
}
