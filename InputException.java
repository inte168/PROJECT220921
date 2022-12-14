//3-17
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int sum=0, n=0;
        for(int i=0; i<3; i++) {
            System.out.print(i+">>");
            try {
                n = scanner.nextInt(); //정수 입력
            }
            catch(InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scanner.nextLine();//토큰 지우기
                i--;//인덱스를 미리 감소
                continue; //다음 루프로..
            }
            sum += n; //누적합
        }
        System.out.println("합은 " + sum);
        scanner.close();
    }
}
