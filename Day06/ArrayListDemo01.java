import java.util.ArrayList;
public class ArrayListDemo01 {
	public static void main(String[] args) {
		// ����ArrayList����
		ArrayList<String> list = new ArrayList<String>();
		// �򼯺������Ԫ��
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		// ��ȡ������Ԫ�صĸ���
		System.out.println("���ϵĳ��ȣ�" + list.size());
		// ȡ������ӡָ��λ�õ�Ԫ��
		System.out.println("��1��Ԫ���ǣ�" + list.get(0));
		System.out.println("��2��Ԫ���ǣ�" + list.get(1));
		System.out.println("��3��Ԫ���ǣ�" + list.get(2));
		System.out.println("��4��Ԫ���ǣ�" + list.get(3));
	}
}
