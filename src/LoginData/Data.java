package LoginData;

public class Data {


    public static boolean loginInfo(String login, String password, String confirmPassword) {

        try {
            return (loginChecking(login) && passwordChecking(password, confirmPassword));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    static boolean loginChecking(String login) throws WrongLoginException {
        if (login.matches("^\\w{1,20}")) {
            return true;
        } else {
            throw new WrongLoginException("Неправильно задан Login!");
        }
    }

    static boolean passwordChecking(String password, String confirmPassword) throws WrongPasswordException {
        if (password.matches("^\\w{1,20}") && password.equals(confirmPassword)) {
            return true;
        } else {
            throw new WrongPasswordException("Неправильно задан пароль!");
        }
    }


    public static void main(String[] args) {
        boolean passChecking = loginInfo("Sergey", "12345qwerty;", "12345qwerty");
        if (passChecking) {
            System.out.println("Данные введены правильно");
        } else {
            System.out.println("Данные введены не корректно");
        }
    }
}






