package myFirstSpringBootProject.controllers;

import myFirstSpringBootProject.models.teacher;
import myFirstSpringBootProject.services.teacherAndSubjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class teacherAndSubjectController {
    @Autowired
    // Yahan humne pura rasta (Full Qualified Name) likh diya
    teacherAndSubjectServices service;
    @PostMapping("/teacher")
    public teacher createTeacher(@RequestBody teacher teacher) {
        return service.saveTeacherWithSubjects(teacher);
    }
}
