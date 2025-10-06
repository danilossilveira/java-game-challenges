package Characters;

import java.util.Random;
import java.util.Scanner;

public class Simulator {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    Chris chris = new Chris();
    Leon leon = new Leon();
    Claire claire = new Claire();
    Jill jill = new Jill();
    Ethan ethan = new Ethan();

    Zombie zombie = new Zombie();
    Regenerator regenerator = new Regenerator();
    Hisenberg hisenberg = new Hisenberg();
    Character personagem;
    public void chooseCharacter(){

        int choice;
        System.out.println("""
                Qual personagem quer usar?
                1-Leon Scott Kennedy
                2-Chris Redfield
                3-Jill Valentine
                4-Claire Redfield
                5-Ethan Winters
                """);
        choice = scan.nextInt();
        switch (choice){
            case 1: {
            personagem = new Leon();
            break;
            }
            case 2: {
                personagem = new Chris();
                break;
            }
            case 3: {
                personagem = new Jill();
                break;
            }
            case 4:{
                personagem = new Ethan();
                break;
            }
            default:{
                System.out.println("Este personagem não existe");
                break;
            }

        }
        System.out.println("Você escolheu " + personagem.getName() + ", otima escolha! ");
    }
    public void danoCritico(){
        int critico = random.nextInt(21);
        if (critico >=17){
            
        }
    }
}
