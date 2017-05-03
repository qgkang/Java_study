public class StaticTest{
    private static int staticInt = 2;
    private int random = 2;
    //构造方法名，类名，文件名都一样
    public StaticTest(){
        staticInt++;
        random++;
        System.out.println("staticInt = "+staticInt+"  random = "+random);
    }

    public static void main(String args[]){
        StaticTest test = new StaticTest();
        StaticTest test1 = new StaticTest();
        StaticTest test2 = new StaticTest();
    }
}
/*staticInt = 3  random = 3
staticInt = 4  random = 3
staticInt = 5  random = 3*/

