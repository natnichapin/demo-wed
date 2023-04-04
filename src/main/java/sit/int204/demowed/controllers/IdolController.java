package sit.int204.demowed.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.support.Repositories;
import org.springframework.web.bind.annotation.GetMapping;
import sit.int204.demowed.service.IdolService;

public class IdolController {

    @Autowired
    private IdolService idolService;

}
