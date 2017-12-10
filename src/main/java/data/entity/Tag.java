package data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany(targetEntity = Note.class, fetch = FetchType.EAGER, mappedBy = "tags")
    private List<Note> notes;
    private String content;
}
