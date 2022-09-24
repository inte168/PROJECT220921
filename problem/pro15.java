import java.util.Scanner;
import java.util.InputMismatchException;

public class pro15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("곱하고자 하는 두 수 입력>>");
        while(true) {
            try {
                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();
                System.out.print(n1 + "x" + n2 + "=" + n1*n2);
                break;
            } catch(InputMismatchException e) {
                System.out.print("실수는 입력하면 안됩니다.\n");
                scanner.nextLine();
    
                continue;
            }
        }
        
        
        scanner.close();
    }
}
