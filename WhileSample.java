//3-2
import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        int count=0; //�Էµ� ������ ����
        int sum=0; //��

        Scanner scanner = new Scanner(System.in);
        System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");

        int n = scanner.nextInt(); //���� �Է�
        while(n != -1) {//-1�� �Է��ϸ� ���� Ż��
            sum += n;
            count++;
            n = scanner.nextInt();//���� �Է�
        }
        if(count == 0)
            System.out.println("�Էµ� ���� �����ϴ�.");
        else {
            System.out.print("������ ������ " + count + "���̸� ");
            System.out.println("����� " + (double)sum/count + "�Դϴ�.");
        }

        scanner.close();
    }
}
