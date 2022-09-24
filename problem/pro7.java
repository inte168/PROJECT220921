public class pro7 {
    public static void main(String[] args){
        int intArray[] = new int[10];

        int sum=0;
        for(int i = 0;i<10;i++) {
            int num = (int)(Math.random()*10 +1);
            intArray[i] = num;
            sum += num;
        }

        System.out.print("·£´ýÇÑ Á¤¼öµé: ");
        
        for(int i =0;i<10;i++){
            System.out.print(intArray[i] + " ");
        }

        System.out.print("\nÆò±ÕÀº " + sum);
    }
}