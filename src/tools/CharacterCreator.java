package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CharacterCreator {

    public int[] assignAttributes() {

        int[] attributeArray = new int[6];

        try (Scanner s = new Scanner(System.in)) {
            ArrayList<Integer> attributeValues = new ArrayList<>(Arrays.asList(15, 14, 13, 12, 10, 8));

            int tempStr = 0;
            int tempDex = 0;
            int tempCon = 0;
            int tempInt = 0;
            int tempWis = 0;
            int tempCha = 0;

            boolean validInput = false;

            System.out.println("Valores disponíveis:");
            System.out.print(" | ");
            for(int value : attributeValues) {
                System.out.print(value + " | ");
            }
            System.out.println();

            do {
                try {
                    System.out.println("Digite um valor para Força: ");
                    int inputValue = s.nextInt();
                    if (attributeValues.contains(inputValue)) {
                        tempStr = inputValue;
                        attributeValues.remove(Integer.valueOf(inputValue));
                        validInput = true;
                    } else {
                        System.out.println("Valor inválido para Força. Os valores disponíveis são:");
                        System.out.println();
                        System.out.print(" | ");
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

            System.out.println("Valores disponíveis:");
            System.out.print(" | ");
            for(int value : attributeValues) {
                System.out.print(value + " | ");
            }
            System.out.println();

            validInput = false;
            do {
                try {
                    System.out.println("Digite um valor para Destreza: ");
                    int inputValue = s.nextInt();
                    if (attributeValues.contains(inputValue)) {
                        tempDex = inputValue;
                        attributeValues.remove(Integer.valueOf(inputValue));
                        validInput = true;
                    } else {
                        System.out.println("Valor inválido para Destreza. Os valores disponíveis são:");
                        System.out.println();
                        System.out.print(" | ");
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

            System.out.println("Valores disponíveis:");
            System.out.print(" | ");
            for(int value : attributeValues) {
                System.out.print(value + " | ");
            }
            System.out.println();

            validInput = false;
            do {
                try {
                    System.out.println("Digite um valor para Constituição: ");
                    int inputValue = s.nextInt();
                    if (attributeValues.contains(inputValue)) {
                        tempCon = inputValue;
                        attributeValues.remove(Integer.valueOf(inputValue));
                        validInput = true;
                    } else {
                        System.out.println("Valor inválido para Constituição. Os valores disponíveis são:");
                        System.out.println();
                        System.out.print(" | ");
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

            System.out.println("Valores disponíveis:");
            System.out.print(" | ");
            for(int value : attributeValues) {
                System.out.print(value + " | ");
            }
            System.out.println();

            validInput = false;
            do {
                try {
                    System.out.println("Digite um valor para Inteligência: ");
                    int inputValue = s.nextInt();
                    if (attributeValues.contains(inputValue)) {
                        tempInt = inputValue;
                        attributeValues.remove(Integer.valueOf(inputValue));
                        validInput = true;
                    } else {
                        System.out.println("Valor inválido para Inteligência. Os valores disponíveis são:");
                        System.out.println();
                        System.out.print(" | ");
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

            System.out.println("Valores disponíveis:");
            System.out.print(" | ");
            for(int value : attributeValues) {
                System.out.print(value + " | ");
            }
            System.out.println();

            validInput = false;
            do {
                try {
                    System.out.println("Digite um valor para Sabedoria: ");
                    int inputValue = s.nextInt();
                    if (attributeValues.contains(inputValue)) {
                        tempWis = inputValue;
                        attributeValues.remove(Integer.valueOf(inputValue));
                        validInput = true;
                    } else {
                        System.out.println("Valor inválido para Sabedoria. Os valores disponíveis são:");
                        System.out.println();
                        System.out.print(" | ");
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

            System.out.println("Valores disponíveis:");
            System.out.print(" | ");
            for(int value : attributeValues) {
                System.out.print(value + " | ");
            }
            System.out.println();

            validInput = false;
            do {
                try {
                    System.out.println("Digite um valor para Carisma: ");
                    int inputValue = s.nextInt();
                    if (attributeValues.contains(inputValue)) {
                        tempCha = inputValue;
                        attributeValues.remove(Integer.valueOf(inputValue));
                        validInput = true;
                    } else {
                        System.out.println("Valor inválido para Carisma. Os valores disponíveis são:");
                        System.out.println();
                        System.out.print(" | ");
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

            attributeArray[0] = tempStr;
            attributeArray[1] = tempDex;
            attributeArray[2] = tempCon;
            attributeArray[3] = tempInt;
            attributeArray[4] = tempWis;
            attributeArray[5] = tempCha;
        }
        return attributeArray;
    }
    
}
