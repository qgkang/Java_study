public class FuWuYuan extends Employee implements VIP{
    public FuWuYuan(){
        super();
    }

    public FuWuYuan(String name, String id){
        super(name,id);
    }

    public void work(){
        System.out.println("����Ա���ϲ�");
    }

    public void services(){
        System.out.println("����Ա���˿͵���");
    }
}