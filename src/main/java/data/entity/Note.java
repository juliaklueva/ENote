package data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Notebook notebook;
    @ManyToMany(targetEntity = Tag.class, fetch = FetchType.EAGER, mappedBy = "notes")
    private List<Tag> tag;
    private String title;
    @Lob
    @Column(length = 2048, nullable = false)
    private String content;
    private Long created;
    private Long updated;
    private Boolean deleted;
}
