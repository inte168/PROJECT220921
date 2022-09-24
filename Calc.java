//3-13
public class Calc {
    public static void main(String[] args) {
        double sum = 0.0;

        for(int i =0;i<args.length; i++)//길이만큼 반복
            sum += Double.parseDouble(args[i]); //문자열을 실수타입(double)로 변환&누적합

        System.out.println("sum = " + sum);
    }
}
