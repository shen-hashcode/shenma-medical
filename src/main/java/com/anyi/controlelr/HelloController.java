package com.anyi.controlelr;

import com.anyi.dao.PersonRepository;
import com.anyi.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/person")
    public String save(Person person) {
        personRepository.save(person);
        System.out.println(person.toString());
        return "success";
    }

}
