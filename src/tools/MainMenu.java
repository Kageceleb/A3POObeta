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
            System.out.println("------------- | Novo Personagem | -----------------");
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
            System.out.println("Ocorreu um erro ao criar seu Personagem.");
            System.out.println("Cuidado com os caracteres que você digita no terminal!");
            s.nextLine();
        }
    }

    public void listAllCharacters() {
        
        try {
            System.out.println("---------------------------------------------------");
            System.out.println("----------- | Lista de personagens | --------------");
            System.out.println("---------------------------------------------------");

            for (LogicCharacter character : cr.list()) {
                System.out.println("|[" + character.getId() + "]|  -  | " + character.getName() + " | um " + character.getRace().getRaceName() + " " + character.getClassy().getClassName() + " de nível " + character.getLevel() + " | Jogador: " + character.getPlayer());
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
    
                // Fazer validação de dados!!!!!!
                while (true) {
                    System.out.println("Qual o destino de " + cr.list().get(id).getName() + "?");
                    System.out.println("[1] Visualizar Ficha");
                    System.out.println("[2] Editar Dados");
                    System.out.println("[3] Subir de Nível");
                    System.out.println("[4] Excluir Personagem");
                    System.out.println("[0] Voltar ao Menu Inicial");
                    System.out.println();
                    System.out.print("Escolha: ");
                    int option = s.nextInt();
        
                    if (option < 0 || option > 4) {
                        System.out.println("Opção inválida! Escolha uma opção do menu.");
    
                    } else if (option == 0) {
                        break;
    
                    } else if (option == 1) {
                        this.showCharacter(cr.list().get(id));
    
                    } else if (option == 2) {
                        this.editCharacter(cr.list().get(id));
    
                    } else if (option == 3) {
                        this.levelUp(cr.list().get(id));
    
                    } else if (option == 4) {
                        this.deleteCharacter(cr.list().get(id));
                        break;
    
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro na alteração do personagem");
            System.out.println("Cuidado com os caracteres que você digita no terminal!");
            s.nextLine();
        }         
    }

    public void showCharacter(LogicCharacter entity) {
        System.out.println(entity);
        System.out.print("Pressione Enter para continuar ");
        s.nextLine();
    }

    public void deleteCharacter(LogicCharacter entity) {
        int charId = entity.getId();

    }

    public void editCharacter(LogicCharacter entity) {

    }

    public void levelUp(LogicCharacter entity) {

    }

    public MainMenu() {
        shutdown = false;

        do {
            
            try {
    
                System.out.println("---------------------------------------------------");
                System.out.println("------------ | Debugs & Databases | ---------------");
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
                    System.out.println("opção inválida! Escolha uma opção do menu!");

                } else if (option == 1) {
                    this.crateNewCharacter();

                } else if (option == 2) {
                    this.listAllCharacters();

                }
    
            } catch (Exception e) {
                System.out.println("Caractere inválido!");
                s.nextLine();
            }
        } while (!shutdown);
        
    }
}
