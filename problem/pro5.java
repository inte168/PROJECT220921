import java.util.Scanner;

public class pro5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int tenArray[] = new int[10];

        System.out.print("���� ���� 10���� �Է��Ͻÿ�>> ");
        for(int i=0;i<10;i++){
            int num = scanner.nextInt();
            tenArray[i] = num;
        }

        System.out.print("3�� ����� ");
        for(int i =0;i<10;i++) {
            if(tenArray[i]%3==0){
                System.out.print(tenArray[i] + " ");
            }
        }
        
        scanner.close();
    }
}
