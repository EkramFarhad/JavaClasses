package Class12;

public class InClassTask {
    public static void main(String[] args) {
        /*
        Store username, password and confirm password from a user and check following requirements:

        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”
        */

        String userName = "User Name";
        String passWord = "Password";

        if (userName.isBlank() && passWord.isBlank()) {
            System.out.println("UserName and password can not be empty");
        } else if (passWord.length() >= 8) {
            System.out.println("Password is too short");
        } else if (!passWord.equals(userName)) {
            System.out.println("Password contain user name");
        }

        System.out.println();
    }



}
