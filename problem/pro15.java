import java.util.Scanner;
import java.util.InputMismatchException;

public class pro15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
        while(true) {
            try {
                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();
                System.out.print(n1 + "x" + n2 + "=" + n1*n2);
                break;
            } catch(InputMismatchException e) {
                System.out.print("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.\n");
                scanner.nextLine();
    
                continue;
            }
        }
        
        
        scanner.close();
    }
}
