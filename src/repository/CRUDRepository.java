package repository;
import java.util.ArrayList;

abstract class CRUDRepository<E extends Entity> {
  private String tableName;
  public CRUDRepository (String tableName){
    this.tableName= tableName;
  }
  public String getTableName(){
    return this.tableName;
  }
  /**
   * Uma dada entidade que é salva no BD.
   * Retorna o id da entidade criada ou 0 se falhar.
   */
  abstract public int create(E entity);
  abstract public ArrayList<E> list();
  abstract public int update(int id, E entity);
  
  public int delete(int id) {
    String sql = "DELETE FROM sheetmain WHERE id = " + id;
    try {
      DBConnectionSingleton.execute(sql);
    } catch (Exception e) {
      return 0;
    }
    System.out.println(id);
    return 1;
  }


}