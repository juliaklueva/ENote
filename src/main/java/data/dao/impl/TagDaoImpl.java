package data.dao.impl;

import data.dao.TagDao;
import data.entity.Tag;
import org.springframework.stereotype.Repository;

@Repository
public class TagDaoImpl extends AbstractDao<Tag> implements TagDao {

    public TagDaoImpl() {
        setClassDao(Tag.class);
    }
}
