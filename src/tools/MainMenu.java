package tools;

import java.util.Scanner;

import logic.LogicCharacter;
import repository.CharacterRepository;

public class MainMenu {
    
    Scanner s = new Scanner(System.in);
    CharacterRepository cr = new CharacterRepository();
    CharacterCreator cc = new CharacterCreator();

    boolean shutdown;

    public void crateNewCharacter() {

        try {
            System.out.println("---------------------------------------------------");
            System.out.println("------------- |\u001B[43m Novo Personagem \u001B[0m| -----------------");
            System.out.println("---------------------------------------------------");
            System.out.println();
            System.out.println("Vamos começar sua jornada! \n");

            Thread.sleep(2000);

            System.out.println("Vamos começar pelo seu antecedente!");
            Thread.sleep(500);
            System.out.println("Quem era seu personagem antes de se tornar um \naventureiro? \n");
            Thread.sleep(2000);
            int bg = cc.assignBG();
            System.out.println();

            Thread.sleep(1000);
            System.out.println("Seu passado e seus cicatrizes te ajudarão nos \n desafios que o futuro trará! \n");
            Thread.sleep(1000);
            System.out.println("Vamos definir a raça do seu personagem agora! \n");
            Thread.sleep(2000);
            int race = cc.assignRace();

            Thread.sleep(2000);
            System.out.println("O mundo é cheio de preconceitos e julgamentos. \nCabe a você ver além das aparências. \n");
            Thread.sleep(1000);
            System.out.println("Força de vontade sozinha não vence batalhas.");
            Thread.sleep(500);
            System.out.println("Você vai precisar lutar!");
            Thread.sleep(500);
            System.out.println("Então vamos escolher uma classe! \n");
            Thread.sleep(2000);
            int classy = cc.assignClass();

            Thread.sleep(2000);
            System.out.println("Confie nas suas habilidades, mas saiba seus limites! \n");
            Thread.sleep(1000);
            System.out.println("Se conhecer é muito importante para isso!");
            Thread.sleep(500);
            System.out.println("Vamos definir os atributos do seu personagem. \n");
            Thread.sleep(2000);
            int[] attributes = cc.assignAttributes();

            Thread.sleep(2000);
            System.out.println("Todos somos especiais de alguma maneira.");
            Thread.sleep(500);
            System.out.println("Trabalhando em grupo você vai complementar os \ntalentos de seus aliados com os seus!");
            Thread.sleep(1000);
            System.out.println("Como você vê e trata todos ao seu redor vai \ninfluenciar muito nas suas conquistas.");
            Thread.sleep(1000);
            System.out.println("Vamos definir o alinhamento do seu personagem. \n");
            Thread.sleep(2000);
            int alignment = cc.assignAlignment();

            Thread.sleep(2000);
            System.out.println("Agora que você já sabe um pouco melhor \nquem você é.");
            Thread.sleep(1000);
            System.out.println("Vamos definir um nome para o seu personagem. \n");
            
            Thread.sleep(1000);
            String name = cc.assignName("personagem");
            Thread.sleep(1000);
            
            System.out.println("E por último o seu nome, criador de personagens. \n");
            Thread.sleep(1000);

            String player = cc.assignName("jogador");

            LogicCharacter newChar = new LogicCharacter(0, name, player, alignment, attributes[0], attributes[1], attributes[2], attributes[3], attributes[4], attributes[5], 1, race, classy, bg);
            
            cr.create(newChar);
            
            System.out.println("Muito bem, " + player + ". " + name + " foi cadastrado com sucesso!");


        } catch (Exception e) {
            System.out.println("\u001B[31m Ocorreu um erro ao criar seu Personagem. \u001B[0m");
            System.out.println("\u001B[31m Cuidado com os caracteres que você digita no terminal! \u001B[0m");
            s.nextLine();
        }
    }

    public void listAllCharacters() {
        try {
            System.out.println("---------------------------------------------------");
            System.out.println("----------- |\u001B[43m Lista de personagens \u001B[0m| --------------");
            System.out.println("---------------------------------------------------");

            for (LogicCharacter character : cr.list()) {
                System.out.println("|[" + character.getId() + "]|  -  | " + character.getName() + " | " + character.getRace().getRaceName() + " " + character.getClassy().getClassName() + " de nível " + character.getLevel() + " | Jogador: " + character.getPlayer());
            }

            if (cr.list().isEmpty()) {
                System.out.println("---------------------------------------------------");
                System.out.println("           Lista de Personagens vazia!");
                System.out.println("---------------------------------------------------");
            } else {

                System.out.println("---------------------------------------------------");
                System.out.println("Digite o Id de um Personagem para alterá-lo");
                System.out.print("Id: ");
                int id = s.nextInt();
                LogicCharacter validChar= new LogicCharacter(0, null, null, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1);

                boolean validId = false;
                for (LogicCharacter character : cr.list()) {
                    if (character.getId() == id) {
                        validId = true;
                        validChar=character;
                    }
                }

                if (!validId) {
                    System.out.println("\u001B[31m Não há personagens com este Id. \u001B[0m");
                }
                
                while (validId) {
                    System.out.println("Qual o destino de " + validChar.getName() + "?");
                    System.out.println("[1] Visualizar Ficha");
                    System.out.println("[2] Editar Dados");
                    System.out.println("[3] Subir de Nível");
                    System.out.println("[4] Excluir Personagem");
                    System.out.println("[0] Voltar ao Menu Inicial");
                    System.out.println();
                    System.out.print("Escolha: ");
                    int option = s.nextInt();
        
                    if (option < 0 || option > 4) {
                        System.out.println("\u001B[31m Opção inválida! Escolha uma opção do menu \u001B[0m");
    
                    } else if (option == 0) {
                        validId = false;
    
                    } else if (option == 1) {
                        this.showCharacter(validChar);
                        System.out.print("Pressione Enter para continuar ");
                        s.nextLine();
    
                    } else if (option == 2) {
                        this.editCharacter(validChar);
    
                    } else if (option == 3) {
                        this.levelUp(validChar);
    
                    } else if (option == 4) {
                        this.deleteCharacter(validChar);
                        validId = false;
    
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("\u001B[31m Ocorreu um erro na alteração do personagem \u001B[0m"+e);
            System.out.println("\u001B[31m Cuidado com os caracteres que você digita no terminal! \u001b[0m");
            s.nextLine();
        }         
    }

    public void showCharacter(LogicCharacter entity) {
        System.out.println(entity);
        
    }

    public void deleteCharacter(LogicCharacter entity) {
        int charId = entity.getId();
        try {
            System.out.println(entity.getName() + " será destruído e todo seu legado esquecido.");
            System.out.println("Tem certeza que deseja baní-lo para o oblívio?");
            System.out.println("             [1] Sim     [2] Não");
            System.out.println();
            System.out.print("Escolha: ");
            int option = s.nextInt();

            if (option != 1 && option != 2) {
                System.out.println("Seu erro salvou a vida de " + entity.getName());
            } else if (option == 1) {
                System.out.println("Sua família e amigos sentirão sua falta.");
                System.out.println("As rolagens de iniciativa não serão as mesmas.");
                System.out.println("Tem certeza da sua decisão? ... monstro");
                System.out.println("             [1] Sim     [2] Não");
                System.out.println();
                System.out.print("Escolha: ");
                option = s.nextInt();

                if (option != 1 && option != 2) {
                    System.out.println("Seu erro salvou a vida de " + entity.getName());

                } else if (option == 1) {
                    System.out.println("Que assim seja...");
                    cr.delete(charId);

                } else {
                    System.out.println(entity.getName() + "não esquecerá sua misericórdia.");
                }

            } else {
                System.out.println(entity.getName() + " viverá mais um dia.");
            }
            
        } catch (Exception e) {
            System.out.println("Mometo triste...");
            System.out.println("Despedida de um personagem...");
            System.out.println("E você brincando no terminal...");
            s.nextLine();
        } 
    }

    public void editCharacter(LogicCharacter entity) {
        
        try {
            int id = entity.getId();
            String name = entity.getName();
            String player = entity.getPlayer();
            int alignment = entity.getAlignmentNumber();
            int[] attributes = new int[6];
            attributes[0] = entity.getStrMain();
            attributes[1] = entity.getDexMain();
            attributes[2] = entity.getConMain();
            attributes[3] = entity.getIntMain();
            attributes[4] = entity.getWisMain();
            attributes[5] = entity.getChaMain();
            int level = entity.getLevel();
            int race = entity.getRaceNumber();
            int classy = entity.getClassNumber();
            int bg = entity.getBGNumber();
            
            boolean validated = false;

            while(!validated) {
                System.out.println("---------------------------------------------------");
                System.out.println("----------- |\u001B[43m Edição de personagens \u001B[0m| --------------");
                System.out.println("---------------------------------------------------");
                System.out.println();
                System.out.println("O que será alterado em " + name + "?");
                System.out.println("[1] Nome");
                System.out.println("[2] Jogador");
                System.out.println("[3] Alinhamento");
                System.out.println("[4] Atributos");
                System.out.println("[5] Raça");
                System.out.println("[6] Classe");
                System.out.println("[7] Background");
                System.out.println();
                System.out.println("[9] Salvar");
                System.out.println("[0] Cancelar");
                System.out.println();
                System.out.print("Escolha: ");
                int option = s.nextInt();
    
                if (option < 0 || option > 9) {
                    System.out.println("Escolha um número do menu.");
                } else if (option == 0) {
                    System.out.println("De volta do menu!");
                    break;
                } else {
                    
                    switch (option) {
                        case 1:
                            name = cc.assignName("personagem");
                        break;
                        case 2:
                            player = cc.assignName("jogador");
                        break;
                        case 3:
                            alignment = cc.assignAlignment();
                        break;
                        case 4:
                            attributes = cc.assignAttributes();
                        break;
                        case 5:
                            race = cc.assignRace();
                        break;
                        case 6:
                            classy = cc.assignClass();
                        break;
                        case 7:
                            bg = cc.assignBG();
                        break;
                        case 9:
                            validated = true;
                        break;
                    }
                }

            }
            
            if (validated) {
                LogicCharacter editChar = new LogicCharacter(id, name, player, alignment, attributes[0], attributes[1], attributes[2], attributes[3], attributes[4], attributes[5], level, race, classy, bg);
        
                cr.update(id, editChar);

                System.out.println("Tudo salvo! " + name + " é um " + editChar.getRace().getRaceName() + " novo em folha!");
            }

        } catch (Exception e) {
            System.out.println("\u001B[31m Ocorreu um erro na alteração do personagem \u001B[0m"+e);
            System.out.println("\u001B[31m Cuidado com os caracteres que você digita no terminal! \u001b[0m");
            s.nextLine();
        }
    }

    public void levelUp(LogicCharacter entity) {
        int nextLevel = entity.getLevel()+1;

        try {
            System.out.println("---------------------------------------------------");
            System.out.println("---------------- |\u001B[43m Level Up! \u001B[0m| --------------------");
            System.out.println("---------------------------------------------------");
            System.out.println();
            System.out.println(entity.getName());
            System.out.println("Um " + entity.getClassy().getClassName() + " nível " + entity.getLevel()); 

            if (nextLevel > 20) {
                System.out.println("Chegou ao limite da sua jornada. Já é um lenda!");
            } else {
                System.out.println("Será promovido ao nível " + nextLevel);
                System.out.println("       Está certo disso?");
                System.out.println("      [1] Sim     [2] Não");
                System.out.println();
                System.out.print("Escolha: ");
                int option = s.nextInt();

                if (option != 1 && option != 2) {
                    System.out.println("\u001B[31m Opção inválida! De volta ao menu inicial.\u001B[0m");

                } else if (option == 1) {
                    entity.setLevel(nextLevel);
                    cr.update(entity.getId(), entity);
                    System.out.println(entity.getName() + " subiu para o nível " + nextLevel + "!");
                    
                } else {
                    System.out.println("Existe o momento certo para tudo.");
                }
            }


        } catch (Exception e) {
            System.out.println("\u001b[31m Ocorreu um erro no level up do seu Personagem.\u001B[0m");
            System.out.println("\u001b[31m Cuidado com os caracteres que você digita no terminal! \u001B[0m");
            s.nextLine();
        }
    }

    public MainMenu() {
        shutdown = false;

        do {          
            try {    
                System.out.println("---------------------------------------------------");
                System.out.println("------------ |\u001B[43m Debugs & Databases \u001B[0m| ---------------");
                System.out.println("---------------------------------------------------");
                System.out.println();
                System.out.println("  Bem-vindo ao gerenciador de personagens de D&D!");
                System.out.println();
                System.out.println("         O que você gostaria de fazer?");
                System.out.println("[1] Criar um Novo Personagem");
                System.out.println("[2] Listar Personagens Cadastrados");
                System.out.println("[0] Sair");
                System.out.println();
                System.out.print("Escolha: ");
                int option = s.nextInt();

                if (option == 0) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Obrigado por usar nosso App!");
                    System.out.println("Programa Desenvolvido por Sammuel SantAnna e Diego Rocha");
                    System.out.println("Todos os Direitos reservados à Wizards of the Coast");
                    System.out.println("---------------------------------------------------");
                    shutdown = true;
                } else if (option < 0 || option > 2) {
                    System.out.println("\u001b[31m opção inválida! Escolha uma opção do menu! \u001B[0m");

                } else if (option == 1) {
                    this.crateNewCharacter();

                } else if (option == 2) {
                    this.listAllCharacters();
                }
    
            } catch (Exception e) {
                System.out.println("\u001b[31m Caractere inválido! \u001B[0m"+e);
                s.nextLine();
            }
        } while (!shutdown);       
    }
}
