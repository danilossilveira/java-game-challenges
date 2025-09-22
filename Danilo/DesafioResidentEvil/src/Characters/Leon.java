package Characters;

public class Leon extends Character{
    private String arm;
    private int damage;

    public Leon(String name,String arm, int damage,  int life) {
        super(name, life);
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
        int chosenEnemy;

    }
}
