import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

public class Parameters {
    private String login;
    private String password;
    private String confirmPassword;

    public Parameters(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public static void conditionsParameters(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин должен быть не более 20 сиволов");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль должен быть не более 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
