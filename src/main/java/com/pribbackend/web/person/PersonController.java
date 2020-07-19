package com.pribbackend.web.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3306)
@RestController
@RequestMapping("/persons")
public class PersonController {
    static Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired PersonRepositoryImpl repository;
}
