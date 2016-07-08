package service;

import model.Person;

import java.util.Hashtable;

/**
 * Created by mounika on 7/6/2016.
 */
public class PersonService {
    Hashtable<String, Person> persons = new Hashtable<String, Person>();
    public PersonService() {
        Person p = new Person();
        p.setId("1");
        p.setAge(21);
        p.setFirstName("mouni");
        p.setLastName("turlapati");
        persons.put("1", p);

        p = new Person();
        p.setId("2");
        p.setAge(23);
        p.setFirstName("madhu");
        p.setLastName("pagadala");
        persons.put("2", p);
    }
    public Person getPerson(String id)
    {
       if(persons.containsKey(id))
           return persons.get(id);
        else
           return null;
    }
    public Hashtable<String, Person> getAll()
    {
        return persons;
    }
}
