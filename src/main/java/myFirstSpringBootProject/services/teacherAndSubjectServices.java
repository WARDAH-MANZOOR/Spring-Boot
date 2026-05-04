package myFirstSpringBootProject.services;

import myFirstSpringBootProject.models.teacher;
import myFirstSpringBootProject.repository.subjectRepository;
import myFirstSpringBootProject.repository.teacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class teacherAndSubjectServices {

    @Autowired
    teacherRepository teacherRepo;
    @Autowired
    subjectRepository subjectRepo;

    public teacher saveTeacherWithSubjects(teacher teacher) {
        // Many-to-Many mein aksar subjects pehle se exist karte hain ya naye hote hain.
        // Cascade use karne se naye subjects khud save ho jayenge.
        return teacherRepo.save(teacher);
    }
}
