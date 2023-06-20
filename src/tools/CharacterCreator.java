package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CharacterCreator {

    Scanner s = new Scanner(System.in);

    //Background
    //Alinhamento
    //Raca
    //Classe
    //Atributos
    //Nome do Personagem
    //Nome do Jogador

    public String assignName() {
        String name;
        System.out.print("Nome do Personagem: ");
        name = s.nextLine();

        return name;
    }

    public String assignPlayerName() {
        String name;
        System.out.print("Nome do Jogador: ");
        name = s.nextLine();

        return name;
    }

    public int assignBG() {
        return 0;
    }

    public int assignAlignment() {
        return 0;
    }

    public int assignRace() {
        return 0;
    }

    public int assignClass() {
        return 0;
    }

    public int[] assignAttributes() {

        int[] attributeArray = new int[6];

        String[] attributeNames = new String[6];
        attributeNames[0] = "Força";
        attributeNames[1] = "Destreza";
        attributeNames[2] = "Constituição";
        attributeNames[3] = "Inteligência";
        attributeNames[4] = "Sabedoria";
        attributeNames[5] = "Carisma";
        
        ArrayList<Integer> attributeValues = new ArrayList<>(Arrays.asList(15, 14, 13, 12, 10, 8));

        boolean validInput = false;

        System.out.println("Valores disponíveis:");
        System.out.print("| ");
        for(int value : attributeValues) {
            System.out.print(value + " | ");
        }
        System.out.println();


        for (int i = 0; i<6; i++) {

            validInput = false;
            do {
                try {
                    System.out.println("Digite um valor para "+attributeNames[i]+": ");
                    int inputValue = s.nextInt();

                    if (attributeValues.contains(inputValue)) {
                        attributeArray[i] = inputValue;
                        attributeValues.remove(Integer.valueOf(inputValue));
                        validInput = true;

                    } else {
                        System.out.println("Valor inválido para "+attributeNames[i]+". Os valores disponíveis são:");
                        System.out.println();

                        System.out.print("| ");
                        for(int value : attributeValues) {
                            System.out.print(value + " | ");
                        }
                        System.out.println();
                    }

                } catch (Exception e) {
                    System.out.println("Caractere inválido!");
                    s.nextLine();
                }

            } while (!validInput);
        }

        return attributeArray;
    }

    
    
}
