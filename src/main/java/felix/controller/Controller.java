package felix.controller;

import felix.entity.Person;
import felix.entity.User;
import felix.repository.PersonRepository;
import felix.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by felix on 7/6/16.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        Iterable<Person> persons = personRepository.findAll();
        for (Person person:
                persons) {
            System.out.println("MySQL: " + person);
        }
        Iterable<User> users = userRepository.findAll();
        for (User user :
                users) {
            System.out.println("MongoDB: " + user);
        }
        return "Hello World!!";
    }
}
