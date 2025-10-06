package Characters;

public class Leon extends Character{
    private String arm;
    private int damage;

    public Leon() {
        super("Leon", 240, 30);
        setArm("Handgan");


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
    @Override
    public void ficha() {

    }

}
