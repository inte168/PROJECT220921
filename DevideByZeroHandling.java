//3-15
import java.util.Scanner;

public class DevideByZeroHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("�������� �Է��ϼ���: ");
            int dividend = scanner.nextInt();
            System.out.print("�������� �Է��ϼ���: ");
            int divisor = scanner.nextInt();
            try {
                System.out.println(dividend + "�� "+ divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
                break; //�������� �Ϸ� �� while Ż��
            }
            catch(ArithmeticException e) {//����ó��.
                System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է��ϼ���.");
            }
        }
        scanner.close();
    }
}
