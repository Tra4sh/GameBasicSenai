package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Battle;
import br.senai.sp.jandira.model.Enemy;
import br.senai.sp.jandira.model.Player;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Enemy enemy = new Enemy();

        boolean exit = false;

        while (!exit){
            System.out.println("/-------------- MENU -------------/");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Register a new Player");
            System.out.println("2 - Register a new Enemy");
            System.out.println("3 - Information Player");
            System.out.println("4 - Information Enemy");
            System.out.println("5 - New Battle");
            System.out.println("6 - Sair");
            System.out.println("/----------------------------------/");

            int userOption = scanner.nextInt();

            switch (userOption) {

                case 1:
                    player.RegisterPlayer();
                    break;
                case 2:
                    enemy.RegisterEnemy();
                    break;
                case 3:
                    player.ShowPlayer();
                    break;
                case 4:
                    enemy.ShowEnemy();
                    break;
                case 5:
                    Battle battle = new Battle();
                    battle.choiceScenario();
                    battle.Battle(player, enemy);
                    player.setLife(100);
                    enemy.setLife(100);
                case 6:
                    exit = true;
                    break;
            }
        }
    }
}
