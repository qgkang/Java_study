public class Person {
    private String name;
    private int age;

    //��������
    {
        System.out.println("��������ִ����");
    }
    Person(){
        System.out.println("Person�޲����Ĺ��캯��ִ��");
    }
    Person(int age){
        this.age = age;
        System.out.println("Person��age�������Ĺ��캯��ִ��");
    }
}