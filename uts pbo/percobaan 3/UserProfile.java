import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private List<String> documents;

    // Constructor
    public UserProfile(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.documents = new ArrayList<>();
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    // Setter for profile information
    public void setProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    // Method to show documents
    public List<String> showDocuments() {
        return documents;
    }

    // Method to add document
    public void addDocument(String document) {
        documents.add(document);
    }
}
