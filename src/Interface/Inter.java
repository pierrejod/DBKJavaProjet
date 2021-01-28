package Interface;

import java.util.List;
//Déclaration des différentes actions liées à l'interface

public interface Inter<T> {

	    boolean create(T o);

	    boolean delete(T o);

	    boolean update(T o);

	    List<T> findAll();

	    T findById(int id);

	}


