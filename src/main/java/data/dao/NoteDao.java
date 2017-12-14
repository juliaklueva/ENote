package data.dao;

import data.entity.Note;

import java.util.List;
import java.util.Optional;


public interface NoteDao {

    void create(Note notebook);

    void update(Note notebook);

    Optional<Note> getById(long id);

    List<Note> getAll();

    void deleteById(long id);
}
