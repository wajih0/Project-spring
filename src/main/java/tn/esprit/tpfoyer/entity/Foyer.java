package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idFoyer;
     String nomFoyer;
     Long capaciteFoyer;
    @OneToMany(cascade = CascadeType.ALL,mappedBy ="foyer")
     Set<Bloc> Blocs;

    @OneToOne(mappedBy = "foyer")
     Universite universite;
}
