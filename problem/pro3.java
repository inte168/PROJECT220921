import java.util.Scanner;

public class pro3 {//�ǽ� 3��
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("������ �Է��Ͻÿ�>> ");
        int num = scanner.nextInt();

        for(int i =0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}