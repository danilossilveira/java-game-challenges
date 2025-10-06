package Characters;

public class Zombie extends Character{
    private String tipe;
    private int Damage;

    public Zombie() {
        super("Zumbi", 220);
        setTipe("Corredor");
        setDamage(10);

    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage){
        this.Damage = damage;
    }
    @Override
    public void attack() {

    }

}
