//3-5
import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세요.");
        int sum = 0;
        for(int i =0; i<5;i++){
            int n = scanner.nextInt(); //키보드를 통해 정수 입력
            if(n <=0) {
                continue; //양수가 아닌경우 다음 반복으로
            }
            else{//양수면 누적.
                sum += n ;
            }
        }
        System.out.println("양수의 합은 " + sum);

        scanner.close();
    }
}
