package git.tryaymen.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class eventTry implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long idEvent;
        String titreEvent;
        LocalDate DateEvent;
        String imageEvent;
        int nrParticipants;
        int nbTotalPlace;
        String adresseEvent;


}
