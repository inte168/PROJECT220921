//3-6
import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit�� �Է��ϸ� �����մϴ�.");
        while(true) {
            System.out.print(">>");
            String text = scanner.nextLine();//���� �ϳ��� �б�.
            if(text.equals("exit"))//exit ���ڿ��� �Էµ� ���� ������(�ԷµȰ� exit)
                break;//�ݺ� ����.
        }
        System.out.println("�����մϴ�...");
        scanner.close();
    }
}
