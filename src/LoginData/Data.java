package LoginData;

public class Data {


    public static String loginInfo(String Login, String password, String confirmPassword) {
        String l = new String();
        String p = new String();
        String pC = new String();

        l.matches("^\\w{1,20}");
        p.matches("^\\w{1,20}");
        pC.matches("^\\w{1,20}");

        String result = "Login " + l + " password " + p + " password confirmation " + pC;

//        try {
//            loginInfo(Login,password,confirmPassword);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    return result;



    }

    static boolean loginChecking (String login) throws WrongLoginException {
        if (login.matches("^\\w{1,20}")) {
            return true;
        } else{ throw new WrongLoginException("Неправильно задан Login!");
            }
        }




    public static void main(String[] args) {
//        Data.loginInfo("Sergey", "123qwerty", "123qwerty-----");



    }

}


