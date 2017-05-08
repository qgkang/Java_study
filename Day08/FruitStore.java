import java.util.Scanner;
import java.util.ArrayList;
public class FruitStore {
	public static void main(String[] args) {
		//��������,��¼ÿ����Ʒ��Ϣ
		ArrayList<FruitItem> list = new ArrayList<FruitItem>();
		/*
		 * 1.������Ʒ��ʼ��
		 */
		init(list);
		
		while(true){
			/*
			 * 2.��ʾ���˵�
			 */
			mainMenu();
			/*
			 * 3.���ݽ��յ��Ĺ���ѡ�ִ�ж�Ӧ�Ĺ���
			 */
			chooseFunction(list);
		}
	}
	
	public static void init(ArrayList<FruitItem> list) {
		FruitItem item = new FruitItem();
		item.name = "�������ֱ�����";
		item.ID = 9001;
		item.price = 120;
		
		FruitItem item2 = new FruitItem();
		item2.name = "�п�����ĵ����";
		item2.ID = 9002;
		item2.price = 20;
		
		FruitItem item3 = new FruitItem();
		item3.name = "�½�ԭ�����ܹ�";
		item3.ID = 3;
		item3.price = 9007;
		
		list.add(item);
		list.add(item2);
		list.add(item3);
	}
	
	public static void mainMenu() {
		 System.out.println("=========================��ӭ����itcast����=========================");
		 System.out.println("1:��ѯ����  2������»��� 3:ɾ������ 4���޸Ļ���");
		 System.out.println("5���˳�ϵͳ");
	}
	
	public static void chooseFunction(ArrayList<FruitItem> list) {
		System.out.println("��������Ҫ�����Ĺ�����ţ�");
		Scanner sc = new Scanner(System.in);//�����������
		String choose = sc.next();
		//���ݽ��յ���ѡ��ִ�ж�Ӧ�Ĺ���
		switch (choose) {
		case "1": //3.1.�������ѯ
			showFruitList(list);
			break;
		case "2": //3.2.����»���
			addFruitItem(list);
			break;
		case "3": //3.3.ɾ������
			delFruitItem(list);
			break;
		case "4": //3.4.�޸Ļ���
			updateFruitItem(list);
			break;
		case "5": //3.5.�˳�ϵͳ,�˳�JVM
			System.out.println("�˳�ϵͳ");
			return;
		default:
			System.out.println("�Բ���û��������Ĺ��ܣ�������ѡ��");
			break;
		}
	}
	
	public static void showFruitList(ArrayList<FruitItem> list) {
		System.out.println("=======================��Ʒ����嵥=======================");
		System.out.println("��Ʒ���\t��Ʒ����\t\t��Ʒ����");
		//��ѯÿ�ֿ����Ʒ��Ϣ
		for (int i = 0; i < list.size(); i++) {
			FruitItem item = list.get(i);
			System.out.println(item.ID + "\t" + item.name + "\t" + item.price);
		}
	}
	
	public static void addFruitItem(ArrayList<FruitItem> list) {
			
			//�����»�ȡ����
			FruitItem newItem = new FruitItem();
			Scanner sc = new Scanner(System.in);//�����������
			//��ʾ������Ϣ
			System.out.print("��������ˮ��������:");
			newItem.name = sc.next();
			System.out.print("��������ˮ���ı��:");
			newItem.ID = sc.nextInt();
			System.out.print("��������ˮ������:");
			newItem.price = sc.nextDouble();
			
			//����Ｏ��������µ���Ʒ��
			list.add(newItem);
	}
	
	public static void delFruitItem(ArrayList<FruitItem> list) {
		System.out.print("��������Ҫɾ����ˮ�����:");
		Scanner sc = new Scanner(System.in);//�����������
		int fruitID = sc.nextInt();
		//ɾ������Ԫ��
		for (int i = 0; i < list.size(); i++) {
			FruitItem thisItem = list.get(i);
			if(thisItem.ID == fruitID) {
				list.remove(thisItem);
				System.out.println("ˮ����Ϣɾ�����!");
				return;
			}
		}
		System.out.println("�Բ���û�������ŵ�ˮ��!");
	}
	
	public static void updateFruitItem(ArrayList<FruitItem> list) {
		
		System.out.println();
		System.out.print("��������Ҫ�޸���Ϣ��ˮ�����:");
		
		Scanner sc = new Scanner(System.in);//�����������
		int fruitID = sc.nextInt();
		
		//���¼���Ԫ��
		for (int i = 0; i < list.size(); i++) {
			
			FruitItem thisItem = list.get(i);
			if(thisItem.ID == fruitID) {
				System.out.print("�������µ�ˮ��ID:");
				thisItem.ID = sc.nextInt();
				System.out.print("�������µ�ˮ������:");
				thisItem.name = sc.next();
				System.out.print("�������µ�ˮ������:");
				thisItem.price = sc.nextDouble();
				System.out.println("ˮ����Ϣ�������!");
				return;
			}
		}
		System.out.println("�Բ���û�������ŵ�ˮ��!");
	}
}
