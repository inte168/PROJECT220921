//3-18
public class NumException {
    public static void main(String[] args) {
        String[] stringNumber = {"23", "12", "3.141592", "998"};

        int i=0;
        try {
            for (i=0;i<stringNumber.length; i++) {
                int j = Integer.parseInt(stringNumber[i]); //3.14...�� ���ܸ� �߻���Ų��.
                System.out.println("������ ��ȯ�� ���� " + j);
            }
        }
        catch (NumberFormatException e) {//���ܰ� �߻��ϸ�.
            System.out.println(stringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
        }
    }    
}
