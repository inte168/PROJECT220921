//3-14
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int dividend;//������
        int divisor; //������

        System.out.print("�������� �Է��ϼ���: ");
        dividend = scanner.nextInt();
        System.out.print("�������� �Է��ϼ���: ");
        divisor = scanner.nextInt();
        System.out.println(dividend+"�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
        scanner.close();
    }
}