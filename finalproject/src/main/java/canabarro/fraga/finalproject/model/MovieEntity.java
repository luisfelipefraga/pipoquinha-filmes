package canabarro.fraga.finalproject.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Luís Felipe
 * @author Matheus Canabarro
 * @version 1.0.1
 * @since 26/06/2020 - 17:50
 */
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

@Component
@Entity
@Table(name = "movie")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie")
    private long id;

    @Column(name = "name")
    @NotNull(message = "Deve conter um Nome!")
    private String name;

    @Column(name = "launch")
    @NotNull(message = "Deve conter um Ano!")
    private int launch;

    @Column(name = "director")
    @NotNull(message = "Deve conter um Diretor!")
    private String director;

    @Column(name = "category")
    @NotNull(message = "Deve conter uma Categoria!")
    private String category;
    @Column(name = "synopsis")
    @NotNull(message = "Deve conter uma Sinopse!")
    private String synopsis;

}
