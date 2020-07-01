package canabarro.fraga.finalproject.model;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Luís Felipe
 * @author Matheus Canabarro
 * @version 1.0.1
 * @since 26/06/2020 - 20:26
 */
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

@Component
@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private long id;

    @Column(name = "name")
    @NotNull(message = "Deve conter um Nome!")
    private String name;

    @Column(name = "age")
    @NotNull(message = "Deve conter uma Idade!")
    private int age;

    @Column(name = "email")
    @NotNull(message = "Deve conter um Email!")
    private String email;

    @Column(name = "phone")
    @NotNull(message = "Deve conter uma Telefone!")
    private String phone;
    @Column(name = "address")
    @NotNull(message = "Deve conter uma Endereço!")
    private String address;

}
