package Characters;

public class Ethan extends Character{
    private String arm;
    private int damage;

    public Ethan() {
        super("Ethan", 200, 40);
        setArm("Sniper");
    }

    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;

    }
    @Override
    public void attack() {

    }

}
