public class User {
    // Protected access modifier allows subclasses like Customer and Admin to access this field
    protected UserProfile profile;

    // Constructor initializes the user's profile
    public User(int userId, String password) {
        this.profile = new UserProfile(userId, password, "", 0, "");
    }

    // Method to log in the user by checking userId and password
    public boolean logIn(int userId, String password) {
        return profile.getUserId() == userId && profile.getPassword().equals(password);
    }

    // Method to log out the user
    public void logOut() {
        System.out.println("User " + profile.getUserId() + " logged out.");
    }
}
