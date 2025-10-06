package Characters;

public class Jill extends Character{
    private String arm;
    private int damage;

    public Jill() {
        super("Jill", 230, 30);
        setArm("Sub-metralhadora");

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
