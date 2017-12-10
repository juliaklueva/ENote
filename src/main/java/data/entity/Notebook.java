package data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Notebook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    private String name;
    private Long created;
    private Long updated;
    private Boolean deleted;
}
