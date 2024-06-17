package br.senai.sp.jandira.model;
import java.util.Scanner;

public class Enemy {

    private String nome;
    private String skin;

    public int getLife() {
        return life;
    }
    public String getNome() {
        return nome;
    }

    public void setLife(int life) {
        this.life = life;
    }

    private int life;

    public Enemy (){
        life = 100;
    }

    Scanner scanner = new Scanner(System.in);

    public void RegisterEnemy () {
        System.out.println("/-------------- Register Enemy --------------/");
        System.out.println("What is your name: ");
        this.nome = scanner.nextLine();
        System.out.println("What is your skin: ");
        this.skin = scanner.nextLine();
        System.out.println("/---------------------------------------------/");
    }

    public void ShowEnemy () {
        System.out.println("/---------------  Enemy -------------/");
        System.out.println("The name of player is: " + this.nome);
        System.out.println("The skin of player is: " + this.skin);
        System.out.println("The life of the player is: " + this.life);
        System.out.println("/-------------------------------------/");
    }

    public void ReduceLife (int danoPlayer){
        life -= danoPlayer;
        if (life < 0){
            life = 0;
        }
    }
}
