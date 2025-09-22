package Characters;

public class Hisenberg extends Character{
    private String tipe;
    private int attackDamage;

    public Hisenberg(String name, int life, String tipe, int attackDamage) {
        super(name, life);
        this.tipe = tipe;
        this.attackDamage = attackDamage;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
