package repository;

import repository.Character;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

class CharacterRepository implements CRUDRepository<Character> {
  String name, player;
  int alignment, strMain, dexMain, conMain, intMain, wisMain, chaMain, lvl, race, classy, background;

  // Aqui se emplementa o Polimorfismo porque o CharacterRepository implementa a
  // Interface CRUDRepository, trazendo seus metodos (CRUD) e especificando-os
  // através do Override
  @Override
  public int create(Character entity) {
    Character newCharacter = Character(name,player,alignment, strMain, dexMain, conMain, intMain, wisMain, chaMain, lvl, race, classy, background)
     try{
      String sql = "INSERT INTO sheetmain (name, player, strMain, dexMain, conMain, intMain, wisMain, chaMain, lvl, race, classy, aligment, backGround) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      PreparedStatement statement = 
      statement.setString(1, newCharacter.name);
      statement.setString(2, newCharacter.player);
      statement.setString(3, newCharacter.alignment);
      statement.setString(4, newCharacter.strMain);
      statement.setString(5, newCharacter.dexMain);
      statement.setString(6, newCharacter.conMain);
      statement.setString(7, newCharacter.intMain);
      statement.setString(8, newCharacter.wisMain);
      statement.setString(9, newCharacter.chaMain);
      statement.setString(10, newCharacter.lvl);
      statement.setString(11, newCharacter.race);
      statement.setString(12, newCharacter.classy);
      statement.setString(12, newCharacter.background);

    ResultSet rs = statement.executeQuery();
            MyConnection.execute(sql);

  }catch(
  Exception e)
  {
    return 0;
  }

  return 1;
  }

  public ArrayList<Character> list(Character entity) {
    ArrayList<Character> entities = new ArrayList<>();

    String sql = "SELECT id, name FROM sheetmain;";

    ResultSet rs = MyConnection.execute(sql);

    if (rs == null)
      return entities;
    try {
      while (rs.next()) {
        int id = rs.getInt(1);
        String name = rs.getString(2);

        entities.add(new Character(id, name));
      }
    } catch (Exception e) {
      System.out.println("==>" + e);
    }

    return entities;
  }

  public int delete(Character entity) {

  }

  public int update(Character entity) {

  }

}

/*
 * 
 * + Character.getName() + "','" + Character.getPlayer() + "' ,'"
 * + Character.getStrMain() + "','" + Character.getDexMain() + "','"
 * + Character.getConMain() + "','" + Character.getIntMain() + "','"
 * + Character.getWisMain() + "','" + Character.getChaMain() + "','"
 * + Character.getLevel() + "','" + Character.getRace() + "' ,'"
 * + Character.getClassy() + "' ,'" + Character.getBackground() + "' ) ";
 */