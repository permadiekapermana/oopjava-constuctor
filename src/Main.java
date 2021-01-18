public class Main {
    public static void main(String[] args) {
        User admin = new User("admin@gmail.com", "admin");
        System.out.println("Username: " + admin.username);
        System.out.println("Password: " + admin.password);
    }
}