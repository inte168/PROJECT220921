//3-9
public class foreachEx {
    enum Week { ��, ȭ, ��, ��, ��, ��, ��}

    public static void main(String[] args) {
        int [] n = {1,2,3,4,5};
        String names[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};

        int sum = 0;

        //�Ʒ����� k�� n[0], n[1]...�� �ݺ�
        for(int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("���� " + sum);

        //�Ʒ����� s�� name[0], name[1]....�� �ݺ�
        for( String s : names)
            System.out.print(s + " ");
        System.out.println();

        //�Ʒ��� day�� ��ȭ��������� �� �ݺ�
        for(Week day : Week.values())
            System.out.print(day + "���� ");
        System.out.println();
    }
}
