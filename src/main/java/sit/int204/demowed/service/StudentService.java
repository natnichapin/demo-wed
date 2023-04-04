package sit.int204.demowed.service ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sit.int204.demowed.entities.Idol;
import sit.int204.demowed.entities.Student;
import sit.int204.demowed.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    //เอา repo มาสร้างใน Service
    public void saveAll(List<Student> students) {
        repository.saveAllAndFlush(students);
    }
    public List<Student> getAll() {
        return repository.findAll();
    }//Service เรียก repo เป็นการคุยกันระหว่าง 2 Layer

    public Student findById(Integer id)  {
        return repository.findById(id).orElseThrow(
                 ()->new RuntimeException(id+ " does not exist !!!"));
    } ;

    public void save (Student s){
        repository.saveAndFlush(s);
    }

}
