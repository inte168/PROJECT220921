public class pro13 {
    public static void main(String[] args){
        for(int i =1;i<100;i++){
            if((i%10 !=0) && ((i%10)%3==0)){
                if(((i/10)%3==0)&& (i/10) !=0 ){
                    System.out.print(i +" ¹Ú¼ö Â¦Â¦\n");
                }
                else System.out.print(i +" ¹Ú¼ö Â¦\n");
            }
            else if(((i/10)%3==0)&& (i/10) !=0 ){
                System.out.print(i +" ¹Ú¼ö Â¦\n");
            }
        }
    }
}
