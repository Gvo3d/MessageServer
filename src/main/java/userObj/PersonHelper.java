package userObj;

import java.util.HashSet;

/**
 * Created by Gvozd on 17.01.2016.
 */
public class PersonHelper {
    private static PersonHelper instance = new PersonHelper();
    private HashSet<Person> personsdata = new HashSet<Person>();

    public static PersonHelper getInstance(){
        return instance;
    }

    public boolean addPerson(Person person){
        return personsdata.add(person);
    }

    public boolean removePerson(String login){
        boolean isRemoved = false;
        for (Person tempPerson:personsdata){
            if (tempPerson.getUser_login().equals(login)){
                personsdata.remove(tempPerson);
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    public boolean contains(String login){
        boolean isContains=false;
        for (Person tempPerson:personsdata){
            if (tempPerson.getUser_login().equals(login)){
                isContains = true;
            }
        }
        return isContains;
    }

    public Person getPerson(String login){
        Person returnable=null;
        for (Person tempPerson:personsdata){
            if (tempPerson.getUser_login().equals(login)){
                return tempPerson;
            }
        }
        return new User(-1, null, null);
    }
}
