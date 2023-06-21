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
  public ArrayList<LogicCharacter> list() {
    ArrayList<LogicCharacter> entities = new ArrayList<>();

    String sql = "SELECT * FROM sheetmain ORDER by id";
    ResultSet rs = DBConnectionSingleton.read(sql);
    if (rs != null) {
      try {
        while (rs.next()) {

          int id = rs.getInt(1);
          String name = rs.getString(2);
          String player = rs.getString(3);
          int strMain = rs.getInt(4);
          int dexMain = rs.getInt(5);
          int conMain = rs.getInt(6);
          int intMain = rs.getInt(7);
          int wisMain = rs.getInt(8);
          int chaMain = rs.getInt(9);
          int lvl = rs.getInt(10);
          int race = rs.getInt(11);
          int classy = rs.getInt(12);
          int alignment = rs.getInt(13);
          int backGround = rs.getInt(14);
          LogicCharacter char1 = new LogicCharacter(id, name, player, alignment, strMain, dexMain, conMain, intMain,
              wisMain, chaMain, lvl, race, classy, backGround);
          entities.add(char1);

        }
      } catch (Exception e) {
        System.out.println("==>" + e);
      }
    }

    return entities;
  }

  @Override
  public int delete(int id) {
    String sql = "DELETE FROM sheetmain WHERE id = " + id;
    DBConnectionSingleton.execute(sql);
    System.out.println(id);
    return 0;
  }


  @Override
  public int update(int id, LogicCharacter entity) {
    
      try {
            String sql = "UPDATE sheetmain SET name = ?, player = ?, strMain = ?, dexMain = ?, conMain = ?, intMain = ?, wisMain = ?, chaMain = ?, lvl = ?, race = ?, classy = ?, alignment = ?, backGround = ? WHERE id=" + id;
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

}