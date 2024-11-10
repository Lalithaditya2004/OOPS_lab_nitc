import java.util.*;


public class Q2{
    public static void main(String[] args) {
        SessionManager n = SessionManager.getInstance();
        n.login("sravanthi","1423");

    }
}

class User{
    private String username;
    private String password;
    public User(String u,String p){
        this.username = u;
        this.password = p;
    }
    public String getUser(){
        return username;
    }
    public String pass(){
        return password;
    }
}

class SessionManager{
    private final List<User> db = new ArrayList<>();

    
    private SessionManager(){
        db.add(new User("sravanthi","143"));
        db.add(new User("Sidhu","1234"));
        db.add(new User("Aditya","890"));
        db.add(new User("Praval","abc222"));
    }
    private static SessionManager n = new SessionManager();
    public static SessionManager getInstance(){
        return n;
    }
    public void login(String username,String password){
        for (User user : db) {
            if (user.getUser().equals(username) && user.pass().equals(password)) {
                System.out.println("Login successful for user: " + username);
                return;
            }
        }
        System.out.println("Login failed for user: " + username);
    }
}