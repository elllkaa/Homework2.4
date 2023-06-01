import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;




public class Main {
    public static void main(String[] args) {

        try {
          parameters("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getClass());
        }
    }

    private static void parameters(String javaSkyproGo, String D1hWiKjjP9, String D1hWiKjjP91) {
    }


}