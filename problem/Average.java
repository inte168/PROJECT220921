public class Average {
    public static void main (String[] args) {
        if(args.length == 0) {
            return;
        }

        int sum=0;
        for (int i=0; i<args.length; i++) {
            sum += Integer.parseInt(args[i]); // ���ڸ� ������ ��ȯ�Ͽ� �ջ�
        }

        System.out.println(sum/args.length); // ��� ���
    }
}