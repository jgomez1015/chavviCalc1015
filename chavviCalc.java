// jason gomez, student id; 1046059 
// start of chavviCalc program

package.com.chavviCalc1015; 
import java.util.Scanner; 

public class chavviCalculator { 
    public static void main(String [] args) {

    Scanner scan = new Scanner(System.in);
    Character command = '_';
    double A = 0;
    double B = 0; 

    while (command ! = 'q') {
        printMenu(A, B);
        System.out.print("Enter a command: ");
        command = menuGetCommand(scan);

        if (!executeCommand(scan, command, A, B)) {
            System.out.println("Invalid command. Please try again from available commands. ");
        }
    }
    scan.close();
    }
        private static void printMenuLine() {
        System.out.println("--------------------------");
        }
        private static void printMenuCommand(Character command, String desc) {
            System.out.printf("%s\t%s\n", command, desc);
        }
        public static void printMenu(double A, double B) {
        System.out.println(" Chavvi Calculatinator ");
        printMenuLine();
        System.out.println(" A = " + A + " B = " + B);
        printMenuLine(); 
        System.out.println("a      Enter a Value for A");
        System.out.println("b      Enter a Value for B");
        System.out.println("+      Add");
        System.out.println("-      Subtract");
        System.out.println("*      Multiply");
        System.out.println("/      Divide");
        System.out.println("c      Clear");
        System.out.println("q      Quit");
        printMenuLine();
        System.out.println("\n");         
    }        

        private static Character menuGetCommand(Scanner scan) { 
            Character command = '_';
            String rawInput = scan.nextLine(); 

            if (rawInput.length() > 0) {
                rawInput = rawInput.toLowerCase();
                command = rawInput.charAt(0);
            }
            return command; 
        }
        
        private static Boolean executeCommand(Scanner scan, Character command, double A, double B) {
            Boolean success = true; 

            switch (command) {
                case 'a': 
                System.out.print("Enter value for A: ");
                A = scan.nextDouble(); 
                scan.nextline();
                break; 
                case 'b': 
                System.out.print("Enter value for B: ");
                B = scan.nextDouble();
                scan.nextLine(); 
                break; 
                case '+';
                System.out.println("Result is: " + (A + B));
                break; 
                case '-';
                System.out.println("Result is: " + (A - B));
                break; 
                case '*';
                System.out.println("Result is: " + (A * B));
                break; 
                case '/';
                if (B != 0) {
                    System.out.print("Result is: " + (A / B ));
                } else {
                    System.out.println("Error: Can't divide by zero silly!");
                }
                break; 
                case 'c': 
                A = 0;
                B = 0; 
                System.out.println("Values reset for A and B.");
                break; 
                case 'q': 
                System.out.println("Thanks for using ChavviCalc!");
                System.out.println("Run this again whenever needed and take care!");
                break; 
            default: 
                success = false; 
            }
            return success; 
        }
    }
