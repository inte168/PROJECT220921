//3-6
import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit을 입력하면 종료합니다.");
        while(true) {
            System.out.print(">>");
            String text = scanner.nextLine();//라인 하나씩 읽기.
            if(text.equals("exit"))//exit 문자열과 입력된 값이 같으면(입력된게 exit)
                break;//반복 종료.
        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}
