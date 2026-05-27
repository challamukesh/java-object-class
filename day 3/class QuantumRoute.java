import java.util.Scanner;

class QuantumRoute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== QuantumRoute System =====");
        System.out.println("1. Defense Mode");
        System.out.println("2. Transport Grid");
        System.out.println("3. Finance Control");
        System.out.println("4. Surveillance Access");

        System.out.print("Enter Route Choice: ");

        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("Defense Mode Activated");
                break;

            case 2:
                System.out.println("Transport Grid Online");
                break;

            case 3:
                System.out.println("Finance Control Access Granted");
                break;

            case 4:
                System.out.println("Surveillance System Enabled");
                break;

            default:
                System.out.println("Unauthorized Route Detected");
        }

        System.out.println("System Execution Completed");

    }
}