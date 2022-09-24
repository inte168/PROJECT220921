//3-4
public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){//1~9단
            for(int j =1; j<10; j++) {
                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print("\t");//탭으로 하나씩 띄우기
            }
            System.out.println(); //한 단마다 개행
        }
    }    
}
