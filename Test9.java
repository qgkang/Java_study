class SuperClass {
    private int n;
    //子类不能继承父类的构造器
    //但是父类的构造器带有参数的，则必须在子类的构造器中显式地通过super关键字调用父类的构造器,并配以适当的参数列表
    //如果父类有无参构造器,系统会自动调用父类的无参构造器
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}
class SubClass extends SuperClass{
    private int n;

    SubClass(){
        //new SubClass()的调用的构造方法
        super(300);//SuperClass(int n)
        System.out.println("SubClass");//SubClass
    }

    public SubClass(int n){
        //new SubClass(200)调用的构造方法
        System.out.println("SubClass(int n):"+n);//SubClass(int n):200
        this.n = n;
    }
}
public class TestSuperSub{
    public static void main (String args[]){
        SubClass sc = new SubClass();//
        SubClass sc2 = new SubClass(200);
    }
}
