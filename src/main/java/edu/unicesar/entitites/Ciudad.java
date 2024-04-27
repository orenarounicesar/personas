package edu.unicesar.entitites;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Serdeable.Serializable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ciudades")
public class Ciudad {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "codigo_dane")
    private String codigoDane;

    @Column(name = "nombre_ciudad")
    private String nombreCiudad;

    @Column(name = "activa")
    private boolean activa;
}
