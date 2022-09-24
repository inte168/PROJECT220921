//3-9
public class foreachEx {
    enum Week { 월, 화, 수, 목, 금, 토, 일}

    public static void main(String[] args) {
        int [] n = {1,2,3,4,5};
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};

        int sum = 0;

        //아래에서 k는 n[0], n[1]...로 반복
        for(int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("합은 " + sum);

        //아래에서 s는 name[0], name[1]....로 반복
        for( String s : names)
            System.out.print(s + " ");
        System.out.println();

        //아래의 day는 월화수목금토일 값 반복
        for(Week day : Week.values())
            System.out.print(day + "요일 ");
        System.out.println();
    }
}
