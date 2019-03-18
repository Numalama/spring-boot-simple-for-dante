package fr.numalama.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Entity say to spring: => this is an entity
 */
@Entity
/**
 * Lombok ANNOTATIONS
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="users")// by default, spring take the name of the class in lowercase
// user is like reserved keyword yeah
public class User implements Serializable {

    /**
     * AN ENTITY MUST HAVE A ID !!! OR YOU HAVE No identifier specified for entity (stupid numalama)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30)
    private String username;
    @Column(length = 30)
    private String password;
    @Column(length = 30)
    private String email;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date registered_date;
}
