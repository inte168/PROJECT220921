//3-7
import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5];
        int max = 0;//������ ���� ū ��.
        System.out.println("��� 5���� �Է��ϼ���.");
        for(int i=0; i<5; i++) {
            intArray[i] = scanner.nextInt();//�迭�� ���� ����1
            if(intArray[i] >max)//max���� ũ�� max���� ���� ������ ����.
                max = intArray[i];
        }
        System.out.print("���� ū ���� " + max + "�Դϴ�.");

        scanner.close();
    }    
}
