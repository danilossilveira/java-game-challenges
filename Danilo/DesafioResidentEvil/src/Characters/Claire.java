package Characters;

public class Claire extends Character{
    private String arm;
    private int damage;

    public Claire() {
        super("Claire", 220, 35);
        setArm("Escopeta");

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
