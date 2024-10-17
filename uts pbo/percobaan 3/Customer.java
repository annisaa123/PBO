public class Customer extends User {
    private boolean verificationStatus;

    public Customer(int userId, String password) {
        super(userId, password);
        this.verificationStatus = false; // Set default verification status to false
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String document) {
        verificationStatus = true;
        profile.addDocument(document); // Use the correct method to add document
        System.out.println("Verification document: " + document + " uploaded for user " + profile.getUserId());
    }
}
