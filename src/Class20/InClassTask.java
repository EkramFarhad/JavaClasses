package Class20;


/*Write program: userClass  that has a constructor that initializes instance variable name and mobile number. Create
a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
 Print users name, mobile number and address in userDetails method. Test your code.*/
public class InClassTask {

    class UserClass {
        String name;
        int mobileNumber;

        UserClass(String name, int mobileNumber) {
            this.mobileNumber = mobileNumber;
            this.name = name;
        }
    }

    class UserInfo extends UserClass {
        String userAddress;

        UserInfo(String name, int mobileNumber, String userAddress) {
            super(name, mobileNumber);
            this.userAddress = userAddress;
        }

        void userDetails() {
            System.out.println("Name :" + name + " mobile number:" + mobileNumber + " address:" + userAddress);
        }
    }
}
