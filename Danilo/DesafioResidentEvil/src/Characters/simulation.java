package Characters;

import java.util.Scanner;

public class simulation extends Character{
    Scanner scan = new Scanner(System.in);
      public simulation(String name, int life) {
          super(name, life);
    }
    Leon leon = new Leon("Leon S. Kennedy", "Matilda", 15, 200);
    Jill jill = new Jill("Jill Valentine", "Samurai Edge", 12, 180);
    Chris chris = new Chris("Chris Redfield", "M4A1", 20, 190);
    Claire claire = new Claire("Claire Redfield", "Shotgun", 25, 170);
    Ethan ethan = new Ethan("Ethan Winters", "Chicago", 16, 210);
    //---------------------------\\
    Zombie zombie = new Zombie("Zumbi", 150, "Corredor", 10);
    Regenerator regenerator = new Regenerator("Iron Maiden", 300, "Regenerator", 15);
    Hisenberg hisenberg = new Hisenberg("Hisenberg", 400, "Humano", 20);

    public void batalha(){

    }
//    public void enemiChoice(){
//        int aaa = scan.nextInt();
//        switch (aaa){
//            case 1:
//            EnemiChoice enemi = new EnemiChoice("Zumbi", 150, "Corredor", 10);
//            case 2:
//            enemi = new EnemiChoice("Iron Maiden", 300, "Regenerator", 15);
//            case 3:
//                enemi = new EnemiChoice("Hisenberg", 400, "Humano", 20);
//        }
//    }

}
