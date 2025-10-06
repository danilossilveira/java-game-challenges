package Characters;

import javax.xml.namespace.QName;

public class Chris extends Character{
    private String arm;
    private int damage;

    public Chris() {
        super("Chris", 230, 30);
        setArm("M4A1");

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
