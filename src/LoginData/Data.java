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


//        p.equals(pC);
    }



    public static void main(String[] args) {
        Data.loginInfo("Sergey", "123qwerty", "123qwerty-----");



    }
//}
//
//public class loginException extends Exception {
//
//    public WrongLoginException (String) {
//        super();
//    }
//    public WrongPasswordException (String, String) {
//
//    }
}


