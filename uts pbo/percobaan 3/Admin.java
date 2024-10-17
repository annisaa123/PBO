public class Admin extends User {

    // Constructor for Admin class, calling the superclass (User)
    public Admin(int userId, String password) {
        super(userId, password);
    }

    // Method to update vehicle details
    public void updateVehicleDetails(String vehicleName) {
        System.out.println("Update details for vehicle: " + vehicleName);
        // Additional logic for updating vehicle details can be added here.
    }

    // Method to delete a vehicle
    public void delVehicle(String vehicleId) {
        System.out.println("Deleted vehicle with ID: " + vehicleId);
        // Additional logic for deleting the vehicle can be added here.
    }

    // Method to verify a user
    public void verifyUser(int userId) {
        System.out.println("Verified user with ID: " + userId);
        // Additional logic for verifying the user can be added here.
    }
}
