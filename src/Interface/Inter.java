package Interface;

import java.util.List;
//D�claration des diff�rentes actions li�es � l'interface

public interface Inter<T> {

	    boolean create(T o);

	    boolean delete(T o);

	    boolean update(T o);

	    List<T> findAll();

	    T findById(int id);

	}


