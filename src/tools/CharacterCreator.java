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

        int align = 0;
        int hAlign;
        int vAlign;

        validInput = false;
        do {
            
            try {
                
                System.out.println("---------------------------------------------------");
                System.out.println("---------------- | Alinhamento | ------------------");
                System.out.println("---------------------------------------------------");
                
                while (true) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("     Quanto a visão social do seu personagem:");
                    System.out.println("---------------------------------------------------");
                    System.out.println("[1] Ele segue as regras ou leis");
                    System.out.println("[2] Ele é indiferente quanto a isso");
                    System.out.println("[3] Ele quebra as regras para conseguir o que quer");
                    System.out.print("Escolha: ");
                    hAlign = s.nextInt();
    
                    if (hAlign > 3 || hAlign < 1) {
                        System.out.println();
                        System.out.println("Aqui você ainda precisa respeitar as regras.");
                        System.out.println();
                    } else {
                        break;
                    }

                }
                
                while(true) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("      Quanto a visão moral do seu personagem:");
                    System.out.println("---------------------------------------------------");
                    System.out.println("[1] Ele é alguém bom e preza pelo bem alheio");
                    System.out.println("[2] Ele é indiferente quanto a isso");
                    System.out.println("[3] Ele é mau e não se importa com os outros");
                    System.out.print("Escolha: ");
                    vAlign = s.nextInt();
    
                    if (vAlign > 3 || vAlign < 1) {
                        System.out.println();
                        System.out.println("Aqui você ainda precisa respeitar as regras.");
                        System.out.println();
                    } else {
                        break;
                    }

                }

                System.out.println("---------------------------------------------------");

                switch(Integer.toString(hAlign) + Integer.toString(vAlign)){
                case "11":
                    System.out.println("Seu alinhamento é Leal Bom");
                    align = 1;
                    validInput = true;
                    break;
                case "31":
                    System.out.println("Seu alinhamento é Caótico Bom");
                    align = 2;
                    validInput = true;
                    break;
                case "21":
                    System.out.println("Seu alinhamento é Neutro Bom");
                    align = 3;
                    validInput = true;
                    break;
                case "12":
                    System.out.println("Seu alinhamento é Leal Neutro");
                    align = 4;
                    validInput = true;
                    break;
                case "22":
                    System.out.println("Seu alinhamento é Neutro");
                    align = 5;
                    validInput = true;
                    break;
                case "32":
                    System.out.println("Seu alinhamento é Caótico Neutro");
                    align = 6;
                    validInput = true;
                    break;
                case "13":
                    System.out.println("Seu alinhamento é Leal Mau");
                    align = 7;
                    validInput = true;
                    break;
                case "33":
                    System.out.println("Seu alinhamento é Caótico Mau");
                    align = 8;
                    validInput = true;
                    break;
                case "23":
                    System.out.println("Seu alinhamento é Neutro Mau");
                    align = 9;    
                    validInput = true;
                    break;
                }

                System.out.println("---------------------------------------------------");

            } catch (Exception e) {
                System.out.println("Caractere inválido!");
                s.nextLine();
            }

        } while(!validInput);

        return align;
    }

    public int assignRace() {

        int race = 0;
        
        validInput = false;
        do {
            try {
                System.out.println("---------------------------------------------------");
                System.out.println("-------------- | As Raças do Jogo | ---------------");
                System.out.println("---------------------------------------------------");              
                System.out.println("Neste jogo seu personagem pode ser:");
                System.out.println("[1] Humano");
                System.out.println("[2] Anão");
                System.out.println("[3] Elfo");
                System.out.println();
                System.out.print("Escolha: ");
                int inputValue = s.nextInt();

                if (inputValue > 3 || inputValue < 1) {
                        System.out.println();
                        System.out.println("Digite o número de uma Raça disponível na Lista");
                        System.out.println();

                } else {

                    System.out.println("---------------------------------------------------");

                    if (inputValue == 1) {
                        System.out.println("                     Humano");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Nos confins da maioria dos mundos, os humanos são a \nmais jovem das raças comuns, chegando mais tarde no \ncenário mundial e com uma vida curta, se comparados \naos anões, elfos e dragões. \nTalvez seja por causa de suas vidas mais curtas que \neles se esforcem para alcançar o máximo que podem nos \nanos que têm.");
                        System.out.println("---------------------------------------------------");
                        System.out.println("                  - Atributos - ");
                        System.out.println("Humanos são versáteis. Possuem +1 em todos os atributos.");

                    } else if (inputValue == 2) {
                        System.out.println("                      Anão");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Audazes e resistentes, os anões são conhecidos como \nhábeis guerreiros, mineradores e trabalhadores em \npedra e metal. Embora tenham menos de 1,50 metro de \naltura, os anões são tão largos e compactos que podem \npesar tanto quanto um humano 60 centímetros mais alto. \nSua coragem e resistência compete facilmente com \nqualquer povo mais alto.");
                        System.out.println("---------------------------------------------------");
                        System.out.println("                  - Atributos - ");
                        System.out.println("Anões recebem +2 de Força e +2 de Constituição");

                    }else if (inputValue == 3) {
                        System.out.println("                       Elfo");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Elfos são um povo mágico de graça sobrenatural, \nvivendo no mundo sem pertencer inteiramente à ele. \nEles vivem em lugares de beleza etérea, no meio de \nantigas florestas ou em torres prateadas brilhando \ncom luz feérica, onde uma música suave ecoa através \ndo ar e fragrâncias suaves flutuam na brisa.");    
                        System.out.println("---------------------------------------------------");
                        System.out.println("                  - Atributos - ");
                        System.out.println("Elfos tem +2 de Destreza e +1 de Inteligência");

                    }
                    
                    System.out.println("---------------------------------------------------");
                    System.out.println();
                    System.out.println("    Aceita essa como a Raça do seu personagem?");
                    System.out.println("              [1] Sim     [2] Não");
                    System.out.print("Escolha: ");
                    int option = s.nextInt();

                    if (option != 1 && option != 2) {
                        System.out.println("Opção inválida! Vamos recomeçar!");
                    } else if (option == 1) {
                        race = inputValue;
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


        return race;
    }

    public int assignClass() {

        int classy = 0;

        validInput = false;
        do {
            try {
                System.out.println("---------------------------------------------------");
                System.out.println("---------------- | As Classes | -------------------");
                System.out.println("---------------------------------------------------");
                System.out.println("Escolha uma Classe para o seu personagem:");
                System.out.println("[1] Guerreiro");
                System.out.println("[2] Ladino");
                System.out.println("[3] Mago");
                System.out.println("[4] Sacerdote");
                System.out.println();
                System.out.print("Escolha: ");
                int inputValue = s.nextInt();

                if (inputValue > 4 || inputValue < 1) {
                        System.out.println();
                        System.out.println("Digite o número de uma Classe disponível na Lista");
                        System.out.println();

                } else {

                    System.out.println("---------------------------------------------------");

                    if (inputValue == 1) {
                        System.out.println("                     Guerreiro");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Cavaleiros, soldados, mercenários e bandidos, como \nguerreiros, eles compartilham de uma maestria com \narmas e armaduras sem precedentes, bem como um vasto \nconhecimento e habilidades em combate.");
                        System.out.println("                  - Equipamentos - ");
                        System.out.println("Guerreiros usam Armadura Pesada e diversas armas \ncorpo a corpo e à distância.");
                        System.out.println();

                    } else if (inputValue == 2) {
                        System.out.println("                      Ladino");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Ladinos contam com sua perícia, furtividade e as \nvulnerabilidades de seus inimigos para obter vantagem \nem qualquer situação. Eles possuem uma habilidade \nespecial para encontrar a solução para praticamente \nqualquer problema, demonstrando desenvoltura e \nversatilidade, a chave de qualquer grupo aventureiro \nde sucesso.");
                        System.out.println("                  - Equipamentos - ");
                        System.out.println("Ladinos usam Armadura Leve, adagas, arcos curos e \nvários equipamentos utilitários.");
                        System.out.println();

                    } else if (inputValue == 3) {
                        System.out.println("                       Mago");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Usufruindo de uma trama sutil de magia que permeia \no cosmos, os magos conjuram magias explosivas de fogo, \narcos de relâmpagos, enganos sutis e controle de \nmentes de força bruta. Suas magias mais poderosas \npodem transformar uma substância em outra, evocar \nmeteoros que caem do céu ou abrir portais para outros \nmundos.");
                        System.out.println("                  - Equipamentos - ");
                        System.out.println("Magos não usam armadura, mas possuem vários feitiços \npoderosos para atacar e se defender.");
                        System.out.println();

                    } else if (inputValue == 4) {
                        System.out.println("                     Sacerdote");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Sacerdotes combinam o poder mágico de curar e inspirar \nseus aliados com magias que ferem e debilitam seus \ninimigos. Eles podem causar medo e pavor, espalhar \npragas ou venenos, e até lançar fogo divino para \nconsumir seus inimigos.");
                        System.out.println("                  - Equipamentos - ");
                        System.out.println("Sacerdotes usam Armadura Média, possuem magias de cura, \nmagias ofensivas e podem atacar coma maças.");
                        System.out.println();

                    }
                    
                    
                    System.out.println("---------------------------------------------------");
                    System.out.println();
                    System.out.println("  Tem certeza dessa Classe para o seu Personagem?");
                    System.out.println("              [1] Sim     [2] Não");
                    System.out.print("Escolha: ");
                    int option = s.nextInt();

                    if (option != 1 && option != 2) {
                        System.out.println("Opção inválida! Vamos recomeçar!");
                    } else if (option == 1) {
                        classy = inputValue;
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


        return classy;
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
                    System.out.println("Digite um valor para " + attributeNames[i] + ": ");
                    System.out.print("Valor: ");
                    int inputValue = s.nextInt();

                    if (attributeValues.contains(inputValue)) {
                        attributeArray[i] = inputValue;
                        attributeValues.remove(Integer.valueOf(inputValue));
                        validInput = true;

                    } else {
                        System.out.println("Valor inválido para " + attributeNames[i] + ". Os valores disponíveis são:");
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
