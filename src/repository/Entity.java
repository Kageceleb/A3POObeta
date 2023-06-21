package repository;
//algo que será salvo no BD
//Extende todas entidades que terão contato com o BD, demonstrando o princípio da Herança
public abstract class Entity {
  private int id;

  public Entity(int id) {
    this.id = id;
  }

  public int getId(){
    return this.id;
  }

}