public class FuWuYuan extends Employee implements VIP{
    public FuWuYuan(){
        super();
    }

    public FuWuYuan(String name, String id){
        super(name,id);
    }

    public void work(){
        System.out.println("服务员在上菜");
    }

    public void services(){
        System.out.println("服务员给顾客倒酒");
    }
}