package repository;
import java.util.ArrayList;

abstract interface CRUDRepository<E> {
  /**
   * Given an entity saves to the DB.
   * Return the id of the created entity or 0 if fails
   */
  abstract public int create(E entity);
  abstract public ArrayList<E> list();
  abstract public int delete(int id);
  abstract public int update(int id, E entity);
}