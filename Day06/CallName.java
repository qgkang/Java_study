import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class CallName{
	public static void main(String[] args) {
		//1.1����һ�����Դ洢���ͬѧ���ֵ�����
		ArrayList<Student> list = new ArrayList<Student>();
		/*
		 * 1.�洢ȫ��ͬѧ��Ϣ
		 */
		addStudent(list);
		/*
		 * 2.��ӡȫ��ͬѧÿһ���˵���Ϣ�����������䣩
		 */
		printStudent(list);
		/*
		 * 3.�����ѧ����������ӡѧ����Ϣ
		 */
		randomStudent(list);
	}

	/**
	 * 1.�洢ȫ��ͬѧ����
	 */
	public static void addStudent(ArrayList<Student> list){
		//����������ͬѧ���ִ洢��������
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			//����ѧ��
			Student s = new Student();
			System.out.println("�洢��"+i+"��ѧ��������");
			s.name = sc.next();
			System.out.println("�洢��"+i+"��ѧ�����䣺");
			s.age = sc.nextInt();
			//���ѧ��������
			list.add(s);
		}
	}

	public static void printStudent (ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println("������"+s.name +",���䣺"+s.age);
		}
	}

	public static void randomStudent (ArrayList<Student> list) {
		//�ڰ༶��������Χ�ڣ��������һ�������
		int index = new Random().nextInt(list.size());
		//��������ArrayList���ϣ��У����Ҹ����������Ӧ��ͬѧ��Ϣ�����������䣩
		Student s = list.get(index);
		System.out.println("�����������ͬѧ��"+s.name + "������:" + s.age);
	}
}