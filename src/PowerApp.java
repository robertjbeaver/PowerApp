import java.util.Scanner;

public class PowerApp {
    
    public static void main(String[] args) {       
        System.out.println("Welcome to the Squares and Cubes application\n");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {            
            System.out.print("Enter an integer: ");
            
            int numChoice = sc.nextInt();
            String table = "";
            
            table += "Number\tSquared\tCubed\n";
            table += "------\t------\t------\n";
            
            for (int i = 1; i <= numChoice; i++) {
                int square = i * i;
                int cube = i * i * i;
                table += i + "\t" + square + "\t" + cube + "\n";
            }
            System.out.println(table);
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            
        }
        sc.close(); 
        System.out.println("Bye!");
    }
}
