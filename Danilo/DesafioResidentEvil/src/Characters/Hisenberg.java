package Characters;

public class Hisenberg extends Character{
    private String tipe;
    private int Damage;

    public Hisenberg() {
        super("Hisenberg", 400);
        setTipe("Mecanico");
        setDamage(20);
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

    public void setDamage(int damage) {
        this.Damage = damage;
    }
    @Override
    public void attack() {

    }

}
