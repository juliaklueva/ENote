package data.dao.impl;

import data.dao.NoteDao;
import data.entity.Note;
import org.springframework.stereotype.Repository;

@Repository
public class NoteDaoImpl extends AbstractDao<Note> implements NoteDao {

    public NoteDaoImpl() {
        setClassDao(Note.class);
    }
}
