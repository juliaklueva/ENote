package data.entity;

import enums.Role;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String email;
    private String password;
    private String salt;
    private String name;
    @Column(name = "registration_date")
    private Long registrationDate;
    private Role role;
    private Boolean deleted;

    @OneToMany
    private List<Notebook> notebooks;
}
