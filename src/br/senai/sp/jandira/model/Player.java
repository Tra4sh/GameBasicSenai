package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Player {

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

    public Player (){
        life = 100;
    }

    Scanner scanner = new Scanner(System.in);

    public void RegisterPlayer () {
        System.out.println("/-------------- Register Player --------------/");
        System.out.println("What is your name: ");
        this.nome = scanner.nextLine();
        System.out.println("What is your skin: ");
        this.skin = scanner.nextLine();
        System.out.println("/---------------------------------------------/");
    }

    public void ShowPlayer () {
        System.out.println("/---------------  Player -------------/");
        System.out.println("The name of player is: " + this.nome);
        System.out.println("The skin of player is: " + this.skin);
        System.out.println("The life of the player is: " + this.life);
        System.out.println("/-------------------------------------/");
    }

    public void ReduceLife (int danoEnemy){
        life -= danoEnemy;

        if (life < 0){
            life = 0;
        }
    }
    public void Defese(){

    }


}