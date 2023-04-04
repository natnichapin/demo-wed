package sit.int204.demowed.service;

import org.springframework.beans.factory.annotation.Autowired;
import sit.int204.demowed.entities.Idol;
import sit.int204.demowed.repositories.IdolRepository;

import java.util.List;
import java.util.Optional;

public class IdolService {
    @Autowired
    private IdolRepository repository ;

    public void saveAll(List<Idol> Idols) {
        repository.saveAllAndFlush(Idols);
    }
    public String findById(Integer id) {
         Optional<Idol> idol=repository.findById(id);
         return idol.toString() ;
    } ;
    public List<Idol> getAll() {
        return repository.findAll();
    }
}
