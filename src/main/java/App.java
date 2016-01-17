import userObj.PersonHelper;
import userObj.User;

/**
 * Created by Gvozd on 17.01.2016.
 */
public class App {
    public static void main(String[] args) {
        PersonHelper pers = PersonHelper.getInstance();

        pers.addPerson(new User(1,"User0", "fuu"));
        pers.contains("User0");
        System.out.println(pers.getPerson("User0").toString());
    }
}
