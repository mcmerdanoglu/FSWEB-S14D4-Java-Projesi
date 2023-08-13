package Main;

import RolePlayingGame.Dagon;
import RolePlayingGame.Monster;
import RolePlayingGame.Zephyr;
import RolePlayingGame.Zeugl;

import java.util.Arrays;

public class MainRPG {

    public static void main(String[] args) {

        System.out.println("---------Monsterss Attaaacckkkk-----------------");

        Monster zeugl1=new Zeugl("Killzort", 45,30);
        Monster dagon1=new Dagon("King",68, 70);
        Monster zephyr1=new Zephyr("Shiny",88, 63);

        Zeugl zeugl2=new Zeugl("Mummachant", 50, 55);
        Zephyr zephyr2=new Zephyr("Spiky",47,64);
        Dagon dagon2=new Dagon("Queen",80, 72);


        System.out.println(zeugl1.attack());
        System.out.println(dagon1.attack());
        System.out.println(zephyr1.attack());

        System.out.println(zeugl2.attack());
        System.out.println(dagon2.attack());
        System.out.println(zephyr2.attack());
    }
}
