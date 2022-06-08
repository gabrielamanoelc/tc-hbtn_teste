import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    boolean checkUser(String user){
        return user.length() >= 8 && !Pattern.compile("\\W").matcher(user).find();
    }

    boolean checkPassword(String password){
        return password.length() >= 8 && Pattern.compile("[A-Z]").matcher(password).find()
                        && Pattern.compile("\\W").matcher(password).find()
                        && Pattern.compile("\\d").matcher(password).find();
    }
}
