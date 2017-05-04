public class InstanceCounter{
    private static int num =0;
    protected static int getCount(){
        return num;
    }
    private static void addNum(){
        //没有返回值用void
        num++;
    }
    InstanceCounter(){
        InstanceCounter.addNum();
    }
    public static void main(String[] args){
        System.out.println("start:"+InstanceCounter.getCount());
        for(int i =0;i<10;i++){
            new InstanceCounter();
        }
        System.out.println("end:"+InstanceCounter.getCount());
    }
}