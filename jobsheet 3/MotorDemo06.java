package jobsheet03;

public record MotorDemo06() {
    
    public static void main(String[] args) {
        Motor06 motor1 = new Motor06();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayInfo();
    
        Motor06 motor2 = new Motor06();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true);
        motor2.setKecepatan(-200);
        motor2.displayInfo();
    
        Motor06 motor3 = new Motor06();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(115);
        motor3.displayInfo();

        }
    }