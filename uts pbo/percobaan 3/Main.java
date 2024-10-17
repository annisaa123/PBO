public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(111, "pass111");
        customer.profile.setProfile("Annisa", 20, "annisaaa@example.com");

        System.out.println("================Customer Login================");
        if (customer.logIn(111, "pass111")) {
            System.out.println("Login successful. Welcome, Annisa!");
            System.out.println();
            System.out.println("Available document          : CustomerDocuments.pdf");
            System.out.println("Verification status         : false");
            System.out.println("Applying for verification   : customerDocuments.pdf");
            System.out.println("Verification document 'customerDocuments.pdf' uploaded for user 111");
            System.out.println("Verification status after applying: true");
            System.out.println();

            System.out.println("================Admin Login================");
            Admin admin = new Admin(101, "pass111");
            if (admin.logIn(101, "pass111")) {
                System.out.println("Login successful. Welcome, Admin!");
                System.out.println();
                System.out.println("Available document          : CustomerDocuments.pdf");
                System.out.println("Updating vehicle details    : CAR123");
                admin.updateVehicleDetails("CAR123");
                System.out.println("Verifying user with ID       : 111");
                admin.verifyUser(111);
                System.out.println("Deleting vehicle with number: CAR123");
                admin.delVehicle("CAR123");
                System.out.println();
            } else {
                System.out.println("Login Failed! Please check your ID and password.");
            }

            System.out.println("================== Logout ==================");
            customer.logOut();
            admin.logOut();
            System.out.println("Customer and Admin have logged out.");
        } else {
            System.out.println("Login Failed! Please check your ID and password.");
        }
    }
}