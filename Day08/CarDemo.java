public class CarDemo {
    public static void main(String[] args) {
		/*
		 *  测试：Car类中的run方法。
		 */
        // 1,创建Car的对象。给对象起个名字。
        // c是类类型的变量。c指向了一个具体的Car类型的对象。
        Car c = new Car();
        // 2,通过已有的对象调用该对象的功能。格式：对象.对象成员;
        // 3,可以该对象的属性赋值。
        c.color = "red";
        c.number = 4;
        c.run();
    }
}
