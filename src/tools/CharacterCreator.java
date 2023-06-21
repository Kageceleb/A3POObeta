package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import logic.Interfaces.Background;

public class CharacterCreator{

    Scanner s = new Scanner(System.in);
    boolean validInput = false;

    public String assignName(String entity) {

        validInput = false;
        String name = null;

        do {
            try {
                System.out.print("Nome do " + entity + ": ");
                name = s.nextLine();

                if (name.contains("'")) {
                    System.out.println("O nome do " + entity + " não pode conter ' (aspas simples). Escolha outro nome.");

                } else if (name.length()>30) {
                    System.out.println("Escolha um nome com no máximo 30 (trinta) caracteres.");

                } else {
                    validInput = true;
                }
                
            } catch (Exception e) {
                System.out.println("Ocorreu um erro nomeando o " + entity + "!");
                
            }
            
        } while (!validInput);
        
        return name;
    }

    public int assignBG() {
        BGList bgList = new BGList();
        ArrayList<Background> bgs = bgList.getBGList();
        int chosenBG = 0;
        
        
        validInput = false;
        do {
            
            try {
                System.out.println("---------------------------------------------------");
                System.out.println("---------------- | Antecedentes | -----------------");
                System.out.println("---------------------------------------------------");
        
                for (Background bg : bgs) {
                    System.out.println("[" + (bgs.indexOf(bg)+1) + "]" + " - " + bg.getBGName());
                }
                System.out.println("---------------------------------------------------");
                System.out.print("Escolha um antecedente: ");
                int inputValue = s.nextInt();
    
                if (inputValue > bgs.size() || inputValue < 1) {
                    System.out.println();
                    System.out.println("O valor precisa ser um número dentro da lista abaixo");
                } else {
                    System.out.println("---------------------------------------------------");
                    System.out.println("----- |  " + bgs.get((inputValue-1)).getBGName() + "  | -----");
                    System.out.println("Descrição");
                    System.out.println(bgs.get((inputValue-1)).getBGDescription());
                    System.out.println("Habilidades");
                    System.out.println(bgs.get((inputValue-1)).getBGBonuses());
                    System.out.println("Itens iniciais");
                    System.out.println(bgs.get((inputValue-1)).getBGItems());
                    System.out.println("---------------------------------------------------");

                    System.out.println("Deseja escolher este Antecedente?");
                    System.out.println("    [1] Sim     [2] Não");
                    System.out.print("Escolha: ");
                    int option = s.nextInt();

                    if (option != 1 && option != 2) {
                        System.out.println("Opção inválida! Vamos recomeçar!");
                    } else if (option == 1) {
                        chosenBG = inputValue;
                        validInput = true;
                    } else {
                        System.out.println("Tudo bem. De volta ao início.");
                    }
                        
                }
                
            } catch (Exception e) {
                System.out.println("Caractere inválido!");
                s.nextLine();
            }

        } while(!validInput);

        return chosenBG;
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
