package br.senai.sp.jandira.model;

public class Scenario {

    public String Scenario (int optionScenario) {

        String scenario = "Senai Jandira";

        switch (optionScenario){
            case 1:
                scenario = "Floresta";
                break;
            case 2:
                scenario = "Caverna";
                break;
            case 3:
                scenario = "Deserto";
                break;
        }
        return scenario;
    }
}