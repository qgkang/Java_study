public class ChuShi extends Employee implements VIP{
    public ChuShi(){}
    public ChuShi(String name, String id){
        super(name,id);
    }
    public void work(){
        System.out.println("我做饭，放心吃吧，包您满意");
    }

    public void services(){
        System.out.println("做菜加量加料");
    }
}