public class Average {
    public static void main (String[] args) {
        if(args.length == 0) {
            return;
        }

        int sum=0;
        for (int i=0; i<args.length; i++) {
            sum += Integer.parseInt(args[i]); // 인자를 정수로 변환하여 합산
        }

        System.out.println(sum/args.length); // 평균 출력
    }
}