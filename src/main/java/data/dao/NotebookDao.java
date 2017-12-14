package data.dao;

import data.entity.Note;
import data.entity.Notebook;
import data.entity.User;

import java.util.List;
import java.util.Optional;


public interface NotebookDao {

 /*   void create(Notebook notebook);

    void update(Notebook notebook);

    Optional<Notebook> getById(long id);

    List<Notebook> getAll();

    void deactivate(long id); */

    void create(Notebook notebook);

    void update(Notebook notebook);

    //  Optional<User> getByEmail(String email);

    Optional<Notebook> getById(long id);

    List<Notebook> getAll();

    void deleteById(long id);
}
