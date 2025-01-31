import java.util.Objects;

class User {
    private String name;
    private String userID;
    private String email;
    private String phoneNumber;
    private String address;

    public User(String name, String userID, String email, String phoneNumber, String address) {
        this.name = name;
        this.userID = userID;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void register() {
        System.out.println(name + " has been registered.");
    }

    public void login() {
        System.out.println(name + " has logged in.");
    }

    public void updateInfo(String newEmail, String newPhoneNumber, String newAddress) {
        this.email = newEmail;
        this.phoneNumber = newPhoneNumber;
        this.address = newAddress;
        System.out.println("Information updated: " + this);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return userID.equals(user.userID) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, email);
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', userID='" + userID + "', email='" + email + "', phoneNumber='" + phoneNumber + "', address='" + address + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", "41241", "alex@gmail.com", "71524756", "Baku");
        User user2 = new User("Michael", "41341", "michael@outlook.com", "74524756", "28 mall");

        user1.register();
        user1.login();
        user1.updateInfo("newalex@gmail.com", "12345678", "Baku, Azerbaijan");

        System.out.println("User1 information: " + user1.getName());

        if (user1.equals(user2)) {
            System.out.println("Users are the same.");
        } else {
            System.out.println("Users are different.");
        }
    }
}