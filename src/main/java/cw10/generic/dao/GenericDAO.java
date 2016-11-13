package cw10.generic.dao;

public interface GenericDAO<T> {

    void add(T t);

    T get(int id);

    T[] getAll();

    void update(int id, T t);

    void delete(int id);
}
