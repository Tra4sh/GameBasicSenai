package br.senai.sp.jandira.model;
import java.util.Scanner;

public class Battle {

    String scenarioBattle;
    Scanner scanner = new Scanner(System.in);
    Scenario scenario = new Scenario();

    public void Battle (Player player, Enemy enemy) {
        while (true){

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();

            if (lifeEnemy <= 0) {
                System.out.println("O player " + player.getNome() + " é o Vencedor !!");
                break;
            } else if (lifePlayer <= 0){
                System.out.println("O enemy " + enemy.getNome() + " é o Vencedor !!");
                break;
            }

            System.out.println("/------------------------------ Battle ------------------------/");
            System.out.println(" Ataque Player [ A ] " + player.getNome() + " life: " + player.getLife() );
            System.out.println(" Ataque Enemy  [ B ] " + enemy.getNome() + " life: " + enemy.getLife() );
            System.out.println("/--------------------------------------------------------------/");

            String attack = scanner.nextLine();

            if (attack.equalsIgnoreCase("A")){

                System.out.println("/--------------------------/");
                System.out.println("/-      Player Atacou     -/");
                System.out.println("/--------------------------/");



                int danoPlayer = (int) (Math.random() * 20) + 1;
                enemy.ReduceLife(danoPlayer);

                System.out.println("/--------------------------/");
                System.out.println("O ataque foi de: " + danoPlayer);
                System.out.println("/--------------------------/");

            } else if (attack.equalsIgnoreCase("B")) {

                System.out.println("/--------------------------/");
                System.out.println("/-      Enemy Atacou     -/");
                System.out.println("/--------------------------/");

                int danoEnemy = (int) (Math.random() * 20) + 1;
                player.ReduceLife(danoEnemy);

                System.out.println("/--------------------------/");
                System.out.println("O ataque foi de: " + danoEnemy);
                System.out.println("/--------------------------/");
            } else  {
                System.out.println("Tecla Invalida !!!");
            }
        }
    }

    public void choiceScenario () {
        System.out.println("/----------------------------------------------------------/");
        System.out.println("Escolha um cenario: [1- Floresta] [2- Caverna] [3- Deserto] [Default - Senai Jandira]");
        System.out.println("/----------------------------------------------------------/");

        int choiceScenarioUser = scanner.nextInt();
        scanner.nextLine();
        scenarioBattle = scenario.Scenario(choiceScenarioUser);
        System.out.println(scenarioBattle);

    }


}