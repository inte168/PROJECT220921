public class pro9 {
    public static void main(String[] args) {
        int dimArray[][] = new int[4][4];

        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                int num = (int)(Math.random()*10 +1);
                dimArray[i][j] = num;
            }
        }

        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.printf("%3d", dimArray[i][j]);
            }
            System.out.print("\n");
        }
    }
}
