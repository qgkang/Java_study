import java.util.Scanner;
import java.util.ArrayList;
public class Inventory{
	/**
	 * �������ܲ˵�
	 * @return ����Ա��������Ĺ��ܲ������ 
	 */
	public static int chooseFunction() {
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		//���ռ�������Ĺ���ѡ�����
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		return choose;
	}

	public static void main(String[] args) {
		//��¼�����Ʒ��Ϣ
		ArrayList<Goods> list = new ArrayList<Goods>();
		//�����Ʒ�����
		addStore(list);
		
		//ͨ��whileѭ��ģ�����Ա���й����ظ�ѡ�����
		while (true) {
			//��ӡ���ܲ˵�����,���ռ�������Ĺ���ѡ�����
			int choose = chooseFunction();
			//ִ����Ŷ�Ӧ�Ĺ���
			switch (choose) {
			case 1://�鿴����嵥
				printStore(list);
				break;
			case 2://�޸���Ʒ�������
				update(list);
				break;
			case 3://�˳�
				exit();
				return;
			default:
				System.out.println("----------------------------------");
				System.out.println("����ѡ��������������ȷ�Ĺ������!");
				break;
			}
		}
	}

	/*
	   ���巽��,����Ʒ����Ϣ�洢��������
	   ���������з����Ĺ�������,��������
	*/
	public static void addStore (ArrayList<Goods> list){
		//������Ʒ���ͱ��� Goods���͵ı���
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		g1.brand = "MacBook";
		g1.size = 13.3;
		g1.price = 9999.99;
		g1.count = 3;
		
		g2.brand = "Thinkpad";
		g2.size = 15.6;
		g2.price = 7999.99;
		g2.count = 1;
		
		//Goods���͵ı���,�洢��������
		list.add(g1);
		list.add(g2);
	}

	/**
	 * �鿴����嵥
	 */
	public static void printStore(ArrayList<Goods> list) {
		//ͳ���ܿ�������ͳ�ƿ���ܽ��
		int totalCount = 0;
		double totalMoney = 0.0;
		//�б���
		System.out.println("---------------------------�鿴����嵥--------------------------");
		System.out.println("Ʒ��    �ͺ�	�ߴ�	�۸�	�����");
		//�б��в�
		for (int i = 0; i <list.size() ; i++) {
			Goods item = list.get(i);
			System.out.println(item.brand+"	  "+item.size+"  "+item.price+"  "+ item.count);
			//ͳ���ܿ�������ͳ�ƿ���ܽ��
			totalCount += item.count;
			totalMoney += item.count * item.price;
		}
		//�б�ײ�
		System.out.println("-------------------------------------------------------------");
		System.out.println("�ܿ������"+totalCount); 
		System.out.println("�����Ʒ�ܽ�"+totalMoney);
	}

	/**
	 * �޸���Ʒ�������
	 */
	public static void update(ArrayList<Goods> list){
		System.out.println("------------�޸���Ʒ�������-----------");
		for (int i = 0; i < list.size(); i++) {
			Goods item = list.get(i);
			System.out.println("������"+ item.brand +"��Ʒ�������");
			item.count = new Scanner(System.in).nextInt();
			list.set(i,item);
		}
	}
	/**
	 * �˳�
	 */
	public static void exit(){
		System.out.println("----------------�˳�---------------");
		System.out.println("�����˳�ϵͳ");
	}	
}

