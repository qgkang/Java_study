public class ChuShi extends Employee implements VIP{
    public ChuShi(){}
    public ChuShi(String name, String id){
        super(name,id);
    }
    public void work(){
        System.out.println("�����������ĳ԰ɣ���������");
    }

    public void services(){
        System.out.println("���˼�������");
    }
}