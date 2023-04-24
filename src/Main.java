public class Main {
    public static void main(String[] args) {
        String login = "234hj";
        String password = "usa67f0";
        String confirmPassword = "usa67f0";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Получили ошибку логина");
            wrongLoginException.printStackTrace();
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Получили ошибку пароля");
            wrongPasswordException.printStackTrace();
        }
    }
}