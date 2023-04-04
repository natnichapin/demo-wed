package sit.int204.demowed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.demowed.entities.Idol;

public interface IdolRepository extends JpaRepository<Idol,Integer> {

}
