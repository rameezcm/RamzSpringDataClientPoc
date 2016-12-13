package sa.gosi.mvc.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sa.gosi.mvc.entity.Person;
import sa.gosi.mvc.service.PersonService;
@Controller
@CrossOrigin(origins ="http://localhost:4200" ,maxAge = 3600)
@RequestMapping("/person")
public class PersonController {
    protected static final int DEFAULT_PAGE_NUM = 0;
    protected static final int DEFAULT_PAGE_SIZE = 5;

    @Inject
    protected PersonService personService;

    protected static final Logger LOGGER = LoggerFactory
            .getLogger(PersonController.class);

    
    @RequestMapping(value = "/getlist" ,method=RequestMethod.GET)
    public  @ResponseBody List<Person>  getlist() {
        List<Person> persons = personService.getAll();
        return persons;
    }
    
    @CrossOrigin()
    
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public @ResponseBody String addUser(@RequestBody Person person) {
    	System.out.println("Saving the Person :: "+person.getName());
        personService.insert(person);
        return "User Added";
    }
}
