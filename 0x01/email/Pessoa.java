public class Pessoa {

    boolean emailValid(String email){
        return email.contains("@") && email.length() <= 50;
    }
}
