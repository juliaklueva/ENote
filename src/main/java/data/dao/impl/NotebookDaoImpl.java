package data.dao.impl;

import data.dao.NotebookDao;
import data.entity.Notebook;
import org.springframework.stereotype.Repository;


@Repository
public class NotebookDaoImpl extends AbstractDao<Notebook> implements NotebookDao {

    public NotebookDaoImpl() {
        setClassDao(Notebook.class);
    }
}
