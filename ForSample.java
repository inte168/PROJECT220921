//3-1
public class ForSample {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=10; i++){ //1~10까지 반복
            sum += i ;
            System.out.print(i); //더하는 수
            if(i<=9)//1~9는 +
                System.out.print("+");
            else {//10은  =출력후 결과 출력.
                System.out.print("=");
                System.out.print(sum);
            }
        }

    }
}