package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import logic.LogicCharacter;

public class CharacterRepository implements CRUDRepository<LogicCharacter> {
  

  // Aqui se emplementa o Polimorfismo porque o CharacterRepository implementa a
  // Interface CRUDRepository, trazendo seus metodos (CRUD) e especificando-os
  // através do Override
  @Override
  public int create(LogicCharacter entity) {
    try {
      String sql = "INSERT INTO sheetmain (name, player, strMain, dexMain, conMain, intMain, wisMain, chaMain, lvl, race, classy, alignment, backGround) VALUES (?,?, ?,?,?, ?,?,?, ?,?,?, ?,?)";
      PreparedStatement statement = DBConnectionSingleton.getConnection().prepareStatement(sql);
      statement.setString(1, entity.getName());
      statement.setString(2, entity.getPlayer());
      statement.setInt(3, entity.getStrMain());
      statement.setInt(4, entity.getDexMain());
      statement.setInt(5, entity.getConMain());
      statement.setInt(6, entity.getIntMain());
      statement.setInt(7, entity.getWisMain());
      statement.setInt(8, entity.getChaMain());
      statement.setInt(9, entity.getLevel());
      statement.setInt(10, entity.getRaceNumber());
      statement.setInt(11, entity.getClassNumber());
      statement.setInt(12, entity.getAlignmentNumber());
      statement.setInt(13, entity.getBGNumber());

      statement.executeUpdate();

    } catch (Exception e) {
      return 0;
    }

    return 1;
  }

  @Override
  public int delete(LogicCharacter entity) {
    return 0;

  }

  @Override
  public ArrayList<LogicCharacter> list(LogicCharacter entity) {
    ArrayList<LogicCharacter> entities = new ArrayList<>();

    return entities;
  }

  @Override
  public int update(LogicCharacter entity) {
    return 0;
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