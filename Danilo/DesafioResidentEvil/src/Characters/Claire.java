package Characters;

public class Claire extends Character{
    private String arm;
    private int damage;

    public Claire(String arm, int damage) {
        this.arm = arm;
        this.damage = damage;

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
    public void attack (){

    }
}
