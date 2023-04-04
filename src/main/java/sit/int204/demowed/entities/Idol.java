package sit.int204.demowed.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Idol {
    @Id
    private int MemberId ;
    private String Name ;
    private int Age ;
    private String role ;

}
