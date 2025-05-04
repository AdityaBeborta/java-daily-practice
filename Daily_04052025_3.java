import java.util.function.Predicate;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

public class Daily_04052025_3 {
    //    Program for user authentication by using predicate
    public static void doAuthentication(Predicate<User> userPredicate, User user) {
        if (userPredicate.test(user)) {
            System.out.println("Hurrey!! you have access to all our services");
        } else {
            System.out.println("You don't have access to our services");
        }
    }

    public static void main(String[] args) {
        User currentUser = new User("Aditya", "Java");
        Predicate<User> userPredicate = user -> user.getUsername().equals("Aditya") && user.getPassword().equals("Java");
        doAuthentication(userPredicate, currentUser);

    }
}
