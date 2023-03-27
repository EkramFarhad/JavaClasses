package Class15;

/*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or

*/
public class Task {

    String createEmail(String firstName, String lastName, String emailType) {

        return firstName + lastName + "@" + emailType + ".com";

    }

    public static void main(String[] args) {

        Task createEmail = new Task();

        System.out.println(createEmail.createEmail("Joh","Bob","gmail"));

    }


}
