package repository;
import java.util.ArrayList;

abstract interface CRUDRepository<E extends Entity> {
  /**
   * Given an entity saves to the DB.
   * Return the id of the created entity or 0 if fails
   */
  abstract public int create(E entity);
  abstract public ArrayList<E> list(E entity);
  abstract public int delete(E entity);
  abstract public int update(E entity);
}