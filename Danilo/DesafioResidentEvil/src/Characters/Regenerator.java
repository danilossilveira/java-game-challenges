package Characters;

public class Regenerator extends Character{
    private String tipe;
    private int Damage;

    public Regenerator() {
        super("Iron Mainden", 350);
        setTipe("Regenerator");
        setDamage(15);
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
