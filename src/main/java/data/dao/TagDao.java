package data.dao;

import data.entity.Tag;

import java.util.List;
import java.util.Optional;

public interface TagDao {

    void create(Tag tag);

    void update(Tag tag);

    //  Optional<User> getByEmail(String email);

    Optional<Tag> getById(long id);

    List<Tag> getAll();

    void deleteById(long id);


}
