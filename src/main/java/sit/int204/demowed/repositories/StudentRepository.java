package sit.int204.demowed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.demowed.entities.Student;

public interface StudentRepository extends
        JpaRepository<Student, Integer> {
    //Repo  คุยกับ DBMS
}
