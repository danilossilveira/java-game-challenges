package Characters;

import javax.xml.stream.events.Characters;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class EnemiChoice extends Character{
    private String tipe;
    private int attackDamage;

    public EnemiChoice(String name, int life, String tipe, int attackDamage) {
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
    Zombie zombie = new Zombie("Zumbi", 150, "Corredor", 10);
    Regenerator regenerator = new Regenerator("Iron Maiden", 300, "Regenerator", 15);
    Hisenberg hisenberg = new Hisenberg("Hisenberg", 400, "Humano", 20);
    EnemiChoice enemiChoice = new EnemiChoice("a", 0, "a", 0);

    ArrayList<Character> list = new ArrayList<>();
    list.add(new Zombie("Zumbi", 150, "Corredor", 10));

    public void escolha(){
        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();
        switch (escolha){
            case 1:
               zombie = zombie;
               break;
            case 2:
                hisenberg = hisenberg;
                break;
            case 3:
                regenerator = regenerator;
                break;
            default:
                System.out.println("Não existe esse inimigo");

        }
    }
}
